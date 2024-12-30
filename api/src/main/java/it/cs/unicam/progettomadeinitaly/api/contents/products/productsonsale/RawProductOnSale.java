package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

/**
 * Represents a raw product on sale in the supply chain
 * @author Alessandro Pascucci
 */
public class RawProductOnSale extends ProductOnSale<RawProduct> {

    public RawProductOnSale(int id, String author, RawProduct rawProduct) {
        super(id, author, rawProduct);
    }

    public String getCertification() {
        return this.productSetOnSale.getCertification();
    }

    public String getVariety() {
        return this.productSetOnSale.getVariety();
    }

    public String getProductionMethod() {
        return this.productSetOnSale.getProductionMethod();
    }

}
