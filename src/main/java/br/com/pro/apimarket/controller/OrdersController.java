package br.com.pro.apimarket.controller;


import br.com.pro.apimarket.model.OrderItem;
import br.com.pro.apimarket.repository.Orders;
import br.com.pro.apimarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private Orders orders;

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> OrderItem(){
        return new ResponseEntity<>(orderService.itemsList(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<Double> calculateOrder(){
        return new ResponseEntity<>(orderService.orderCalculator(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<OrderItem> addingOrders(@RequestBody OrderItem orderItem){
        orderService.adding(orderItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
