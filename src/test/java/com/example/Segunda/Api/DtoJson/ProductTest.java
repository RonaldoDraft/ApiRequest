package com.example.Segunda.Api.DtoJson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void testCanEqual() {

        assertFalse((new Product()).canEqual("Zhonyas"));
    }

    @Test
    void testCanEqual2() {

        Product product = new Product();

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));


        assertTrue(product.canEqual(product1));
    }


    @Test
    void testConstructor() {
        Product actualProduct = new Product();
        actualProduct.setName("Zhonyas");
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        actualProduct.setValue(valueOfResult);
        String actualToStringResult = actualProduct.toString();


        assertEquals("Zhonyas", actualProduct.getName());
        assertSame(valueOfResult, actualProduct.getValue());
        assertEquals("Product(name=Zhonyas, value=42)", actualToStringResult);
    }


    @Test
    void testEquals() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(BigDecimal.valueOf(42L));


        assertNotEquals(product, null);
    }


    @Test
    void testEquals2() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(BigDecimal.valueOf(42L));


        assertNotEquals(product, "Different type to Product");
    }


    @Test
    void testEquals3() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(BigDecimal.valueOf(42L));

        assertEquals(product, product);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product.hashCode());
    }


    @Test
    void testEquals4() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(BigDecimal.valueOf(42L));

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));


        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }


    @Test
    void testEquals5() {
        Product product = new Product();
        product.setName(null);
        product.setValue(BigDecimal.valueOf(42L));

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));

        assertNotEquals(product, product1);
    }


    @Test
    void testEquals6() {

        Product product = new Product();
        product.setName("com.example.Segunda.Api.DtoJson.Product");
        product.setValue(BigDecimal.valueOf(42L));

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));


        assertNotEquals(product, product1);
    }


    @Test
    void testEquals7() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(BigDecimal.valueOf(1L));

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));


        assertNotEquals(product, product1);
    }


    @Test
    void testEquals8() {

        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(null);

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(BigDecimal.valueOf(42L));

        assertNotEquals(product, product1);
    }


    @Test
    void testEquals9() {
        Product product = new Product();
        product.setName(null);
        product.setValue(BigDecimal.valueOf(42L));

        Product product1 = new Product();
        product1.setName(null);
        product1.setValue(BigDecimal.valueOf(42L));

        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }


    @Test
    void testEquals10() {
        Product product = new Product();
        product.setName("Zhonyas");
        product.setValue(null);

        Product product1 = new Product();
        product1.setName("Zhonyas");
        product1.setValue(null);

        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }
}

