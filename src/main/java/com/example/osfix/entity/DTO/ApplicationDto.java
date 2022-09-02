package com.example.osfix.entity.DTO;

import com.example.osfix.entity.ApplicationStatus;

import java.util.Date;

public class ApplicationDto {
    private Long applicationId;
    private Date createDate;
    private String codeWord;
    private ApplicationStatus statusApp;

    public ApplicationDto(Long applicationId, Date createDate, String codeWord, ApplicationStatus statusApp) {
        this.applicationId = applicationId;
        this.createDate = createDate;
        this.codeWord = codeWord;
        this.statusApp = statusApp;
    }

    public ApplicationDto() {
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
}
