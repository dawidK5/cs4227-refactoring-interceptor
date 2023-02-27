package main.java.movierental;

public class DiscountClientInterceptor implements InReplyInterceptor {

    public void onPreMarshalReply(UnmarshaledRequest r) {
        System.out.println("It took " + (r.getStartTime() - System.currentTimeMillis())
                +" milliseconds for client to receive the reply");
    }

    public void onPostMarshalReply(MarshaledRequest r) {
        if (r.isSuccess())
            System.out.println("Discount had been applied successfully");
    }
}
