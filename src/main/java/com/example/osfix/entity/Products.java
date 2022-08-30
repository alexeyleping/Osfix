package com.example.osfix.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productWeight")
    private double productWeight;

    @Column(name = "productComment")
    private String productComment;

    public Products() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

}
