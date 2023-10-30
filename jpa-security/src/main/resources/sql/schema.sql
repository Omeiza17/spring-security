CREATE SEQUENCE users_id_seq START 1 INCREMENT 50;

CREATE TABLE users
(
    id       INTEGER      NOT NULL DEFAULT nextval('users_id_seq'),
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    roles    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);