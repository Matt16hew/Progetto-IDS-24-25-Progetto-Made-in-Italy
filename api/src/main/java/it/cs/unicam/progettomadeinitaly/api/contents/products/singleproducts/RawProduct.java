package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

/**
 * Represents a raw product in the supply chain
 * @author Alessandro Pascucci
 */
public class RawProduct extends SingleProduct {

    private String productionMethod;

    public RawProduct(int id, String author, String name , String description ,String certification, String variety, String productionMethod) {
        super(id, author, name, description, certification, variety);
        if (productionMethod == null)
            throw new NullPointerException("productionMethod is null");
        this.productionMethod = productionMethod;
    }

    public String getProductionMethod() {
        return this.productionMethod;
    }

    // Inserisco setter

    public void setProductionMethod(String productionMethod) {
        this.productionMethod = productionMethod;
    }

}
