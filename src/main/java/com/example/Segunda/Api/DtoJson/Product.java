package com.example.Segunda.Api.DtoJson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.math.BigDecimal;
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Product {

    private String name;
    private BigDecimal value;

    private String tipe;
    private String moeda;

}
