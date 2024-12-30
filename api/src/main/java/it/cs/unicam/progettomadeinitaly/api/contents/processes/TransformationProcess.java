package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a transformation process in the supply chain
 * @author Alessandro Pascucci
 */
public class TransformationProcess implements Content {

    private int id;

    private String name;

    private String description;

    private boolean published;

    private String author;

    private List<TransformationPhase> phasesOfTransformation;

    public TransformationProcess(int id, String author) {
        if (id < 0)
            throw new IllegalArgumentException("id can not be negative");
        if (author == null)
            throw new NullPointerException("A transformation process must have an author");
        this.id = id;
        this.author = author;
        this.published = false;
    }

    @Override
    public int getId() {
       return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new NullPointerException("name can not be null");
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (description == null)
            throw new NullPointerException("description can not be null");
        this.description = description;
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
    public String getAuthor() {
        return this.author;
    }

    public List<TransformationPhase> getPhasesOfTransformation() {
        return new ArrayList<>(this.phasesOfTransformation);
    }

}
