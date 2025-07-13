## ✅ Day 1 – Environment Setup & Git Init

### 🧰 Tools Installed
- Java JDK 17 (Adoptium)
- Node.js v22 LTS
- Git v2.50
- Docker Desktop

### 🗂️ Project Folder Structure
- /backend
- /frontend
- /docs

### 📄 Files Added
- .gitignore
- README.md
- progress.md

### 🔄 Git & GitHub
- Git repo initialized locally
- Connected to remote GitHub repo
- Pushed first commit

### 🔗 Repo Link
[github.com/yuvareddy2005/ecommerce-platform](https://github.com/yuvareddy2005/ecommerce-platform)

### 🧠 Learned
- Installing and configuring all dev tools on Windows 11
- Creating a clean project structure
- Using Git + GitHub from terminal

---

## ✅ Day 2 – Backend Auth Microservice Setup

### 📦 Service Created: `auth-service`
- Created using Spring Initializr (Maven, Java 17, Spring Boot)
- Artifact: `authservice`
- Package name: `com.ecommerce.authservice`

### 🔧 Dependencies Added:
- Spring Web (REST APIs)
- Spring Security (authentication)
- Spring Data JPA (database interaction)
- PostgreSQL Driver
- Lombok (to reduce boilerplate code)

### 🧠 Architecture Setup:
- Defined clean folder structure:
  - `controller/` – API entrypoints
  - `service/` – business logic
  - `domain/` – model/entity classes (coming soon)
  - `repository/` – data access layer
  - `config/` – security and application config
- Disabled `DataSourceAutoConfiguration` to prevent DB errors temporarily
- Disabled Spring Security temporarily using custom `SecurityConfig.java`

### 🧪 Endpoint Added:
- **GET `/api/auth/test`**
  - Returns `Auth service is up ✅`
  - Confirms microservice is up and routes are working

### 🧰 Tools Used:
- Spring Initializr
- Maven wrapper (`mvnw spring-boot:run`)
- VS Code
- PowerShell
- Git + GitHub

### 🔄 GitHub Activity:
- Initialized `auth-service` under `backend/`
- Committed:
  - Clean project structure
  - Test endpoint controller
  - Security config
- Pushed all code to GitHub:
  [github.com/yuvareddy2005/ecommerce-platform](https://github.com/yuvareddy2005/ecommerce-platform)

### 🧠 What I Learned:
- How to scaffold a Spring Boot microservice
- How Spring routing and annotation-based endpoints work
- Why the app failed without DB config, and how to bypass it
- How to build REST APIs and test them locally
- What `localhost`, ports, and endpoint paths really mean
- Git CLI best practices (`git add .`, `git commit -m`, `git push`)
- Interpreting Git line-ending warnings (`LF` → `CRLF`)

✅ **End of Day 2** — The authentication microservice has been initialized and verified locally.

---