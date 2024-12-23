package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pietro Villa
 */
public class DistributionSpecialization extends BusinessSpecialization {

    private final List<Product> products;

    public DistributionSpecialization() {
        super("DISTRIBUTION_SPECIALIZATION");
        products = new ArrayList<>();
    }

    public boolean addProductPackage(ProductPackage productPackage) {
        if (productPackage == null)
            throw new NullPointerException("Cannot add null to products");
        return products.add(productPackage);
    }

    // TODO possibile aggiunta nelle future iterazioni
    public boolean receiveProduct(Product product) {
        if (product == null)
            throw new NullPointerException("Cannot add null to products");
        return products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

}
