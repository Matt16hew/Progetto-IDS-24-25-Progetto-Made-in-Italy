package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import it.cs.unicam.progettomadeinitaly.api.users.roles.Producer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alessandro Pascucci
 */
public class TransformationPhase {

    private String name;

    private String description;

    private String certification;

    private List<Producer> producers;

    public TransformationPhase(String name, String description, String certification) {
        this.name = name;
        this.description = description;
        this.certification = certification;
        this.producers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCertification() {
        return this.certification;
    }

    public List<Producer> getProducers() {
        return this.producers;
    }

    public boolean addProducts(List<Producer> producers) {
        if(producers == null)
            throw new NullPointerException("Cannot add null producers");
        if (producers.isEmpty())
            throw new IllegalArgumentException("Cannot add an empty list to producers");
        for (Producer producer : producers)
            this.addProducer(producer);
        return true;
    }

    public boolean addProducer(Producer producer) {
        if (producer == null)
            throw new NullPointerException("Cannot add null producers");
        return this.producers.add(producer);
    }

}
