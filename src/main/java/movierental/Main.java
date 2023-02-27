package main.java.movierental;

public class Main {

    public static void main(String[] args) {
        InReplyInterceptor inReplyInterceptor = new DiscountClientInterceptor();
        Dispatcher d = new Dispatcher();
        d.attach(inReplyInterceptor);
        // Automated test case
        Customer c = new Customer();
        Movie m1 = new Movie("Saw", 1);
        Movie m2 = new Movie("Avatar", 3);
        Rental rn = new Rental(m1);
        c.addMovie(rn); // adds rental to customer
        c.statement(); // calls getTotalCharge
    }
}
