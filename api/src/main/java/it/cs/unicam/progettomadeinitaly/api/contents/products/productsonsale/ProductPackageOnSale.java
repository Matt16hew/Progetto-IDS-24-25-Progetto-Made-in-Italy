package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;

import java.util.List;

/**
 * Represents a product package on sale in the supply chain
 * @author Alessandro Pascucci
 */
public class ProductPackageOnSale extends ProductOnSale<ProductPackage> {

    public ProductPackageOnSale(int id, String author, ProductPackage productPackage, float price, int quantity) {
        super(id, author, productPackage, price, quantity);
    }

    public List<Product> getProducts() {
        return this.productSetOnSale.getProducts();
    }

}
