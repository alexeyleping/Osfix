package com.example.osfix.controllers;

import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.ClientDto;
import com.example.osfix.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    private  final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/{id}")
    public Optional<Client> getClient(@PathVariable Long id) {
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
    @DeleteMapping
    public void deleteClient(@RequestParam ClientDto clientDto) {
        clientService.deleteClient(clientDto);
    }





}
