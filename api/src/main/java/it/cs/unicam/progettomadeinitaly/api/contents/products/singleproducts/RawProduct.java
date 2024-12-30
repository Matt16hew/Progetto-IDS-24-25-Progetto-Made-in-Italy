package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

/**
 * Represents a raw product in the supply chain
 * @author Alessandro Pascucci
 */
public class RawProduct extends SingleProduct {

    private String productionMethod;

    public RawProduct(int id, String author) {
        super(id, author);
    }

    public String getProductionMethod() {
        return this.productionMethod;
    }

    public void setProductionMethod(String productionMethod) {
        if (productionMethod == null)
            throw new NullPointerException("A raw product must have a production method");
        this.productionMethod = productionMethod;
    }

}
