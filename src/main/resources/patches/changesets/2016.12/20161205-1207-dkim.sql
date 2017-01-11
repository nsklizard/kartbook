BEGIN;

CREATE TABLE customers (
  id       SERIAL PRIMARY KEY,
  login    CHARACTER VARYING,
  password CHARACTER VARYING,
  name     CHARACTER VARYING,
  phone    CHARACTER VARYING,
  email    CHARACTER VARYING
);


CREATE TABLE karts (
  id       SERIAL PRIMARY KEY,
  name     CHARACTER VARYING,
  comments CHARACTER VARYING
);


CREATE TABLE slots (
  id         SERIAL PRIMARY KEY,
  startDate  TIMESTAMP,
  durationMS BIGINT,
  status     CHARACTER VARYING,
  bookUID    CHARACTER VARYING,

  kartId     BIGINT REFERENCES karts (id),
  customerId BIGINT REFERENCES customers (id)
);


COMMIT;
