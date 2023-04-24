--liquibase formatted sql

--changeset marat376:CRS-7_add_column_last_check_time
ALTER TABLE link
    ADD COLUMN
        last_check_time TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT now();


--changeset marat376:CRS-7_add_column_last_update_time
ALTER TABLE link
    ADD COLUMN
        last_update_time TIMESTAMP WITH TIME ZONE DEFAULT now();