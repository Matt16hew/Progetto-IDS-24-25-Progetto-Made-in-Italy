package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;

/**
 * Represents a transformed product on sale in the supply chain
 * @author Alessandro Pascucci
 */
public class TransformedProductOnSale extends ProductOnSale<TransformedProduct> {

    public TransformedProductOnSale(int id, String author, TransformedProduct transformedProduct, float price, int quantity) {
        super(id, author, transformedProduct, price, quantity);
    }

    public String getCertification() {
        return this.productSetOnSale.getCertification();
    }

    public String getVariety() {
        return this.productSetOnSale.getVariety();
    }

    public TransformationProcess getTransformationProcess() {
        return this.productSetOnSale.getTransformationProcess();
    }

}
