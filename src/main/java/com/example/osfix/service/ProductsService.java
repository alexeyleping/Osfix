package com.example.osfix.service;

import com.example.osfix.entity.Application;
import com.example.osfix.entity.Client;
import com.example.osfix.entity.DTO.CreateProductsDto;
import com.example.osfix.entity.DTO.ReturnApplicationDto;
import com.example.osfix.entity.DTO.ReturnProductsDto;
import com.example.osfix.entity.Products;
import com.example.osfix.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ReturnProductsDto getProducts(Long id) {
        Optional<Products> products = productsRepository.findById(id);
        ReturnProductsDto returnProductsDto = new ReturnProductsDto();
        returnProductsDto.setProductName(products.get().getProductName());
        returnProductsDto.setProductComment(products.get().getProductComment());
        returnProductsDto.setProductWeight(products.get().getProductWeight());
        return returnProductsDto;
    }

    public void createProducts(CreateProductsDto createProductsDto) {
        Products products = new Products();
        products.setProductName(createProductsDto.getProductName());
        products.setProductComment(createProductsDto.getProductComment());
        products.setProductWeight(createProductsDto.getProductWeight());
        productsRepository.save(products);
    }

    public void updateProducts(CreateProductsDto createProductsDto) {
        Products products = productsRepository.getReferenceById(createProductsDto.getId());
        if(createProductsDto.getProductName() != null)
            products.setProductName(createProductsDto.getProductName());
        if(createProductsDto.getProductComment() != null)
            products.setProductComment(createProductsDto.getProductComment());
        if(createProductsDto.getProductWeight() != 0)
            products.setProductWeight(createProductsDto.getProductWeight());
        productsRepository.save(products);
    }

    public void deleteProducts(CreateProductsDto createProductsDto) {
        Long productsId = createProductsDto.getId();
        productsRepository.deleteById(productsId);
    }
}
