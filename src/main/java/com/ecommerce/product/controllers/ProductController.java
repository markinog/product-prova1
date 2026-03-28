package com.ecommerce.product.controllers;

import com.ecommerce.product.entity.Product;
import com.ecommerce.product.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> criarProduto (@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> buscarPorId(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> buscarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }
}


