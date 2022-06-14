package br.com.pro.apimarket.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void shouldCalculateTotalPriceWithDiscount() {

        Product product = new Product(1,
                "TV",
                3000.00,
                3,
                0.1);

        Double result = product.priceWithDiscount(0.10);
        assertEquals(2700.00, result);
    }

    @Test
    public void
    whenDiscountIsHigherThanMaxDiscountShouldUseMaxDiscountPercentage() {

        Product product = new Product(1,
                "TV",
                3000.00,
                3,
                0.1);
        Double result = product.priceWithDiscount(0.15);
        assertEquals(2700.00, result);
    }
        @Test
        public void whenDiscountIsLowerThanMaxDiscountShouldUseMaxDiscountPercentage (){

            Product product = new Product(1,
                    "TV",
                    3000.00,
                    3,
                    0.1);

            Double result = product.priceWithDiscount(0.05);
            assertEquals(2850.00, result);
        }


        @Test
        public void shouldAddQuantity() {

            Product product = new Product(1,
                    "TV",
                    3000.00,
                    3,
                    0.1);

            Integer result = product.addingQuantity(2);
            assertEquals(5, result);
        }

        @Test
        public void
        quantityToReduceIsHigherThanQuantityInStock() {

            Product product = new Product(1,
                    "TV",
                    3000.00,
                    3,
                    0.1);

            Integer result = product.reducingQuantity(4);
            assertEquals(0, result);
        }

        @Test
        public void
        quantityToReduceIsLowerThanQuantityInStock() {

            Product product = new Product(1,
                    "TV",
                    3000.00,
                    3,
                    0.1);

            Integer result = product.reducingQuantity(2);
            assertEquals(1, result);
        }
    }

