package com.example.osfix.service;

import com.example.osfix.entity.Client;
import com.example.osfix.repository.ApplicationRepository;
import com.example.osfix.repository.ClientRepository;
import com.example.osfix.repository.ProductsRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Service
public class WebService {
    private  final ApplicationRepository applicationRepository;
    private  final ClientRepository clientRepository;
    private  final ProductsRepository productsRepository;

    public WebService(ApplicationRepository applicationRepository, ClientRepository clientRepository, ProductsRepository productsRepository) {
        this.applicationRepository = applicationRepository;
        this.clientRepository = clientRepository;
        this.productsRepository = productsRepository;
    }

    @GetMapping
    public Optional<Client> getClient(Long id){
        return clientRepository.findById(id);
    }

    @PostMapping
    public void createClient(String name, String webSite, String clientComment){
        Client client = new Client();
        client.setClientName(name);
        client.setWebsite(webSite);
        client.setClientComment(clientComment);
        clientRepository.save(client);
    }

    @DeleteMapping
    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    @PutMapping
    public void updateClient(Long id, String name, String webSite, String clientComment){
        Client client = new Client();
        client.setClientId(id);
        client.setClientName(name);
        client.setWebsite(webSite);
        client.setClientComment(clientComment);
        clientRepository.save(client);
    }

}
