package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

/**
 * @author Alessandro Pascucci
 */
public abstract class ProductOnSale<T extends Product> extends Product {

    protected T product;

    private float price;

    private int quantity;

    public ProductOnSale(String author, T product, float price, int quantity) {
        super(author);
        // Works only at runtime
        // TODO forse non serve perchè nei decorator concreti passiamo direttamente un prodotto non in vendita, ma possiamo lasciarlo per rendere sicura la estensione
        if (ProductOnSale.class.isAssignableFrom(product.getClass()))
            throw new IllegalArgumentException("Product of type ProductOnSale is not allowed.");
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.product.getName();
    }

    @Override
    public String getDescription() {
        return this.product.getDescription();
    }

    @Override
    public String getAuthor() {
        return this.product.getAuthor();
    }

    @Override
    public boolean isPublished() {
        return super.isPublished();
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Inserisco i setter

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProduct(T product) {
        this.product = product;
    }

}
