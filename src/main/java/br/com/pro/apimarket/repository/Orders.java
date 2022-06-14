package br.com.pro.apimarket.repository;


import br.com.pro.apimarket.model.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Orders {

    public OrderItem orderItem;

    private List<OrderItem> items;

    public Orders(List<OrderItem> items) {
        this.items = items;
    }

    public void addOrder(OrderItem orderItem){
        this.items.add(orderItem);
    }
    public List<OrderItem> getItems(){
        return items;
    }
}
