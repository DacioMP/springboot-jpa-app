# EasyBuy
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/DacioMP/springboot-jpa-app/blob/main/LICENSE)

# Sobre o projeto
O EasyBuy é um gerenciador de pedidos de produtos no qual implementa-se todas as operções de CRUD.

O web service foi criado durante o curso **Programação Orientada a Objetos com Java**, ministrado pelo professor Nélio Alves, e conta com as tecnologias Spring Boot e Spring Data JPA.
 
## Modelo de domínio
![Modelo Conceitual](https://github.com/DacioMP/assets/raw/main/easybuy_domain_model.PNG)

# Tecnologias utilizadas :coffee:
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- H2
- Maven

# Como executar o projeto

## Perfil de teste
Pré-requisitos: Java 17

1. Clonar repositório.
```bash
git clone git@github.com:DacioMP/springboot-jpa-app.git
```
2. Abrir o arquivo application.properties.
```bash
vi springboot-jpa-app/src/main/resources/application.properties
```
3. Pressionar a tecla "i" e alterar a propriedade *spring.profiles.active* para o valor *test*.
4. Após a alteração, pressionar a tecla "esc", em seguida ":wq" e depois "enter" para salvar e sair do arquivo.
```bash
spring.application.name=course
spring.profiles.active=test
spring.jpa.open-in-view=true
```
5. Executar o projeto
```bash
cd springboot-jpa-app/
./mvnw compile
./mvnw package
java -jar target/course-0.0.1-SNAPSHOT.jar
```
## Perfil de desenvolvimento
Pré-requisitos: Java 17 e PostgreSQL 16

1. Clonar repositório.
```bash
git clone git@github.com:DacioMP/springboot-jpa-app.git
```
2. Executar o projeto
```bash
cd springboot-jpa-app/
./mvnw compile
./mvnw package
java -jar target/course-0.0.1-SNAPSHOT.jar
```

# Autor
Matheus Pedrosa Dácio

[![LinkedIn](https://skillicons.dev/icons?i=linkedin)](https://www.linkedin.com/in/daciomp/)
