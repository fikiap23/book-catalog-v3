package com.subrutin.catalog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

	private String welcomeText; // Menyimpan teks sambutan untuk aplikasi

	private String timezone; // Menyimpan zona waktu yang digunakan dalam aplikasi

	private String currency; // Menyimpan mata uang yang digunakan dalam aplikasi

	// Mengembalikan teks sambutan untuk aplikasi.
	public String getWelcomeText() {
		return welcomeText;
	}

	// Mengatur teks sambutan untuk aplikasi.
	public void setWelcomeText(String welcomeText) {
		this.welcomeText = welcomeText;
	}

	// Mengembalikan zona waktu yang digunakan dalam aplikasi.
	public String getTimezone() {
		return timezone;
	}

	// Mengatur zona waktu yang digunakan dalam aplikasi.
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	// Mengembalikan mata uang yang digunakan dalam aplikasi.
	public String getCurrency() {
		return currency;
	}

	// Mengatur mata uang yang digunakan dalam aplikasi.
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

//Anotasi @Configuration digunakan untuk menandai kelas ApplicationProperties sebagai konfigurasi Spring.
//Spring akan mendeteksi kelas ini saat melakukan komponen scanning.

//Anotasi @ConfigurationProperties(prefix = "app") digunakan untuk mengikat properti aplikasi dengan kelas ApplicationProperties.
//Dengan menggunakan prefix = "app", properti-properti yang dimulai dengan app akan diikat ke kelas ini.
//Misalnya, jika ada properti app.welcomeText dalam file konfigurasi, nilainya akan diisikan ke variabel welcomeText dalam kelas ini.

//Dengan anotasi-anotasi ini, Spring Boot akan mengenali kelas ApplicationProperties sebagai konfigurasi
//dan akan memuat nilai properti yang sesuai dari file konfigurasi aplikasi yang sesuai.
//Dalam contoh ini, file konfigurasi mungkin berisi properti seperti app.welcomeText=Halo, Selamat Datang!,
//yang akan diikat ke variabel welcomeText dalam kelas ApplicationProperties.