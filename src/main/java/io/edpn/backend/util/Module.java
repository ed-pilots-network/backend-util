package io.edpn.backend.util;

public enum Module {
    TRADE("trade"),
    BUILD("build"),
    EXPLORATION("exploration"),
    BGS("bgs");

    private final String name;

    Module(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
