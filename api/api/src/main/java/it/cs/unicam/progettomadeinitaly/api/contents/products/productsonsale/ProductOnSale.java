package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

/**
 * Represents a product on sale in the supply chain.
 *
 * Note: This abstract class has a default constructor
 *       that does not permit the creation of products
 *       on sale of products already on sale.
 *
 * @param <T> The type of product that will be set on sale </T>
 * @author Alessandro Pascucci
 */
public abstract class ProductOnSale<T extends Product> extends Product {

    protected T productSetOnSale;

    private float price;

    private int quantity;

    public ProductOnSale(int id, String author, T product) {
        super(id, author);
        if (product == null)
            throw new NullPointerException("Product cannot be null");
        if (ProductOnSale.class.isAssignableFrom(product.getClass()))
            throw new IllegalArgumentException("Product of type ProductOnSale is not allowed.");
        this.productSetOnSale = product;
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

    public void setPrice(float price) {
        if (price <= 0)
            throw new IllegalArgumentException("Price cannot be negative or 0");
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

}
