package com.subrutin.catalog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrutin.catalog.dto.HelloMessageResponseDTO;
import com.subrutin.catalog.service.GreetingService;

@RestController
public class HelloResources {
	
	Logger log = LoggerFactory.getLogger(HelloResources.class);

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
    public ResponseEntity<HelloMessageResponseDTO>  helloWorld() {
    	log.trace("this is log TRACE");
    	log.debug("this is log DEBUG");
    	log.info("this is log INFO");
    	log.warn("this is log WARM");
    	log.error("this is log ERROR");
    	HelloMessageResponseDTO dto = new HelloMessageResponseDTO();
    	dto.setMessage(greetingService.sayGreeting());

        return ResponseEntity.ok().body(dto);
    }

}
