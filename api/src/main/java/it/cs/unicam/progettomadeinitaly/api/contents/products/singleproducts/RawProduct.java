package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

/**
 * @author Alessandro Pascucci
 */
public class RawProduct extends SingleProduct {

    private String productionMethod;

    public RawProduct(String author, String name , String description ,String certification, String variety, String productionMethod) {
        super(author, name, description, certification, variety);
        if (productionMethod == null)
            throw new NullPointerException("productionMethod is null");
        this.productionMethod = productionMethod;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public String getProductionMethod() {
        return this.productionMethod;
    }

    // Inserisco setter

    public void setProductionMethod(String productionMethod) {
        this.productionMethod = productionMethod;
    }

}
