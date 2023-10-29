package com.example.Segunda.Api.Service;

import com.example.Segunda.Api.DtoJson.AllProducts;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class ApiServiceAll {

    private WebClient webClient;

    public ApiServiceAll(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://localhost:8080").build();
    }
    public Flux<AllProducts> GetAllProducts() {
    log.info("listando todos Produtos");
        return webClient
                .get()
                .uri("/products")
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(AllProducts.class);

    }
}
