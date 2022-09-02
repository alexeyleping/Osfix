package com.example.osfix.controllers;

import com.example.osfix.entity.Application;
import com.example.osfix.entity.DTO.ClientDto;
import com.example.osfix.entity.DTO.ReturnClientDto;
import com.example.osfix.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private  final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping(value = "/{id}")
    public ReturnClientDto getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }
    @PostMapping
    public void createClient(@RequestBody ClientDto clientDto) {
        clientService.createClient(clientDto);
    }
    @PutMapping
    public void updateClient(@RequestBody ClientDto clientDto) {
        clientService.updateClient(clientDto);
    }
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
    @GetMapping("/clientapplication/{id}")
    public List<Application> getAllBy(@PathVariable(value = "id") Long clientId) {
        return clientService.getAllBy(clientId);
    }
}
