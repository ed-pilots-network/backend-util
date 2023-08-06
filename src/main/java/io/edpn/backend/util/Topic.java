package io.edpn.backend.util;

public interface Topic {

    enum Request {
        STATION_ARRIVAL_DISTANCE_REQUEST("stationArrivalDistanceRequest"),
        STATION_MAX_LANDING_PAD_SIZE_REQUEST("stationMaxLandingPadSizeRequest"),
        STATION_IS_PLANETARY_REQUEST("stationIsPlanetaryRequest"),
        STATION_REQUIRE_ODYSSEY_REQUEST("stationRequireOdysseyRequest"),
        SYSTEM_COORDINATES_REQUEST("systemCoordinatesRequest"),
        SYSTEM_ELITE_ID_REQUEST("systemEliteIdRequest");

        private final String topicName;

        Request(String topicName) {
            this.topicName = topicName;
        }

        public String getTopicName() {
            return topicName;
        }
    }

    enum Response {
        STATION_ARRIVAL_DISTANCE_RESPONSE("%s_stationArrivalDistanceResponse"),
        STATION_MAX_LANDING_PAD_SIZE_RESPONSE("%s_stationMaxLandingPadSizeResponse"),
        STATION_IS_PLANETARY_RESPONSE("%s_stationIsPlanetaryResponse"),
        STATION_REQUIRE_ODYSSEY_RESPONSE("%s_stationRequireOdysseyResponse"),
        SYSTEM_COORDINATES_RESPONSE("%s_systemCoordinatesResponse"),
        SYSTEM_ELITE_ID_RESPONSE("%s_systemEliteIdResponse");

        private final String topicName;

        Response(String topicName) {
            this.topicName = topicName;
        }

        public String getFormattedTopicName(String module) {
            return String.format(topicName, module);
        }
    }
}
