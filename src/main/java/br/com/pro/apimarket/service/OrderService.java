package br.com.pro.apimarket.service;


import br.com.pro.apimarket.model.OrderCalculator;
import br.com.pro.apimarket.model.OrderItem;
import br.com.pro.apimarket.repository.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    Double totalOfOrders;


    @Autowired
    private Orders orders;
    private OrderCalculator orderCalculator;
    private OrderItem orderItem;

    public void adding(OrderItem orderItem){
        orders.addOrder(orderItem);
    }
    public List<OrderItem> itemsList() {
        return orders.getItems();
    }
    public Double orderCalculator(){
        this.orderCalculator = new OrderCalculator();
        return orderCalculator.totalOrderCalculator(orders);
    }
    }
