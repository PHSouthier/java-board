# Java Board

Spring Boot API with PostgreSQL, containerized with Docker.

---

## Running with Docker (recommended)

This starts both the API and PostgreSQL database in containers.

```bash
# Build and start all services
docker compose up --build

# Start in background
docker compose up --build -d

# View logs (when running in background)
docker compose logs -f

# Stop all services
docker compose down

# Stop and remove volumes (resets the database)
docker compose down -v
```

The API will be available at `http://localhost:8080`.

---

## Database Migrations

Migrations are managed by [Liquibase](https://www.liquibase.org/) and run automatically on startup.

Migration files are located in `src/main/resources/migrations/`.

---

## Tech Stack

- Java 25
- Spring Boot 4.1.0
- Spring Data JPA
- Liquibase
- PostgreSQL 17
- Docker / Docker Compose
- Lombok
