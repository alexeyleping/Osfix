package com.example.osfix.service;

import com.example.osfix.entity.Application;
import com.example.osfix.controllers.dto.ApplicationDto;
import com.example.osfix.controllers.dto.ReturnApplicationDto;
import com.example.osfix.repository.ApplicationRepository;
import com.example.osfix.repository.ProductsRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ProductsRepository productsRepository;

    public ApplicationService(ApplicationRepository applicationRepository, ProductsRepository productsRepository) {
        this.applicationRepository = applicationRepository;
        this.productsRepository = productsRepository;
    }

    public ReturnApplicationDto getApplication(Long id) {
        Optional<Application> application = applicationRepository.findById(id);
        ReturnApplicationDto returnApplicationDto = new ReturnApplicationDto();
        returnApplicationDto.setCodeWord(application.get().getCodeWord());
        returnApplicationDto.setCreateDate(application.get().getCreateDate());
        returnApplicationDto.setStatusApp(application.get().getStatusApp());
        return returnApplicationDto;
    }

    public void createApplication(@NotNull ApplicationDto applicationDto) {
        Application application = new Application();
        application.setCodeWord(applicationDto.getCodeWord());
        application.setCreateDate(applicationDto.getCreateDate());
        application.setStatusApp(applicationDto.getStatusApp());
        applicationRepository.save(application);
    }

    public void updateApplication(@NotNull ApplicationDto applicationDto) {
        Application application = applicationRepository.getReferenceById(applicationDto.getApplicationId());
        if(applicationDto.getCodeWord() != null)
            application.setCodeWord(applicationDto.getCodeWord());
        if(applicationDto.getCreateDate() != null)
            application.setCreateDate(applicationDto.getCreateDate());
        if(applicationDto.getStatusApp() != null)
            application.setStatusApp(applicationDto.getStatusApp());
        applicationRepository.save(application);
    }

    public void deleteApplication(@NotNull ApplicationDto applicationDto) {
        Long applicationId = applicationDto.getApplicationId();
        applicationRepository.deleteById(applicationId);
    }
}
