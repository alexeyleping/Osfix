package com.example.osfix.controllers;

import com.example.osfix.entity.Client;
import com.example.osfix.service.WebService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WebController {
    private  final WebService webService;

    public WebController(WebService webService) {
        this.webService = webService;
    }

    @PostMapping ("/createClient{client_id}{client_name}{web_site}{client_comment}")
    public void createClient(@PathVariable Long client_id, @PathVariable String client_name, @PathVariable String web_site, @PathVariable String client_comment) {
        webService.createClient(client_id, client_name, web_site, client_comment);
    }

    @GetMapping("/readClient{client_id}")
    public Optional<Client> readClient(@PathVariable Long id) {
        return webService.getClient(id);
    }


    @PostMapping ("/updateClient{client_id}{client_name}{web_site}{client_comment}")
    public void updateClient(@PathVariable Long client_id, @PathVariable String client_name, @PathVariable String web_site, @PathVariable String client_comment) {
        webService.updateClient(client_id, client_name, web_site, client_comment);
    }

    @PostMapping ("/deleteClient{client_id}")
    public void deleteClient(@PathVariable Long client_id) {
        webService.deleteClient(client_id);
    }



}
