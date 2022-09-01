package com.example.osfix.service;

import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.ClientDto;
import com.example.osfix.repository.ClientRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Optional<Client> getClient(Long id){
        return clientRepository.findById(id);
    }
    public void createClient(@NotNull ClientDto clientDto){
        Client client = new Client();
        client.setClientName(clientDto.getName());
        client.setWebsite(clientDto.getSite());
        client.setClientComment(clientDto.getComment());
        clientRepository.save(client);
    }
    public void updateClient(@NotNull ClientDto clientDto){
        Client client = new Client();
        client.setClientId(clientDto.getId());
        client.setClientName(clientDto.getName());
        client.setWebsite(clientDto.getSite());
        client.setClientComment(clientDto.getComment());
        clientRepository.save(client);
    }
    public void deleteClient(@NotNull ClientDto clientDto){
        Long clientId = clientDto.getId();
        clientRepository.deleteById(clientId);
    }



}
