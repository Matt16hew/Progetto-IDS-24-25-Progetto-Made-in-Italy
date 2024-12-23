package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pietro Villa
 */
public class TransformationSpecialization extends BusinessSpecialization {

    private final List<TransformedProduct> transformedProducts;

    private final List<TransformationProcess> transformationProcesses;

    public TransformationSpecialization() {
        super("TRANSFORMATION_SPECIALIZATION");
        transformedProducts = new ArrayList<>();
        transformationProcesses = new ArrayList<>();
    }

    public boolean addTransformedProduct(TransformedProduct transformedProduct) {
        if (transformedProduct == null)
            throw new NullPointerException("Cannot add null to transformed products");
        return transformedProducts.add(transformedProduct);
    }

    public boolean addTransformationProcess(TransformationProcess transformationProcess) {
        if (transformationProcess == null)
            throw new NullPointerException("Cannot add null to transformation processes");
        return transformationProcesses.add(transformationProcess);
    }

    public List<TransformedProduct> getTransformedProducts() {
        return transformedProducts;
    }

    public List<TransformationProcess> getTransformationProcesses() {
        return transformationProcesses;
    }

}
