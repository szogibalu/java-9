package com.szogibalu.examples;


import com.szogibalu.provider.ExampleProvider;

import java.util.ServiceLoader;

public class Service {

    private static Service ourInstance = new Service();

    private Service() {
    }

    public static Service getInstance() {
        return ourInstance;
    }

    public void printServiceNames() {
        ServiceLoader<ExampleProvider> services = ServiceLoader.load(ExampleProvider.class);
        String hello = services.findFirst().get().hello();
        System.out.println(hello);
    }

}
