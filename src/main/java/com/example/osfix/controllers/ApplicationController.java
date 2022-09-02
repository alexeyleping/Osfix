package com.example.osfix.controllers;

import com.example.osfix.controllers.dto.ApplicationDto;
import com.example.osfix.controllers.dto.ReturnApplicationDto;
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
    public ReturnApplicationDto getApplication(@PathVariable Long id) {
        return applicationService.getApplication(id);
    }

    @PostMapping
    public void createApplication(@RequestBody ApplicationDto applicationDto) {
        applicationService.createApplication(applicationDto);
    }

    @PutMapping
    public void updateApplication(@RequestBody ApplicationDto applicationDto) {
        applicationService.updateApplication(applicationDto);
    }

    @DeleteMapping
    public void deleteApplication(@RequestBody ApplicationDto applicationDto) {
        applicationService.deleteApplication(applicationDto);
    }


}
