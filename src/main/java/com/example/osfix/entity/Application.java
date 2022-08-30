package com.example.osfix.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "application_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long applicationId;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "code_word")
    private String codeWord;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus statusApp;

    @ManyToMany
    @JoinTable(name = "application_products",
            joinColumns = @JoinColumn(name = "application_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Products> productsList = new ArrayList<>();

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

    public ApplicationStatus getStatusApp() {
        return statusApp;
    }

    public void setStatusApp(ApplicationStatus statusApp) {
        this.statusApp = statusApp;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }


}
