package it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.ProductOnSale;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alessandro Pascucci
 */
public class ProductPackage extends Product {

    private String name;

    private String description;

    private List<Product> products;

    public ProductPackage(String author, String name, String description) {
        super(author);
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        for (Product product : products)
            if (ProductOnSale.class.isAssignableFrom(product.getClass()))
                throw new IllegalArgumentException("Found a product on sale. " +
                        "Products on sale cannot be added to a product package.");
        this.products = products;
    }

}
