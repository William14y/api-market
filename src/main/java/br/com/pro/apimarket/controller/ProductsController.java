package br.com.pro.apimarket.controller;

import br.com.pro.apimarket.model.Product;
import br.com.pro.apimarket.repository.ProductsRepository;
import br.com.pro.apimarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
    }
    @PutMapping ("/{id}/{quantity}")
    public void adding(Integer id, Integer quantity){
        productsRepository.adding(id,quantity);
    }
    }
