package com.example.Segunda.Api.Controller;

import com.example.Segunda.Api.DtoJson.AllProducts;
import com.example.Segunda.Api.Service.ApiServiceAll;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping("/webclient")
public class ProductController {

    ApiServiceAll apiServiceAll;

    @GetMapping("/ApiAllProducts")
    @ResponseStatus(HttpStatus.OK)
    public Flux<AllProducts> GetAllProducts() {
        return apiServiceAll.GetAllProducts();
    }
}
