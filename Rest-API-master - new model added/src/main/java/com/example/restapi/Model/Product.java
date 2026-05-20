package com.example.restapi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "product_data")
public class Product {

    @Id
    private int productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(int productId, String productName, String productDescription, double price,
                   Category category) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId +
                ", productName=" + productName +
                ", productDescription=" + productDescription +
                ", price=" + price +
                ", category=" + category + "]";
    }
}