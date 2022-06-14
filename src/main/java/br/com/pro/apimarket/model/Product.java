package br.com.pro.apimarket.model;

public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    private Double maxDiscount;

    public Product(Integer id, String name, Double price, Integer quantity, Double maxDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.maxDiscount = maxDiscount;
    }

    public Double priceWithDiscount(final Double discount) {
        if (discount > maxDiscount) {
            return price * (1 - maxDiscount);
        } else {
            return price * (1 - discount);
        }
    }

    public int addingQuantity(Integer actualQuantity) {
        return (actualQuantity += quantity);
    }

    public int reducingQuantity(Integer actualQuantity) {
       if (actualQuantity >= quantity) {
           return (actualQuantity -= quantity);
       }return (actualQuantity - actualQuantity);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }
}