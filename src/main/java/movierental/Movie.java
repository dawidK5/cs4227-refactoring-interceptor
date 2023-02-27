package main.java.movierental;

public class Movie {
    private String _title;
}
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }

    int getPriceCode() {
        return _price.getPriceCode();
    }

    void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    String getTitle() {
        return _title;
    }
    void setTitle(String title) {
        this._title = title;
    }
}