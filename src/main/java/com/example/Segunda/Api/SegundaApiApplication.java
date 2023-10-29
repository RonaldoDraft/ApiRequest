package com.example.Segunda.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.http.HttpHeaders;

@SpringBootApplication
public class SegundaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundaApiApplication.class, args);

	}

}
