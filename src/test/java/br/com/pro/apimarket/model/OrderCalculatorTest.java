package br.com.pro.apimarket.model;

import br.com.pro.apimarket.repository.Orders;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderCalculatorTest {

    @Test
    public void shouldCalculateTotalOrderPrice(){
        final OrderCalculator orderCalculator = new OrderCalculator();
        final List<OrderItem> items = Arrays.asList(
                aOrderItem(1, 0.0, 3000.00, 0.5),
                aOrderItem(2, 0.5, 2500.00, 0.2));

        Double result = orderCalculator.totalOrderCalculator(new Orders(items));
        assertEquals(5000, result);
    }
    private OrderItem aOrderItem(final Integer quantity,
                                 final Double discount,
                                 final Double price,
                                 final Double maxDiscount
    ) {
        Product product = new Product(01, "Placa Grafica", 3000.00, 100, 5.0);
        return new OrderItem(product,discount, quantity);
    }
}