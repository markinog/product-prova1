package com.ecommerce.product.services;

import com.ecommerce.product.entity.Product;
import com.ecommerce.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(String id){
        return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Nenhum produto encontrado com o id "+id));
    }

    public Product create(Product product){
        return productRepository.save(product);
    }
}
