package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a product package on sale in the supply chain
 * @author Alessandro Pascucci
 */
public class ProductPackageOnSale extends ProductOnSale<ProductPackage> {

    public ProductPackageOnSale(int id, String author, ProductPackage productPackage) {
        super(id, author, productPackage);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(this.productSetOnSale.getProducts());
    }

}
