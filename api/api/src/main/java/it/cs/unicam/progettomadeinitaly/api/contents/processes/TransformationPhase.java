package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a transformation phase of a transformation process
 *
 * @author Alessandro Pascucci
 */
public class TransformationPhase {

    private String name;

    private String description;

    private String certification;

    private List<String> producerNames;

    public TransformationPhase(String name, String description, String certification) {
        if (name == null)
            throw new NullPointerException("A transformation phase must have a name");
        if (description == null)
            throw new NullPointerException("A transformation phase must have a description");
        if (certification == null)
            throw new NullPointerException("A transformation phase must have a certification");
        this.name = name;
        this.description = description;
        this.certification = certification;
        this.producerNames = new ArrayList<>();
    }

    /**
     * Associates producers to this transformation phase.
     *
     * @param producerNames the names of producers that will be associated to this
     *                      transformation phase.
     * @throws NullPointerException if producerNames is null.
     * @throws IllegalArgumentException if producerNames is empty.
     * @return true if the operation has been successfully completed.
     */
    public boolean addProducers(List<String> producerNames) {
        return this.producerNames.addAll(producerNames);
    }

    /**
     * Associates a producer to this transformation phase.
     *
     * @param producerName the name of the producer that will be associated to this
     *                     transformation phase.
     * @throws NullPointerException if the name of the producer is null.
     * @return true if the operation has been successfully completed.
     */
    public boolean addProducer(String producerName) {
        return this.producerNames.add(producerName);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new NullPointerException("A transformation phase must have a name");
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (description == null)
            throw new NullPointerException("A transformation phase must have a description");
        this.description = description;
    }

    public String getCertification() {
        return this.certification;
    }

    public void setCertification(String certification) {
        if (certification == null)
            throw new NullPointerException("A transformation phase must have a certification");
        this.certification = certification;
    }

    /**
     * Returns the list of names of producers associated to this transformation phase
     * @return a list of names of producers associated to this transformation phase
     */
    public List<String> getProducers() {
        return new ArrayList<>(this.producerNames);
    }

}
