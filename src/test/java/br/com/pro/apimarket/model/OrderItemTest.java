package br.com.pro.apimarket.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderItemTest {

    @Test
    public void shouldCalculateTotalPrice(){
        final Product product = new Product(01,
                "Placa Grafica",
                3000.00,
                10,
                5.0);

        final OrderItem orderItem = new OrderItem(product,
                5.0,
                10);

        final Double result = orderItem.totalPrice();
        assertEquals(5000.00, result);
    }

}
