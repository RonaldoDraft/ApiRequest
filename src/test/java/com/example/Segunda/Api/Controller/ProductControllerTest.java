package com.example.Segunda.Api.Controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.Segunda.Api.DtoJson.AllProducts;
import com.example.Segunda.Api.Service.ApiServiceAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.DirectProcessor;

class ProductControllerTest {

    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllProducts() {

        (new ProductController(new ApiServiceAll(null))).GetAllProducts();
    }


    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllProducts2() {
        (new ProductController(null)).GetAllProducts();
    }


    @Test
    void testGetAllProducts3() {
        ApiServiceAll apiServiceAll = mock(ApiServiceAll.class);
        DirectProcessor<AllProducts> createResult = DirectProcessor.create();
        when(apiServiceAll.GetAllProducts()).thenReturn(createResult);

        assertSame(createResult, (new ProductController(apiServiceAll)).GetAllProducts());
        verify(apiServiceAll).GetAllProducts();
    }
}

