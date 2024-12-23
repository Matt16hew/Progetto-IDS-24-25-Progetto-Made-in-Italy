package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pietro Villa
 */
public class ProductionSpecialization extends BusinessSpecialization {

    private final List<RawProduct> rawProducts;

    public ProductionSpecialization() {
        super("PRODUCTION_SPECIALIZATION");
        this.rawProducts = new ArrayList<>();
    }

    public boolean addRawProduct(RawProduct rawProduct) {
        if (rawProduct == null)
            throw new NullPointerException("Cannot add null to raw products");
        return this.rawProducts.add(rawProduct);
    }

    public List<RawProduct> getRawProducts() {
        return rawProducts;
    }

}
