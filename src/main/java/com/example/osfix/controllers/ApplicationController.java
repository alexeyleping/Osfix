package com.example.osfix.controllers;

import com.example.osfix.entity.DTO.CreateApplicationDto;
import com.example.osfix.entity.DTO.ReturnApplicationDto;
import com.example.osfix.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {
    private  final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping(value = "/{id}")
    public ReturnApplicationDto getClient(@PathVariable Long id) {
        return applicationService.getApplication(id);
    }

    @PostMapping
    public void createApplication(@RequestBody CreateApplicationDto createApplicationDto) {
        applicationService.createApplication(createApplicationDto);
    }

    @PutMapping
    public void updateApplication(@RequestBody CreateApplicationDto createApplicationDto) {
        applicationService.updateApplication(createApplicationDto);
    }

    @DeleteMapping
    public void deleteApplication(@RequestBody CreateApplicationDto createApplicationDto) {
        applicationService.deleteApplication(createApplicationDto);
    }
}
