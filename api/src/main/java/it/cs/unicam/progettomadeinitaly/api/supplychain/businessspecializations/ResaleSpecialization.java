package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.ProductOnSale;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pietro Villa
 */
public class ResaleSpecialization extends BusinessSpecialization {

    private final List<ProductOnSale> productsOnSale;

    public ResaleSpecialization() {
        super("RESALE_SPECIALIZATION");
        productsOnSale = new ArrayList<>();
    }

    public boolean addProductOnSale(ProductOnSale productOnSale) {
        if (productOnSale == null)
            throw new NullPointerException("Cannot add null to products on sale");
        return productsOnSale.add(productOnSale);
    }

    public List<ProductOnSale> getProductsOnSale() {
        return productsOnSale;
    }

}
