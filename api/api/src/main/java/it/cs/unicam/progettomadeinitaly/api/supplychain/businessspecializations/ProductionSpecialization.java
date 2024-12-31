package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a specialization in production that a supply chain point may have.
 * A supply chain point that has a production specialization can manage raw products.
 *
 * @author Pietro Villa
 */
public class ProductionSpecialization extends BusinessSpecialization {

    private final List<RawProduct> rawProducts;

    public ProductionSpecialization() {
        super(DefaultSpecializationNames.PRODUCTION_SPECIALIZATION.getName());
        this.rawProducts = new ArrayList<>();
    }

    @Override
    public boolean addContent(Content content) {
        if (content == null)
            throw new NullPointerException("Attempt at adding null as content");
        if (! RawProduct.class.isAssignableFrom(content.getClass()))
            throw new IllegalArgumentException("Attempt to add content of type different from RawProduct");
        RawProduct rawProduct = (RawProduct) content;
        return this.rawProducts.add(rawProduct);
    }

    public List<RawProduct> getRawProducts() {
        return this.rawProducts;
    }

}
