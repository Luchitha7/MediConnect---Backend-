# MediConnect Backend (clean rebuild)

A Spring Boot backend for MediConnect, rebuilt from scratch to **learn the
concepts** clearly. It connects to the existing React frontend by matching the
same HTTP API contract the frontend already expects.

## Tech
- Java 17, Spring Boot 3.5.x, Maven
- (added stage by stage) Spring Data JPA, MySQL, Spring Security + JWT

## Run it
```bash
./mvnw spring-boot:run
```
Then visit http://localhost:8081/api/health — you should see a JSON "UP" response.

> Local DB settings (Stage 1+) go in `src/main/resources/application-local.properties`,
> which is gitignored because it holds a password. Run with the local profile:
> `./mvnw spring-boot:run -Dspring-boot.run.profiles=local`

## Architecture (the layers, top to bottom)
```
HTTP  ->  @RestController  ->  @Service  ->  @Repository  ->  @Entity  ->  MySQL
            (web layer)       (logic)       (DB access)      (tables)
```

## Learning roadmap (each stage = one new concept + a working feature)
- [x] **Stage 0** – Project that runs; `/api/health` endpoint. *(web layer basics)*
- [ ] **Stage 1** – Connect to MySQL; first `User` entity + repository. *(JPA)*
- [ ] **Stage 2** – `POST /api/auth/login` with JWT. *(Spring Security)*
- [ ] **Stage 3** – Register patient/doctor. *(DTOs + validation)*
- [ ] **Stage 4** – Patients / doctors / profile. *(services + relationships)*
- [ ] **Stage 5** – Appointments, prescriptions, records, feedback. *(CRUD)*
- [ ] **Stage 6** – Notifications, health tips, admin. *(everything together)*

The old (messy) backend in `san-rat/MediConnect` is kept only as a reference /
"answer key" — read it to understand, then write the clean version here.
