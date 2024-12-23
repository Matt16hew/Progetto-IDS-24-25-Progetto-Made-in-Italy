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
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCertification() {
        return certification;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void addProducer(Producer producer) {
        producers.add(producer);
    }

}
