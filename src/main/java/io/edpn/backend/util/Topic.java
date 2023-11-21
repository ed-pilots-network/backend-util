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

        public static class Constants {
            public static final String TRADE_STATION_ARRIVAL_DISTANCE = Response.STATION_ARRIVAL_DISTANCE.getFormattedTopicName(Module.TRADE);
            public static final String TRADE_STATION_MAX_LANDING_PAD_SIZE = Response.STATION_MAX_LANDING_PAD_SIZE.getFormattedTopicName(Module.TRADE);
            public static final String TRADE_STATION_IS_PLANETARY = Response.STATION_IS_PLANETARY.getFormattedTopicName(Module.TRADE);
            public static final String TRADE_STATION_REQUIRE_ODYSSEY = Response.STATION_REQUIRE_ODYSSEY.getFormattedTopicName(Module.TRADE);
            public static final String TRADE_SYSTEM_COORDINATES = Response.SYSTEM_COORDINATES.getFormattedTopicName(Module.EXPLORATION);
            public static final String TRADE_SYSTEM_ELITE_ID = Response.SYSTEM_ELITE_ID.getFormattedTopicName(Module.EXPLORATION);
        }
    }
}
