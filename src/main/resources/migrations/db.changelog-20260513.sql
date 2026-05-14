--liquibase formatted sql
--changeset pedro:20260513
--comment: boards table create

CREATE TABLE BOARDS(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

--rollback DROP TABLE BOARDS