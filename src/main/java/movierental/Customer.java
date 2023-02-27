package main.java.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<> _rentals;

    public Customer() {
        _rentals = new ArrayList<Rental>();
    }

    void addMovie(Rental r) {
        _rentals.add(r);
    }
    void statement() {
        double charge = getTotalCharge();
        double frq = getTotalFrequentRenterPoints();
        System.out.println("Printing statement");
    }
    double getTotalCharge() {
        double sum = 0;
        for (Rental r : _rentals) {
            sum += r.getCharge();
        }
        return sum;
    }

    double getTotalFrequentRenterPoints() {
        double sum = 0;
        for (Rental r : _rentals) {
            sum += r.getFrequentRenterPoints();
        }
        return sum;
    }
}