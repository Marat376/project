--liquibase formatted sql


--changeset marat376:CRS-3_subscription_table
CREATE TABLE IF NOT EXISTS subscription
(
    chat_id BIGINT REFERENCES chat ON DELETE CASCADE,
    link_id BIGINT REFERENCES link ON DELETE RESTRICT
);
