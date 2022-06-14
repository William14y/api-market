package br.com.pro.apimarket.service;


import br.com.pro.apimarket.model.Product;
import br.com.pro.apimarket.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> findAll(){
        return productsRepository.findAll();
    }

    public Product findById(Integer id) {
        return productsRepository.findById(id);
    }

    public void adding(Integer id, Integer quantity) {
        productsRepository.adding(id,quantity);
    }


}
