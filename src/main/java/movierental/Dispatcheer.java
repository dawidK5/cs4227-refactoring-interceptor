package main.java.movierental;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    List<InReplyInterceptor> inReplyInterceptorList;


    public Dispatcher() {
        inReplyInterceptorList = new ArrayList<InReplyInterceptor>();

    }

    void attach(InReplyInterceptor in) {
        inReplyInterceptorList.add(in);
    }
    void remove(InReplyInterceptor in ) {
        inReplyInterceptorList.remove(in);
    }

    void attach(OutRequestInterceptor in) {
        outRequestInterceptorList.add(in);
    }
    void remove(OutRequestInterceptor in ) {
        outRequestInterceptorList.remove(in);
    }

}
