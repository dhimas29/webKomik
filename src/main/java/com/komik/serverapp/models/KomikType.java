package com.komik.serverapp.models;

public enum KomikType {
    MANHUA("MANHUA"),
    MANHWA("MANHWA"),
    MANGA("MANGA");

    private final String name;

    KomikType(String name) {
        this.name = name;
    }
}
