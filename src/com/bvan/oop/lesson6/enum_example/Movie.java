package com.bvan.oop.lesson6.enum_example;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final List<Genre> genre;

    public Movie(String title, List<Genre> genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
