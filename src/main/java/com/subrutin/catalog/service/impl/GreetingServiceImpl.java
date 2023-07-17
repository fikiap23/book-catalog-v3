package com.subrutin.catalog.service.impl;

import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.subrutin.catalog.config.ApplicationProperties;
import com.subrutin.catalog.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	private ApplicationProperties appProperties; // Menyimpan objek ApplicationProperties
	
	/**
	 * Konstruktor GreetingServiceImpl untuk menyimpan objek ApplicationProperties.
	 *  Konstruktor dengan Dependency Injection
	 * @param appProperties Objek ApplicationProperties yang akan disimpan
	 */
	public GreetingServiceImpl(ApplicationProperties appProperties) {
		super();
		this.appProperties = appProperties;
	}

	/**
	 * Menghasilkan pesan sambutan yang menggabungkan teks sambutan, zona waktu, dan mata uang.
	 * @return Pesan sambutan
	 */
	@Override
	public String sayGreeting() {
		TimeZone timezone = TimeZone.getTimeZone(appProperties.getTimezone()); // Mendapatkan zona waktu dari ApplicationProperties
		
		// Menggabungkan teks sambutan, zona waktu, dan mata uang menjadi satu pesan sambutan
		return appProperties.getWelcomeText() + ", our timezone: " + timezone.getDisplayName() + ", our currency: "
				+ appProperties.getCurrency();
	}
}
