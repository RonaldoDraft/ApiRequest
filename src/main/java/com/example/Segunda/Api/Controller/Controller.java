package com.example.Segunda.Api.Controller;

import com.example.Segunda.Api.DtoJson.Product;
import com.example.Segunda.Api.Service.ApiService;
import com.example.Segunda.Api.Service.ApiService2;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @PostMapping("/ApiProduct")
    public ResponseEntity<Object> consultProduct(@RequestBody @Valid Product product){
        String name = product.getName();
        System.out.println(name);
        String product0 = ApiService.fazerRequisicaoPost(name);
        if(product0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found. ");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product0);
    }

    @PostMapping("/ApiProducts")
    public ResponseEntity<Object> consultProduct2(@RequestBody @Valid Product product){
        String name = product.getName();
        System.out.println(name);
        String product0 = ApiService2.fazerRequisicaoPost2(name);
        if(product0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found. ");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product0);
    }
}
