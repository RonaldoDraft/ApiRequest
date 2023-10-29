package com.example.Segunda.Api.DtoJson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AllProducts {

    private String name;
    private BigDecimal value;

}
