# Product Service

## Descrição
Microsserviço responsável pelo gerenciamento do catálogo de produtos. Permite cadastrar, listar e consultar produtos do e-commerce.

## Pré-requisitos
- JDK 21
- Maven 3.8+
- MongoDB rodando na porta 27017

## Como Executar

1. Navegue até o diretório do serviço:
```bash
cd product-service
```

2. Execute o serviço:
```bash
mvn spring-boot:run
```

## Porta Utilizada
**8081**

## Endpoints

- `GET /products` - Listar todos os produtos
- `GET /products/{id}` - Buscar produto por ID
- `POST /products` - Cadastrar novo produto

## Banco de Dados
- Database: `product_db`
- Collection: `products`
