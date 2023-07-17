package com.subrutin.catalog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrutin.catalog.service.GreetingService;

@RestController
public class HelloResources {

    private GreetingService greetingService;

    // Konstruktor dengan Dependency Injection
    @Autowired
    public HelloResources(GreetingService greetingService) {
        super();
        this.greetingService = greetingService;
    }

    /**
     * Handler untuk permintaan GET pada "/hello".
     * Mengembalikan pesan salam yang diambil dari GreetingService.
     *
     * @return pesan salam sebagai String.
     */
    @GetMapping("/hello")
    public String helloWorld() {
        return greetingService.sayGreeting();
    }

}
