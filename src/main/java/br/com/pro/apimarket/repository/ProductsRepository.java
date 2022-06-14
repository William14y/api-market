package br.com.pro.apimarket.repository;


import br.com.pro.apimarket.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsRepository {

    private Product product;

    private final List<Product> products;

    public ProductsRepository(){
        this.products = new ArrayList<>();
        Product p1 = new Product(01,"Teclado", 240.0, 320, 0.5);
        Product p2 = new Product(02,"Mouse", 150.0, 130, 5.0);
        Product p3 = new Product(03,"Monitor", 900.0, 290, 10.0);
        Product p4 = new Product(04,"Headset", 260.0, 220, 5.0);
        Product p5 = new Product(05,"Placa Mãe", 600.0, 360, 8.0);
        Product p6 = new Product(06,"Processador", 700.0, 300, 10.0);
        Product p7 = new Product(07,"Placa de Vídeo", 970.0, 120, 15.0);


        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
    }

    public List<Product> findAll(){
        return products;
    }
    public Product findById(Integer id) {
        return products.stream()
                .filter(mrk->mrk.getId().equals(id)).findFirst()
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    public void adding (Integer id, Integer quantity) {
        products.stream()
                .filter(prd -> prd.getId().equals(id))
                .forEach(prd-> prd.addingQuantity(quantity));
    }
    public void reduce (Integer id , Integer quantity){
        products.stream()
                .filter(prd -> prd.getId().equals(id))
                .forEach(prd -> prd.reducingQuantity(quantity));
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }
}


