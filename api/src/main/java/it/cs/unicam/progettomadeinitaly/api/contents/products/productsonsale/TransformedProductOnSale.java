package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;

/**
 * @author Alessandro Pascucci
 */
public class TransformedProductOnSale extends ProductOnSale<TransformedProduct> {

    public TransformedProductOnSale(String author, TransformedProduct transformedProduct, float price, int quantity) {
        super(author, transformedProduct, price, quantity);
    }

    public String getCertification() {
        return this.product.getCertification();
    }

    public String getVariety() {
        return this.product.getVariety();
    }

    public TransformationProcess getTransformationProcess() {
        return this.product.getTransformationProcess();
    }

}
