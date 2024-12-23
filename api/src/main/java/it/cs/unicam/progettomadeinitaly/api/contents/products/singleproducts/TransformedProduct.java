package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;

/**
 * @author Alessandro Pascucci
 */
public class TransformedProduct extends SingleProduct {

    private TransformationProcess transformationProcess;

    public TransformedProduct(String author, String name, String description, String certification, String variety) {
        super(author, name, description, certification, variety);
    }

    public TransformationProcess getTransformationProcess() {
        return transformationProcess;
    }

    public void setTransformationProcess(TransformationProcess transformationProcess) {
        if (transformationProcess == null)
            throw new NullPointerException("Transformed product cannot have a null transformation process");
        this.transformationProcess = transformationProcess;
    }

}
