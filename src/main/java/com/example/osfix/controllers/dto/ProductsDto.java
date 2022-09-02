package com.example.osfix.controllers.dto;

public class ProductsDto {
    private Long id;
    private String productName;
    private double productWeight;
    private String productComment;

    public ProductsDto() {
    }

    public ProductsDto(Long id, String productName, double productWeight, String productComment) {
        this.id = id;
        this.productName = productName;
        this.productWeight = productWeight;
        this.productComment = productComment;
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
