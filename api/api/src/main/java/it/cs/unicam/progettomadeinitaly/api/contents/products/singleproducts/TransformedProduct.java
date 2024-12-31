package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;

/**
 * Represents a transformed product in the supply chain
 * @author Alessandro Pascucci
 */
public class TransformedProduct extends SingleProduct {

    private TransformationProcess transformationProcess;

    public TransformedProduct(int id, String author) {
        super(id, author);
    }

    public TransformationProcess getTransformationProcess() {
        return this.transformationProcess;
    }

    public void setTransformationProcess(TransformationProcess transformationProcess) {
        if (transformationProcess == null)
            throw new NullPointerException("A transformed product must have a transformation process");
        this.transformationProcess = transformationProcess;
    }

}
