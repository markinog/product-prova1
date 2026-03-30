package com.ecommerce.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}
