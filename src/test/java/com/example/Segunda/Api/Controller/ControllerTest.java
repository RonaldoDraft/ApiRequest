package com.example.Segunda.Api.Controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.Segunda.Api.DtoJson.Product;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ControllerTest {

    @Test
    @Disabled("TODO: Complete this test")
    void testConsultProduct() {
        Controller controller = new Controller();

        Product product = new Product();
        product.setName("Name");
        product.setValue(BigDecimal.valueOf(42L));

        // Act
        controller.consultProduct(product);
    }


    @Test
    @Disabled("TODO: Complete this test")
    void testConsultProduct2() {

        Controller controller = new Controller();
        Product product = mock(Product.class);
        when(product.getName()).thenReturn("Name");
        doNothing().when(product).setName((String) any());
        doNothing().when(product).setValue((BigDecimal) any());
        product.setName("Name");
        product.setValue(BigDecimal.valueOf(42L));

        controller.consultProduct(product);
    }

    @Disabled("TODO: Complete this test")
    void testConsultProduct22() {

        // Arrange
        Controller controller = new Controller();

        Product product = new Product();
        product.setName("Name");
        product.setValue(BigDecimal.valueOf(42L));

        // Act
        controller.consultProduct2(product);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testConsultProduct23() {


        // Arrange
        Controller controller = new Controller();
        Product product = mock(Product.class);
        when(product.getName()).thenReturn("Name");
        doNothing().when(product).setName((String) any());
        doNothing().when(product).setValue((BigDecimal) any());
        product.setName("Name");
        product.setValue(BigDecimal.valueOf(42L));

        // Act
        controller.consultProduct2(product);
    }
}

