package Streams.Excersises.FilmApp.Model;

import java.time.LocalDate;
import java.util.List;

public class Film {

    private String title;
    private String director;
    private LocalDate year;
    private double price;
    private List<String> actors;
    private List<String> movieGenre;

    public Film(String title, String director, LocalDate year, double price, List<String> actors, List<String> movieGenre){
        this.title = title;
        this.director = director;
        this.year = year;
        this.price = price;
        this.actors = actors;
        this.movieGenre = movieGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<String> getMovieGenre() {
        return movieGenre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", actors=" + actors +
                ", movieGenre=" + movieGenre +
                '}';
    }
}
