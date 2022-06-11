package com.ecommerce.microcommerce.model;

import javax.persistence.*;
import javax.validation.constraints.*;
/**
 * @author Mister__iks
 * @Twitter @Mister__iks
 */

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Size(min = 3, max = 100)
    private String productName;
    @Min(300)
    private int productPrice;

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(int defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    private int defaultPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    public Product() {
    }

    public Product(int id, String productName, int productPrice, int defaultPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.defaultPrice = defaultPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName='" + productName + '\'' + ", productPrice=" + productPrice + '}';
    }
}
