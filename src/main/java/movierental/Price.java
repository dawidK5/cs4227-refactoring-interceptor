package main.java.movierental;

public abstract class Price {
    abstract double getCharge(int daysRented);
    abstract int getPriceCode();
    int getFrequentRenterPoints(int days) {
        return 1;
    }
}

class RegularPrice extends Price {
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    int getPriceCode() {
        return 1;
    }

//        int getFrequentRenterPoints(int daysRented) {
//            return (daysRented >1) ? 2: 1;
//        }
}
class NewReleasePrice extends Price {
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    int getFrequentRenterPoints(int daysRented) {
        return (daysRented >1) ? 2: 1;
    }
    int getPriceCode() {
        return 2;
    }
}
class ChildrensPrice extends Price {
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
    int getPriceCode() {
        return 3;
    }
//    int getFrequentRenterPoints(int daysRented) {
//        return 1;
//    }
}