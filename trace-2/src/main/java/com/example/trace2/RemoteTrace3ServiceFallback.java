package com.example.trace2;

import org.springframework.stereotype.Component;


@Component
public class RemoteTrace3ServiceFallback implements RemoteTrace3Service {
    @Override
    public String trace3() {
        return "Trace 3开小差了~";
    }
}
