package com.example.osfix.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "clientId")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long clientId;

    @Column(name = "clientName")
    private String clientName;

    @Column(name = "website")
    private String website;

    @Column(name = "clientComment")
    private String clientComment;

    @OneToMany
    private List<Application> applicationList;

    public Client() {
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getClientComment() {
        return clientComment;
    }

    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(clientName, client.clientName) && Objects.equals(website, client.website) && Objects.equals(clientComment, client.clientComment) && Objects.equals(applicationList, client.applicationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, website, clientComment, applicationList);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", website='" + website + '\'' +
                ", clientComment='" + clientComment + '\'' +
                ", applicationList=" + applicationList +
                '}';
    }
}
