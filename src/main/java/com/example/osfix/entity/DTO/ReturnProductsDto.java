package com.example.osfix.entity.DTO;

public class ReturnProductsDto {
    private String productName;
    private double productWeight;
    private String productComment;

    public ReturnProductsDto() {
    }

    public ReturnProductsDto(String productName, double productWeight, String productComment) {
        this.productName = productName;
        this.productWeight = productWeight;
        this.productComment = productComment;
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
