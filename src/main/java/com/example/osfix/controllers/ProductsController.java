package com.example.osfix.controllers;

import com.example.osfix.entity.DTO.CreateClientDto;
import com.example.osfix.entity.DTO.CreateProductsDto;
import com.example.osfix.entity.DTO.ReturnClientDto;
import com.example.osfix.entity.DTO.ReturnProductsDto;
import com.example.osfix.service.ProductsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping(value = "/{id}")
    public ReturnProductsDto getProducts(@PathVariable Long id) {
        return productsService.getProducts(id);
    }
    @PostMapping
    public void createClient(@RequestBody CreateProductsDto createProductsDto) {
        productsService.createProducts(createProductsDto);
    }
    @PutMapping
    public void updateClient(@RequestBody CreateProductsDto createProductsDto) {
        productsService.updateProducts(createProductsDto);
    }
    @DeleteMapping
    public void deleteClient(@RequestBody CreateProductsDto createProductsDto) {
        productsService.deleteProducts(createProductsDto);
    }

}
