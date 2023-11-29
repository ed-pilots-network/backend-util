package io.edpn.backend.util;

public interface Topic {

    enum Request {
        STATION_ARRIVAL_DISTANCE("stationArrivalDistanceRequest"),
        STATION_MAX_LANDING_PAD_SIZE("stationMaxLandingPadSizeRequest"),
        STATION_IS_PLANETARY("stationIsPlanetaryRequest"),
        STATION_REQUIRE_ODYSSEY("stationRequireOdysseyRequest"),
        SYSTEM_COORDINATES("systemCoordinatesRequest"),
        SYSTEM_ELITE_ID("systemEliteIdRequest");

        private final String topicName;

        Request(String topicName) {
            this.topicName = topicName;
        }

        public String getTopicName() {
            return topicName;
        }
    }

    enum Response {
        STATION_ARRIVAL_DISTANCE("%s_stationArrivalDistanceResponse"),
        STATION_MAX_LANDING_PAD_SIZE("%s_stationMaxLandingPadSizeResponse"),
        STATION_IS_PLANETARY("%s_stationIsPlanetaryResponse"),
        STATION_REQUIRE_ODYSSEY("%s_stationRequireOdysseyResponse"),
        SYSTEM_COORDINATES("%s_systemCoordinatesResponse"),
        SYSTEM_ELITE_ID("%s_systemEliteIdResponse");

        private final String topicName;

        Response(String topicName) {
            this.topicName = topicName;
        }

        public String getFormattedTopicName(Module module) {
            return String.format(topicName, module.getName());
        }
    }

    enum EDDN {
        COMMODITY_V3("https___eddn.edcd.io_schemas_commodity_3"),
        NAVROUTE_V1("https___eddn.edcd.io_schemas_navroute_1"),
        JOURNAL_V1_SCAN("https___eddn.edcd.io_schemas_journal_1_scan"),
        JOURNAL_V1_DOCKED("https___eddn.edcd.io_schemas_journal_1_docked");

        private final String topicName;

        EDDN(String topicName) {
            this.topicName = topicName;
        }

        public String getTopicName() {
            return topicName;
        }
    }
}
