package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;
import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.ProductOnSale;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a specialization in distribution that a supply chain point may have.
 * A supply chain point that has a distribution specialization can manage products that are not on sale
 * in addition to product packages.
 *
 * @author Pietro Villa
 */
public class DistributionSpecialization extends BusinessSpecialization {

    private final List<Product> products;

    public DistributionSpecialization() {
        super(DefaultSpecializationNames.DISTRIBUTION_SPECIALIZATION.getName());
        this.products = new ArrayList<>();
    }

    @Override
    public boolean addContent(Content content) {
        if (content == null)
            throw new NullPointerException("Attempt at adding null as content");
        else if (ProductOnSale.class.isAssignableFrom(content.getClass()))
            throw new IllegalArgumentException("Attempt at adding a ProductOnSale");
        else if (Product.class.isAssignableFrom(content.getClass()))
            return this.products.add((Product) content);
        else
            throw new IllegalArgumentException("Attempt at adding a content that is not a Product");
    }

    public List<Product> getProducts() {
        return this.products;
    }

}
