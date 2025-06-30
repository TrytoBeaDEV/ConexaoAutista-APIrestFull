# 🤝 Conexão Autista - Aplicativo de Apoio para o TEA 💙
> API RESTful desenvolvida com **Spring Boot** com foco na organização da rotina de pessoas com Transtorno do Espectro Autista (TEA), promovendo autonomia, inclusão e suporte aos responsáveis, profissionais e educadores.

## 📌 Visão Geral
O projeto **Conexão Autista** tem como objetivo principal oferecer um sistema híbrido (Web e Mobile) para:

- 🧠 Registrar o humor da pessoa autista diariamente
- ⏰ Agendar alarmes para medicações
- 📅 Organizar compromissos e sessões com terapeutas
- 👩‍⚕️ Localizar profissionais especializados
- 📊 Compartilhar dados com médicos, terapeutas e educadores
  
Essa API representa uma parte do backend desse sistema.

## 🚀 Tecnologias Utilizadas
- 💻 **Java 17**
- 🌱 **Spring Boot 3**
- 🐬 **MySQL** como banco de dados relacional
- 🔁 **JPA/Hibernate** para persistência
- 🧭 **Swagger UI** para documentação e testes
- ☕ **Maven** como gerenciador de dependências
- 🐙 **GitHub** para versionamento

  ## 📦**Instruções de como rodar a API:**

### **1. Clone o repositório:**
```
git clone https://github.com/TrytoBeaDEV/ConexaoAutista-APIrestFull.git
cd conexaoautista
```

### **2. Configure o banco de dados no MySQL:**
```
CREATE DATABASE conexaoautista;
```

### **3. Configure o application.properties:**
```
No caminho src/main/resources/application.properties, insira:
spring.datasource.url=jdbc:mysql://localhost:3306/conexaoautista
spring.datasource.username=seuUsuario
spring.datasource.password=suaSenha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
```

### **4. Execute o projeto com o maven:**
```
./mvnw spring-boot:run
```

## 🧪 Testando com Swagger
Após o projeto ser iniciado com sucesso, acesse:  
👉 ['http://localhost:8080/swagger-ui.html']

Você poderá testar os seguintes endpoints:
- ✅ GET /usuarios → Listar todos os usuários
- ✅ POST /usuarios → Cadastrar novo usuário
- ✅ PUT /usuarios/{id} → Atualizar usuário existente
- ✅ DELETE /usuarios/{id} → Deletar usuário
- ✅ GET /diarios → Listar registros de diário
- ✅ POST /diarios → Criar novo registro de diário
- ✅ PUT /diarios/{id} → Atualizar registro de diário
- ✅ DELETE /diarios/{id} → Excluir registro de diário

## 🧱 Estrutura da API 
📁 Camadas da aplicação (Padrão MVC)
- **Controller** – Responsável por lidar com as requisições HTTP.
- **Service** – Contém a lógica de negócio.
- **Repository** – Realiza a persistência de dados no banco.
- **Model** – Representa as entidades (tabelas do banco).

## 🧑‍💻 Entidades Principais  
🔹 Usuario
```
Campos: id, nome, email, senha, tipo
Enum: TipoUsuario { RESPONSAVEL, SAUDE, EDUCACAO }
```
🔹 DiarioHumor
```
Campos: id, data, humor, observacoes, usuario (relacionado)
```

## 👩‍💻 Desenvolvedores  
| Nome               | RA               |
|--------------------|------------------|
| Renata Andrade     | (2920482321037)  |
| Vitor Rezende      | (2920482321018)  |
| Priscila Romano    | (292048232)  |
| Higor Carlos       | (2920482321007)  |
| Davi Barbosa       | (292048232)  |

## 📚 Documentação Técnica  
- ✅ Projeto com arquitetura MVC
- ✅ API RESTful com retorno em JSON
- ✅ Persistência com JPA e Hibernate
- ✅ Banco relacional: MySQL
- ✅ Documentação automática com Swagger/OpenAPI
- ✅ Versionado com GitHub

## 📃 Licença  
``
Este projeto está licenciado sob os termos da MIT License. Consulte o arquivo LICENSE para mais informações.
``

## 💙 Por que esse projeto importa?  
> “A previsibilidade e a rotina são aspectos essenciais para reduzir crises e melhorar o comportamento adaptativo em pessoas com TEA.”  
— Temple Grandin





