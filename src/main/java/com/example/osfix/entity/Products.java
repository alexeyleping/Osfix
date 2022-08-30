package com.example.osfix.entity;

import jakarta.persistence.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.productWeight, productWeight) == 0 && Objects.equals(id, products.id) && Objects.equals(productName, products.productName) && Objects.equals(productComment, products.productComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productWeight, productComment);
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productWeight=" + productWeight +
                ", productComment='" + productComment + '\'' +
                '}';
    }
}
