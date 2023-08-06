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
        STATION_ARRIVAL_DISTANCE_RESPONSE("stationArrivalDistanceResponse"),
        STATION_MAX_LANDING_PAD_SIZE_RESPONSE("stationMaxLandingPadSizeResponse"),
        STATION_IS_PLANETARY_RESPONSE("stationIsPlanetaryResponse"),
        STATION_REQUIRE_ODYSSEY_RESPONSE("stationRequireOdysseyResponse"),
        SYSTEM_COORDINATES_RESPONSE("systemCoordinatesResponse"),
        SYSTEM_ELITE_ID_RESPONSE("systemEliteIdResponse");

        private final String topicName;

        Response(String topicName) {
            this.topicName = topicName;
        }

        public String getTopicName() {
            return topicName;
        }
    }
}
