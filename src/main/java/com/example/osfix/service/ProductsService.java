package com.example.osfix.service;

import com.example.osfix.entity.DTO.ProductsDto;
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

    public void createProducts(ProductsDto productsDto) {
        Products products = new Products();
        products.setProductName(productsDto.getProductName());
        products.setProductComment(productsDto.getProductComment());
        products.setProductWeight(productsDto.getProductWeight());
        productsRepository.save(products);
    }

    public void updateProducts(ProductsDto productsDto) {
        Products products = productsRepository.getReferenceById(productsDto.getId());
        if(productsDto.getProductName() != null)
            products.setProductName(productsDto.getProductName());
        if(productsDto.getProductComment() != null)
            products.setProductComment(productsDto.getProductComment());
        if(productsDto.getProductWeight() != 0)
            products.setProductWeight(productsDto.getProductWeight());
        productsRepository.save(products);
    }

    public void deleteProducts(ProductsDto productsDto) {
        Long productsId = productsDto.getId();
        productsRepository.deleteById(productsId);
    }
}
