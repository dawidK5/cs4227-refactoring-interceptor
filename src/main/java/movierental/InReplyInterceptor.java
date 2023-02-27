package main.java.movierental;

public interface InReplyInterceptor {
    public void onPreMarshalReply(MarshaledRequest r);
    public void onPostMarshalReply(UnmarshaledRequest r);
}
