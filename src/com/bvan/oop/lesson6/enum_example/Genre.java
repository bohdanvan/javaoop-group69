package com.bvan.oop.lesson6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    COMEDY("Funny"),
    THRILLER("Thrilled"),
    DRAMA("About life"),
    SCI_FI("About future");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 2);
    }

    public String getDescription() {
        return description;
    }
}
