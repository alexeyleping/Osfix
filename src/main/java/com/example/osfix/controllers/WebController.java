package com.example.osfix.controllers;

import com.example.osfix.entity.Client;
import com.example.osfix.service.WebService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class WebController {
    private  final WebService webService;

    public WebController(WebService webService) {
        this.webService = webService;
    }

    @PostMapping ("/createClient{client_id}{client_name}{web_site}{client_comment}")
    public void createClient(@RequestParam Long client_id, @RequestParam String client_name, @RequestParam String web_site, @RequestParam String client_comment) {
        webService.createClient(client_id, client_name, web_site, client_comment);
    }

    @GetMapping("/readClient{client_id}")
    public Optional<Client> readClient(@PathVariable Long id) {
        return webService.getClient(id);
    }


    @PutMapping ("/updateClient{client_id}{client_name}{web_site}{client_comment}")
    public void updateClient(@RequestParam Long client_id, @RequestParam String client_name, @RequestParam String web_site, @RequestParam String client_comment) {
        webService.updateClient(client_id, client_name, web_site, client_comment);
    }

    @DeleteMapping("/deleteClient{client_id}")
    public void deleteClient(@PathVariable Long client_id) {
        webService.deleteClient(client_id);
    }



}
