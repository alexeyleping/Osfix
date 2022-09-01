package com.example.osfix.service;

import com.example.osfix.entity.Application;
import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.CreateApplicationDto;
import com.example.osfix.entity.DTO.ReturnApplicationDto;
import com.example.osfix.repository.ApplicationRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }


    public ReturnApplicationDto getApplication(Long id) {
        Optional<Application> application = applicationRepository.findById(id);
        ReturnApplicationDto returnApplicationDto = new ReturnApplicationDto();
        returnApplicationDto.setCodeWord(application.get().getCodeWord());
        returnApplicationDto.setCreateDate(application.get().getCreateDate());
        returnApplicationDto.setStatusApp(application.get().getStatusApp());
        return returnApplicationDto;
    }

    public void createApplication(@NotNull CreateApplicationDto createApplicationDto) {
        Application application = new Application();
        application.setCodeWord(createApplicationDto.getCodeWord());
        application.setCreateDate(createApplicationDto.getCreateDate());
        application.setStatusApp(createApplicationDto.getStatusApp());
        applicationRepository.save(application);
    }

    public void updateApplication(@NotNull CreateApplicationDto createApplicationDto) {
        Application application = applicationRepository.getReferenceById(createApplicationDto.getApplicationId());
        if(createApplicationDto.getCodeWord() != null)
            application.setCodeWord(createApplicationDto.getCodeWord());
        if(createApplicationDto.getCreateDate() != null)
            application.setCreateDate(createApplicationDto.getCreateDate());
        if(createApplicationDto.getStatusApp() != null)
            application.setStatusApp(createApplicationDto.getStatusApp());
        applicationRepository.save(application);
    }

    public void deleteApplication(@NotNull CreateApplicationDto createApplicationDto) {
        Long applicationId = createApplicationDto.getApplicationId();
        applicationRepository.deleteById(applicationId);
    }
}
