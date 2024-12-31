package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;
import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.ProductOnSale;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a specialization in resale that a supply chain point may have.
 * A supply chain point that has a resale specialization can manage products on sale.
 *
 * @author Pietro Villa
 */
public class ResaleSpecialization extends BusinessSpecialization {

    private final List<ProductOnSale<? extends Product>> productsOnSale;

    public ResaleSpecialization() {
        super(DefaultSpecializationNames.RESALE_SPECIALIZATION.getName());
        this.productsOnSale = new ArrayList<>();
    }

    @Override
    public boolean addContent(Content content) {
        if (content == null)
            throw new NullPointerException("Cannot add null to products on sale");
        if (! ProductOnSale.class.isAssignableFrom(content.getClass()))
            throw new IllegalArgumentException("Content is not a ProductOnSale");
        ProductOnSale<? extends Product> productOnSale = (ProductOnSale<? extends Product>) content;
        return this.productsOnSale.add(productOnSale);
    }

    public List<ProductOnSale<? extends Product>> getProductsOnSale() {
        return this.productsOnSale;
    }

}
