package DAO.JPA;

import DAO.JPA.Movie;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-04-26T12:38:54", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile SingularAttribute<Genre, String> name;
    public static volatile SingularAttribute<Genre, Integer> id;
    public static volatile ListAttribute<Genre, Movie> movieList;

}