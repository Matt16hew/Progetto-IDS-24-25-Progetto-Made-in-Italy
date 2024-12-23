package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

/**
 * Represents a product on sale in the supply chain
 * @param <T> The type of product that will be set on sale </T>
 * @author Alessandro Pascucci
 */
public abstract class ProductOnSale<T extends Product> extends Product {

    protected T productSetOnSale;

    private float price;

    private int quantity;

    public ProductOnSale(int id, String author, T product, float price, int quantity) {
        super(id, author);
        if (product == null)
            throw new NullPointerException("Product cannot be null");
        if (ProductOnSale.class.isAssignableFrom(product.getClass()))
            throw new IllegalArgumentException("Product of type ProductOnSale is not allowed.");
        if (price <= 0.0)
            throw new IllegalArgumentException("Price cannot be negative or 0");
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");
        this.productSetOnSale = product;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.productSetOnSale.getName();
    }

    @Override
    public String getDescription() {
        return this.productSetOnSale.getDescription();
    }

    public float getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // Inserisco i setter

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProduct(T product) {
        this.productSetOnSale = product;
    }

}
