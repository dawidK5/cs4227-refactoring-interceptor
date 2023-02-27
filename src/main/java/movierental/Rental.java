package main.java.movierental;

public class Rental {
    private int daysRented;
    private Movie movie;

    public Rental(Movie movie) {
        this.movie = movie;
    }

    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    Movie getMovie() {
        return movie;
    }
    double getCharge() {
        return movie.getCharge(daysRented);

    }
}