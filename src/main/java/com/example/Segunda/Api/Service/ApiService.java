package com.example.Segunda.Api.Service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.*;
import reactor.core.publisher.Mono;

@Service
public class ApiService {

    public static String fazerRequisicaoPost(String name) {
        WebClient webClient = WebClient.create("ec2-15-228-253-49.sa-east-1.compute.amazonaws.com:8080");
        Mono<String> responseBody = webClient.get()
                .uri("/products/name/" + name)
                .retrieve()
                .bodyToMono(String.class);
        String resposta = responseBody.block(); // Bloqueia a execução para obter a resposta, você pode lidar com isso de forma assíncrona também.
        System.out.println("Resposta da API: " + resposta); //console
        return resposta;
    }

}
