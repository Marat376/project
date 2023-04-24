--liquibase formatted sql

--changeset marat376:CRS-1_create_chat_table
CREATE TABLE IF NOT EXISTS chat
(
    id BIGINT PRIMARY KEY
);
