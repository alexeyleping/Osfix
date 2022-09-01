package com.example.osfix.controllers;

import com.example.osfix.entity.DTO.CreateClientDto;
import com.example.osfix.entity.DTO.ReturnClientDto;
import com.example.osfix.service.ClientService;
import org.springframework.web.bind.annotation.*;

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
    public void createClient(@RequestBody CreateClientDto createClientDto) {
        clientService.createClient(createClientDto);
    }
    @PutMapping
    public void updateClient(@RequestBody CreateClientDto createClientDto) {
        clientService.updateClient(createClientDto);
    }
    @DeleteMapping
    public void deleteClient(@RequestBody CreateClientDto createClientDto) {
        clientService.deleteClient(createClientDto);
    }
}
