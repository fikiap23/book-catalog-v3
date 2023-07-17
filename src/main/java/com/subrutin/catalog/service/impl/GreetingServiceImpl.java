package com.subrutin.catalog.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.subrutin.catalog.service.GreetingService;

/**
 * Implementasi dari interface GreetingService.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    // Menggunakan @Value untuk menginjeksikan nilai dari properties welcome.text
    @Value("${welcome.text}")
    private String welcomeText;

    /**
     * Mengembalikan pesan salam.
     *
     * @return pesan salam sebagai String.
     */
    @Override
    public String sayGreeting() {
        return welcomeText;
    }
}
