package it.cs.unicam.progettomadeinitaly.api.contents.products;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;

/**
 * Represents a product in the supply chain
 * @author Alessandro Pascucci
 */
public abstract class Product implements Content {

    private int id;

    private boolean published;

    private final String author;

    public Product(int id, String author) {
        if (id < 0)
            throw new IllegalArgumentException("id can not be negative");
        if (author == null)
            throw new NullPointerException("author can not be null");
        this.id = id;
        this.author = author;
        this.published = false;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isPublished() {
        return this.published;
    }

    @Override
    public void publish() {
        this.published = true;
    }

    @Override
    public String getAuthor() { return this.author; }

}

