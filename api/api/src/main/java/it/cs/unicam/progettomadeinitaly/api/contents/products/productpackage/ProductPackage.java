package it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale.ProductOnSale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a package in the supply chain
 * @author Alessandro Pascucci
 */
public class ProductPackage extends Product {

    private String name;

    private String description;

    private final List<Product> products;

    public ProductPackage(int id, String author) {
        super(id, author);
        this.products = new ArrayList<>();
    }

    /**
     * Adds products to this product package
     *
     * @throws NullPointerException if products are null
     * @throws NullPointerException if a null product is present in products param
     * @throws IllegalArgumentException if products contains a ProductOnSale occurrence
     * @param products the products to add to this product package
     * @return true if the products have been added successfully
     */
    public boolean addProducts(List<Product> products) {
        if (products == null)
            throw new NullPointerException("Cannot add null to a product package");
        if (products.isEmpty())
            throw new IllegalArgumentException("Cannot add an empty list to a product package");
        for (Product product : products)
            this.addProduct(product);
        return true;
    }

    /**
     * Adds a product to this product package
     *
     * @param product the product to add to this product package
     * @throws NullPointerException if a product is null
     * @throws IllegalArgumentException if a product is a product on sale
     * @return true if the products have been added successfully
     */
    public boolean addProduct(Product product) {
        if (product == null)
            throw new NullPointerException("Cannot add null to a product package");
        if (ProductOnSale.class.isAssignableFrom(product.getClass()))
            throw new IllegalArgumentException("Products on sale cannot be added to a product package");
        return this.products.add(product);
    }

    @Override
    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        if (name == null)
            throw new NullPointerException("A product package must have a name");
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        if (description == null)
            throw new NullPointerException("A product package must have a description");
        this.description = description;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

}
