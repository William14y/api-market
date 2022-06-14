package br.com.pro.apimarket.model;

public class OrderItem {

    private Product product;
    private Double discount;
    private Integer quantity;


    public OrderItem(Product product, Double discount, Integer quantity) {
        this.product = product;
        this.discount = discount;
        this.quantity = quantity;
    }

    public Double totalPrice(){
        if (quantity <= product.getQuantity()) {
            return (product.priceWithDiscount(discount) * quantity);
        }else{
            return (product.priceWithDiscount(discount) * product.getQuantity());
        }
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
