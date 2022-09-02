package com.example.osfix.controllers;

import com.example.osfix.controllers.dto.ProductsDto;
import com.example.osfix.controllers.dto.ReturnApplicationDto;
import com.example.osfix.controllers.dto.ReturnProductsDto;
import com.example.osfix.entity.Products;
import com.example.osfix.service.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/application/{id}")
    public List<Products> getAllBy(@PathVariable(value = "id") Long applicationId) {
        return productsService.getAllBy(applicationId);
    }
}
