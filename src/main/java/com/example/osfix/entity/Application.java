package com.example.osfix.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "applicationId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long applicationId;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "codeWord")
    private String codeWord;

    @Column(name = "statusApplication")
    private String statusApp;

    enum statusApplication{IN_WORK,SHIPPED,DONE};

    @OneToMany
    private List<Products> productsList;

    public Application() {
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCodeWord() {
        return codeWord;
    }

    public void setCodeWord(String codeWord) {
        this.codeWord = codeWord;
    }

    public String getStatusApp() {
        return statusApp;
    }

    public void setStatusApp(String statusApp) {
        this.statusApp = statusApp;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(applicationId, that.applicationId) && Objects.equals(createDate, that.createDate) && Objects.equals(codeWord, that.codeWord) && Objects.equals(statusApp, that.statusApp) && Objects.equals(productsList, that.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, createDate, codeWord, statusApp, productsList);
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId=" + applicationId +
                ", createDate=" + createDate +
                ", codeWord='" + codeWord + '\'' +
                ", statusApp='" + statusApp + '\'' +
                ", productsList=" + productsList +
                '}';
    }
}
