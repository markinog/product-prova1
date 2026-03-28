package com.ecommerce.product.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tools.jackson.databind.deser.jdk.StringArrayDeserializer;

import java.math.BigDecimal;

@Data
@Document(collection = "produtos")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
}
