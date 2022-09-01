package com.example.osfix.service;

import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.CreateClientDto;
import com.example.osfix.entity.DTO.ReturnClientDto;
import com.example.osfix.repository.ClientRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ReturnClientDto getClient(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        ReturnClientDto returnClientDto = new ReturnClientDto();
        returnClientDto.setName(client.get().getClientName());
        returnClientDto.setWebsite(client.get().getWebsite());
        returnClientDto.setComment(client.get().getWebsite());
        return returnClientDto;
    }

    public void createClient(@NotNull CreateClientDto createClientDto) {
        Client client = new Client();
        client.setClientName(createClientDto.getName());
        client.setWebsite(createClientDto.getSite());
        client.setClientComment(createClientDto.getComment());
        clientRepository.save(client);
    }

    public void updateClient(@NotNull CreateClientDto createClientDto) {
        Client client = clientRepository.getReferenceById(createClientDto.getId());
        if(createClientDto.getName() != null)
            client.setClientName(createClientDto.getName());
        if(createClientDto.getSite() != null)
            client.setWebsite(createClientDto.getSite());
        if(createClientDto.getComment() != null)
            client.setClientComment(createClientDto.getComment());
        clientRepository.save(client);
    }

    public void deleteClient(@NotNull CreateClientDto createClientDto) {
        Long clientId = createClientDto.getId();
        clientRepository.deleteById(clientId);
    }
}
