package it.cs.unicam.progettomadeinitaly.api.contents;

/**
 *  This interface represent content
 *  @author Alessandro Pascucci
 */
public interface Contents {

    // TODO possibile aggiunta di ID

    String getName();

    String getDescription();

    boolean isPublished();

    String getAuthor();

}
