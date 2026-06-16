# API Gateway Project

## Description

Ce projet est une API Gateway développée avec Spring Boot et Spring Cloud Gateway.

L'objectif est de centraliser les requêtes des clients, gérer l'authentification JWT, appliquer le Rate Limiting avec Redis et préparer une architecture Microservices.

---

## Technologies utilisées

- Java 21
- Spring Boot 3.2.5
- Spring Cloud Gateway
- Spring WebFlux
- Redis
- JWT (JSON Web Token)
- Maven
- Git
- GitHub

---

## Architecture

Client
|
API Gateway
|
+-------------------+
| |
Auth Service User Service
| |
Redis Database

---

## Fonctionnalités

### API Gateway

- Centralisation des requêtes
- Routage vers les microservices
- Gestion des routes

### JWT Authentication

- Génération de tokens JWT
- Validation des tokens
- Authentification stateless

### Redis Rate Limiting

- Limitation du nombre de requêtes
- Protection contre les abus
- Gestion distribuée des quotas

### Microservices Ready

Le projet est conçu pour accueillir :

- Auth Service
- User Service
- Product Service
- Order Service
- Payment Service

---

## Structure du projet

src

main

resources

application.yml

test

java

com.gateway

ApiGatewayApplication.java

controller

AuthController.java

TestController.java

security

JwtUtil.java

---

## Endpoints disponibles

### Génération d'un token

GET

```http
/auth/token?username=yasmine
```

Exemple de réponse :

```text
eyJhbGciOiJIUzI1NiJ9...
```

---

### Test API

GET

```http
/service/test
```

Réponse :

```text
API Gateway Working
```

---

## Installation

### Cloner le projet

```bash
git clone https://github.com/belyasmin2006-star/api-gateway.git
```

### Accéder au projet

```bash
cd api-gateway
```

### Compiler

```bash
mvn clean install
```

### Exécuter

```bash
mvn spring-boot:run
```

---

## Configuration Redis

Dans application.yml :

```yaml
spring:
  data:
    redis:
      host: localhost
      port: 6379
```

---

## JWT

Les tokens contiennent :

- sub : utilisateur
- iat : date de création
- exp : date d'expiration

Exemple :

```json
{
  "sub": "yasmine",
  "iat": 1781637338,
  "exp": 1781640938
}
```

---

## Git Workflow

```bash
git add .
git commit -m "Update project"
git push
```

---

## Améliorations futures

- Spring Security
- JWT Filter
- Swagger/OpenAPI
- Docker
- Docker Compose
- Load Balancer
- Service Discovery
- Monitoring
- Logging
- CI/CD

---

## Auteur

Yasmine B.

Projet réalisé dans le cadre de l'apprentissage de :

- Spring Boot
- API Gateway
- JWT
- Redis
- Microservices
- Git & GitHub
