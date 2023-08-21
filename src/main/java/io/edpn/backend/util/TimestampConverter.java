package io.edpn.backend.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

public class TimestampConverter {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;

    private TimestampConverter() {
    }

    public static LocalDateTime convertToLocalDateTime(String timestamp) {
        try {
            TemporalAccessor zonedDateTime = formatter.parseBest(timestamp, ZonedDateTime::from,
                    LocalDateTime::from);
            return LocalDateTime.from(zonedDateTime)
                    .atOffset(ZoneOffset.UTC)
                    .toLocalDateTime();
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("Invalid timestamp format: " + timestamp, ex);
        }
    }
}

