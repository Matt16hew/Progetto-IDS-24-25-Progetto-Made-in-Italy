package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;

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

    public TransformationProcess(int id, String name, String description, String author, List<TransformationPhase> phasesOfTransformation) {
        if (id < 0)
            throw new IllegalArgumentException("id can not be negative");
        if (name == null)
            throw new NullPointerException("A transformation process must have a name");
        if (description == null)
            throw new NullPointerException("A transformation process must have a description");
        if (author == null)
            throw new NullPointerException("A transformation process must have an author");
        this.id = id;
        this.name = name;
        this.description = description;
        this.published = false;
        this.author = author;
        this.phasesOfTransformation = phasesOfTransformation;
    }

    @Override
    public int getId() {
       return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
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
        return this.phasesOfTransformation;
    }


}
