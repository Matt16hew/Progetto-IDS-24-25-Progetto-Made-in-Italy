package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

/**
 * Represents a unitary product in the supply chain
 * @author Alessandro Pascucci
 */
public abstract class SingleProduct extends Product {

    private String name;

    private String description;

    private String certification;

    private String variety;

    public SingleProduct(int id, String author) {
        super(id, author);
    }

    @Override
    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        if (this.name == null)
            throw new NullPointerException("A single product must have a name");
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        if (this.description == null)
            throw new NullPointerException("A single product must have a description");
        this.description = description;
    }

    public String getCertification() {
        return this.certification;
    }

    public void setCertification(String certification) {
        if (this.certification == null)
            throw new NullPointerException("A single product must have a certification");
        this.certification = certification;
    }

    public String getVariety() {
        return this.variety;
    }

    public void setVariety(String variety) {
        if (this.variety == null)
            throw new NullPointerException("A single product must have a variety");
        this.variety = variety;
    }

}
