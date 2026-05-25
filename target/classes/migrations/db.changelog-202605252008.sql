--liquibase formatted sql
--changeset pedro:202605252008
--comment: blocks table create

CREATE TABLE BLOCKS(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    block_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    block_reason VARCHAR(255) NOT NULL,
    unblock_at TIMESTAMP NULL,
    unblock_reason VARCHAR(255) NOT NULL,
    card_id BIGINT NOT NULL,
    CONSTRAINT cards__blocks_fk FOREIGN KEY (card_id) REFERENCES CARDS(id) ON DELETE CASCADE
);

--rollback DROP TABLE BLOCKS
