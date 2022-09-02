package com.example.osfix.service;

import com.example.osfix.entity.Application;
import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.ClientDto;
import com.example.osfix.entity.DTO.ReturnClientDto;
import com.example.osfix.repository.ApplicationRepository;
import com.example.osfix.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ApplicationRepository applicationRepository;

    public ClientService(ClientRepository clientRepository, ApplicationRepository applicationRepository) {
        this.clientRepository = clientRepository;
        this.applicationRepository = applicationRepository;
    }

    public ReturnClientDto getClient(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        ReturnClientDto returnClientDto = new ReturnClientDto();
        returnClientDto.setName(client.get().getClientName());
        returnClientDto.setWebsite(client.get().getWebsite());
        returnClientDto.setComment(client.get().getClientComment());
        return returnClientDto;
    }

    public void createClient(ClientDto clientDto) {
        Client client = new Client();
        client.setClientName(clientDto.getName());
        client.setWebsite(clientDto.getSite());
        client.setClientComment(clientDto.getComment());
        clientRepository.save(client);
    }

    public void updateClient(ClientDto clientDto) {
        Client client = clientRepository.getReferenceById(clientDto.getId());
        if(clientDto.getName() != null)
            client.setClientName(clientDto.getName());
        if(clientDto.getSite() != null)
            client.setWebsite(clientDto.getSite());
        if(clientDto.getComment() != null)
            client.setClientComment(clientDto.getComment());
        clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public List<Application> getAllBy(Long clientId){
        List<Application> list = applicationRepository.findAllByClientId(clientId);
        return list;
    }
}
