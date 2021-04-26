package DAO.JPA;

import DAO.JPA.Genre;
import DAO.JPA.Movie;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-04-26T12:38:54", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Integer> duration;
    public static volatile SingularAttribute<Movie, Double> score;
    public static volatile SingularAttribute<Movie, Date> releaseDate;
    public static volatile ListAttribute<Movie, Genre> genreList;
    public static volatile SingularAttribute<Movie, Integer> id;
    public static volatile ListAttribute<Movie, Movie> movieList;
    public static volatile SingularAttribute<Movie, String> title;

}