
# 💄 BeautyHub

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Build](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-lightgray)
![Made with Love](https://img.shields.io/badge/made%20with-%E2%9D%A4-red)

**BeautyHub** é uma plataforma de agendamento de serviços de beleza. Atualmente é um W.I.P.
---

## 🚀 Tecnologias

- ✅ Java 17
- ✅ Spring Boot
  - Spring Web
  - Spring Data JPA
- ✅ MySQL
- ✅ Maven

---

## 📘 Roadmap

- [x] Backend monolítico com API REST
- [x] Organização em camadas (MVC)
- [ ] WebSocket para notificações ao vivo
- [ ] Refatoração em microsserviços
- [ ] Interface web com React ou HTML/CSS

---

## 📦 Entidades

- **User**: representa clientes e profissionais
- **Catalog**: serviços oferecidos (ex: manicure, corte)
- **Schedule**: agendamentos realizados

---

## 🛠 Como rodar o projeto localmente

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/sxellyn/beautyhub.git
   cd beautyhub
   ```

2. **Configure o banco de dados MySQL:**
   - Crie um banco chamado `beautyhub`
   - Atualize `src/main/resources/application.properties` com seu usuário e senha

3. **Rode o projeto:**
   - Via terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

---

## ❤️ Feito com carinho por [@sxellyn](https://github.com/sxellyn)
