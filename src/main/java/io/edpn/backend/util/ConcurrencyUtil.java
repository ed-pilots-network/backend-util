package io.edpn.backend.util;

import java.util.Objects;
import java.util.function.Consumer;

public class ConcurrencyUtil {

    public static Runnable errorHandlingWrapper(Runnable action, Consumer<Exception> errorHandler) {
        return () -> {
            try {
                action.run();
            } catch (Exception e) {
                if (Objects.nonNull(errorHandler)) {
                    errorHandler.accept(e);
                } else {
                    e.printStackTrace();
                }
            }
        };
    }
}
