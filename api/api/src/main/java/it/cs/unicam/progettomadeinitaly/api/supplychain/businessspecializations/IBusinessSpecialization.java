package it.cs.unicam.progettomadeinitaly.api.supplychain.businessspecializations;

import it.cs.unicam.progettomadeinitaly.api.contents.Content;

/**
 * Represents a business specialization a supply chain point may have.
 * Specific business specializations will allow the management of specific types of content.
 *
 * @author Pietro Villa
 */
public interface IBusinessSpecialization {

    /**
     * Adds a content to this business specialization
     *
     * @param content the content to add
     * @throws NullPointerException if the content is null
     * @throws IllegalArgumentException if the content is incompatible with
     *         this business specialization standards
     * @return true if the content has been added successfully
     */
    boolean addContent(Content content);

    String getName();

}
