--liquibase formatted sql


--changeset marat376:CRS-6_add_index_to_link_url
CREATE INDEX idx_link_url ON link (url);