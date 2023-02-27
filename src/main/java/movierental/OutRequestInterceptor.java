package main.java.movierental;

public interface OutRequestInterceptor {
    public void onPreMarshalRequest(MarshaledRequest r);
    public void onPostMarshalRequest(UnmarshaledRequest r);
}
