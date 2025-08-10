#TP1 - Desenvolvimento de Serviços com Spring Boot

Serviço web REST **sem estado** para operações matemáticas básicas: **adição**, **subtração**, **multiplicação**, **divisão** e **exponenciação**.  
Desenvolvido como projeto acadêmico utilizando **Java 21**, **Spring Boot** e **Maven**.

---

## 📌 Objetivo
Demonstrar o uso do **Spring Boot** para criação de serviços REST simples e organizados, aplicando boas práticas como:
- Separação em camadas (Controller, Service, DTOs).
- Tratamento de erros.
- Respostas JSON padronizadas.
- Testes unitários e de integração.

---

## 🚀 Tecnologias
- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- **Spring Web**
- **Spring Boot Starter Validation**
- **Spring Boot Starter Test**
- **Lombok** *(opcional)*
- **DevTools** *(opcional)*

---

## 📂 Estrutura do Projeto
```
src
 └── main
     ├── java
     │    └── br.edu.infnet.mathservice
     │         ├── CalculadoraApplication.java
     │         ├── controller
     │         │     └── MathController.java
     │         ├── service
     │         │     └── CalculatorService.java
     │         ├── dto
     │         │     ├── OperationRequest.java
     │         │     └── OperationResponse.java
     │         └── exception
     │               ├── GlobalExceptionHandler.java
     │               └── DivideByZeroException.java
     └── resources
           ├── application.properties
           └── ...
```

---

## ⚙️ Como Executar

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/calculadora-rest-academica.git
cd calculadora-rest-academica
```

### 2️⃣ Rodar com Maven Wrapper
```bash
./mvnw spring-boot:run
```
> No Windows:
```powershell
mvnw spring-boot:run
```

O serviço estará disponível em:
```
http://localhost:8080/api/v1/math
```

---

## 📡 Endpoints Disponíveis

| Operação       | Método | Endpoint | Exemplo de Chamada |
|----------------|--------|----------|--------------------|
| Adição         | GET    | `/add`        | `/add?a=5&b=3` |
| Subtração      | GET    | `/subtract`   | `/subtract?a=5&b=3` |
| Multiplicação  | GET    | `/multiply`   | `/multiply?a=5&b=3` |
| Divisão        | GET    | `/divide`     | `/divide?a=6&b=3` |
| Exponenciação  | GET    | `/power`      | `/power?base=2&exp=3` |

---

## 📥 Exemplos de Uso

### Adição
```bash
curl "http://localhost:8080/api/v1/math/add?a=5&b=3"
```
**Resposta:**
```json
{
  "operation": "add",
  "a": 5,
  "b": 3,
  "result": 8
}
```

### Divisão (com erro)
```bash
curl "http://localhost:8080/api/v1/math/divide?a=6&b=0"
```
**Resposta:**
```json
{
  "error": "DIVIDE_BY_ZERO",
  "message": "Divisor must not be zero."
}
```

---

## 🧪 Testes
Para rodar todos os testes:
```bash
./mvnw test
```
> Os testes incluem verificações unitárias para o `CalculatorService` e testes de integração para o `MathController`.

---

## 📄 Licença
Projeto de uso acadêmico — livre para estudo e modificação.

---


