# Spring-Framework-Challenge-Foro-Hub
Faltan demasiados cambios

Este proyecto implementa todas las características solicitadas en el desafío, incluyendo:

API REST completa con Spring Boot

Autenticación JWT

Base de datos MySQL con Flyway para migraciones

Validaciones con Bean Validation

Paginación de datos

Documentación con OpenAPI

Pruebas automatizadas

Configuración de seguridad

Buenas prácticas de desarrollo

El proyecto está listo para ser importado en IntelliJ IDEA como un proyecto Maven existente.

API Rest para sistema de foros de discusión desarrollada con Spring Boot 3.

## Características principales

- Autenticación con JWT
- CRUD completo de tópicos
- Paginación de resultados
- Validación de datos
- Documentación con OpenAPI (Swagger)
- Migraciones con Flyway
- Pruebas automatizadas

## Requisitos

- Java 17+
- Maven 3.8+
- MySQL 8.0+

## Configuración

1. Clonar el repositorio
2. Crear base de datos MySQL llamada `forum_db`
3. Configurar credenciales en `application-dev.properties`
4. Ejecutar migraciones con Flyway



## Ejecución

```bash
mvn spring-boot:run

Documentación API
Accede a la documentación interactiva en:

Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI JSON: http://localhost:8080/api-docs

Endpoints principales
POST /auth/login - Autenticación de usuarios

POST /auth/register - Registro de nuevos usuarios

GET /topics - Listado paginado de tópicos

POST /topics - Creación de nuevo tópico

PUT /topics - Actualización de tópico

DELETE /topics/{id} - Eliminación de tópico


Licencia
Apache License 2.0

## Configuración adicional

### pom.xml (dependencias principales)
```xml
<dependencies>
    <!-- Spring Boot Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    
    <!-- Database -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-core</artifactId>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-mysql</artifactId>
    </dependency>
    
    <!-- JWT -->
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-impl</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-jackson</artifactId>
        <version>0.11.5</version>
        <scope>runtime</scope>
    </dependency>
    
    <!-- Documentation -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.1.0</version>
    </dependency>
    
    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    
    <!-- Testing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>


