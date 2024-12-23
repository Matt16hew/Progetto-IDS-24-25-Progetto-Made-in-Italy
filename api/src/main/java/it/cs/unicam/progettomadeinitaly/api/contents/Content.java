package it.cs.unicam.progettomadeinitaly.api.contents;

/**
 *  This interface represent content
 *  @author Alessandro Pascucci
 */
public interface Content {

    /**
     * Returns the id of this content entity
     * @return an int value that represents the content's id
     */
    int getId();

    /**
     * Returns the name of this content entity
     * @return a String that represents the content's name
     */
    String getName();

    /**
     * Returns the description of this content entity
     * @return a String that represents the content's description
     */
    String getDescription();

    /**
     * Returns true if this content entity has been published,
     * false otherwise
     * @return true if this content entity has been published,
     *         false otherwise
     */
    boolean isPublished();

    /**
     * Publishes this content entity
     */
    void publish();

    /**
     * Returns the name of the author who created the content entity
     * @return a String that represents the name of author
     */
    String getAuthor();

}
