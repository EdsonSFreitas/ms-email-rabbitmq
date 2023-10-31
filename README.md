<h1 align="center">:file_cabinet: Microservices de Consumer com comunicação assíncrona e RabbitMQ</h1>

## :memo: Resumo do projeto
* Microservices email consumer para comunicação assíncrona não bloqueante com RabbitMQ;

## :books: Objetivo do projeto
* Implementar microservices entre user e email utilizando mensageria com Spring RabbitMQ disparando e-mails via SMTP Google a cada registro de usuário.

## :books: Funcionalidades implementadas
* Consome mensagens geradas pelo Microservice user e grava no banco os dados de email;
* Envia e-mail para o destinatório conforme conteúdo da mensagem obtida via queue do RabbitMQ;
* Rotinas básicas de boas práticas (Organização dos pacotes, validações, uso de DTOs etc.)

## :wrench: Tecnologias utilizadas
* Spring Boot Web
* Spring RabbitMQ
* PostgreSQL Driver (Para prod)
* H2 Database (para ambiente dev)
* Lombok
* Validation
* Spring Email
* Spring Data JPA
* Java 17
* Serviço de mensageria do CloudAMPQ

## :rocket: Executando o projeto

Pré-requisitos:
1. Em andamento

## :soon: Implementação futura
* Em andamento

## :dart: Status do projeto
* Em andamento