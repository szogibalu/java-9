package com.szogibalu.examples3;

import com.szogibalu.provider.ExampleProvider;

public class Service implements ExampleProvider {

    @Override
    public String hello() {
        return "hello";
    }

}
