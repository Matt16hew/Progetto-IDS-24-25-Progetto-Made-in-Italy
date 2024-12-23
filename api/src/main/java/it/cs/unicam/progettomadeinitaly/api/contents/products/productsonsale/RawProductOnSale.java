package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

/**
 * @author Alessandro Pascucci
 */
public class RawProductOnSale extends ProductOnSale<RawProduct> {

    public RawProductOnSale(String author, RawProduct rawProduct, float price, int quantity) {
        super(author, rawProduct, price, quantity);
    }

    public String getCertification() {
        return this.product.getCertification();
    }

    public String getVariety() {
        return this.product.getVariety();
    }

    public String getProductionMethod() {
        return this.product.getProductionMethod();
    }

}
