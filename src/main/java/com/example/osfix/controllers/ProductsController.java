package com.example.osfix.controllers;

import com.example.osfix.entity.DTO.ProductsDto;
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
    public void createClient(@RequestBody ProductsDto productsDto) {
        productsService.createProducts(productsDto);
    }
    @PutMapping
    public void updateClient(@RequestBody ProductsDto productsDto) {
        productsService.updateProducts(productsDto);
    }
    @DeleteMapping
    public void deleteClient(@RequestBody ProductsDto productsDto) {
        productsService.deleteProducts(productsDto);
    }

}
