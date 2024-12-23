package it.cs.unicam.progettomadeinitaly.api.contents;

/**
 *  This interface represent content
 *  @author Alessandro Pascucci
 */
public interface Contents {

    int getId();

    String getName();

    String getDescription();

    boolean isPublished();

    void publish();

    String getAuthor();

}
