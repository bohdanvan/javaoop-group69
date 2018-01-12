package com.bvan.oop.lesson9.set;

import com.bvan.oop.lesson6.enum_example.Genre;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final Set<Genre> genres = new LinkedHashSet<>();

    public Movie(String title) {
        this.title = title;
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public boolean containsGenre(Genre genre) {
        return genres.contains(genre);
    }

    public String getTitle() {
        return title;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genres=" + genres +
                '}';
    }
}
