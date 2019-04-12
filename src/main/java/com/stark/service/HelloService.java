package com.stark.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Hello 2019-4-1 123123123:00";
    }

    public String noCover() {
        return "no cover";
    }
}
