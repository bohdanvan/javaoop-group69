package com.bvan.oop.lesson7.generic.format;

/**
 * @author bvanchuhov
 */
public class Music {

    private final String title;
    private final String author;

    public Music(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
