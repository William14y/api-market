package br.com.pro.apimarket.model;

import br.com.pro.apimarket.repository.Orders;

public class OrderCalculator {

    Orders orders;

    Double totalOfOrders;

    public Double totalOrderCalculator(Orders totalOfOrders){
        return this.totalOfOrders = orders.getItems()
                .stream().mapToDouble(OrderItem::totalPrice).sum();
    }
}
