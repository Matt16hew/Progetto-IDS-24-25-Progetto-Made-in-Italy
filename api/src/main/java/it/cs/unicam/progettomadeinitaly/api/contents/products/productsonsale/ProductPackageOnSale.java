package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;

// TODO rivedere
/**
 * @author Alessandro Pascucci
 */
public class ProductPackageOnSale extends ProductOnSale<ProductPackage> {

    public ProductPackageOnSale(String author, ProductPackage productPackage, float price, int quantity) {
        super(author, productPackage, price, quantity);
    }

    /**
    public List<Product> getProducts() {

    }
     */

}
