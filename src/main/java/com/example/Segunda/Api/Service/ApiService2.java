package com.example.Segunda.Api.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ApiService2 {
    public static String fazerRequisicaoPost2(String name) {
        WebClient webClient = WebClient.create("http://localhost:8080");
        Mono<String> responseBody = webClient.get()
                .uri("/products")
                .retrieve()
                .bodyToMono(String.class);
        String resposta = responseBody.block(); // Bloqueia a execução para obter a resposta, você pode lidar com isso de forma assíncrona também.
        System.out.println("Resposta da API: " + resposta); //console
        return resposta;
    }
}
