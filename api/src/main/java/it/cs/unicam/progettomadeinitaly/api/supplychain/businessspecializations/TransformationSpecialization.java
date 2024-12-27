package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;
import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a specialization in transformation that a supply chain point may have.
 * A supply chain point that has a transformation specialization can manage transformed
 * products and transformation processes.
 *
 * @author Pietro Villa
 */
public class TransformationSpecialization extends BusinessSpecialization {

    private final List<TransformedProduct> transformedProducts;

    private final List<TransformationProcess> transformationProcesses;

    public TransformationSpecialization() {
        super(DefaultSpecializationNames.TRANSFORMATION_SPECIALIZATION.getName());
        this.transformedProducts = new ArrayList<>();
        this.transformationProcesses = new ArrayList<>();
    }

    @Override
    public boolean addContent(Content content) {
        if (content == null)
            throw new NullPointerException("Attempt at adding null as content");
        if (TransformedProduct.class.isAssignableFrom(content.getClass()))
            return this.transformedProducts.add((TransformedProduct) content);
        else if (TransformationProcess.class.isAssignableFrom(content.getClass()))
            return this.transformationProcesses.add((TransformationProcess) content);
        else
            throw new IllegalArgumentException("Attempt at adding a content that is not" +
                    " a TransformedProduct or a TransformationProcess");
    }

    public List<TransformedProduct> getTransformedProducts() {
        return this.transformedProducts;
    }

    public List<TransformationProcess> getTransformationProcesses() {
        return this.transformationProcesses;
    }

}
