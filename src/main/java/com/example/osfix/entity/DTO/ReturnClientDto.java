package com.example.osfix.entity.DTO;

public class ReturnClientDto {
    private String name;
    private String website;
    private String comment;

    public ReturnClientDto(String name, String website, String comment) {
        this.name = name;
        this.website = website;
        this.comment = comment;
    }
    public ReturnClientDto() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getName() {
        return name;
    }
    public String getSite() {
        return website;
    }
    public String getComment() {
        return comment;
    }
}
