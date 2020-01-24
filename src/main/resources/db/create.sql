SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS users (
  id int PRIMARY KEY,
  email VARCHAR,
  userName VARCHAR,
  password VARCHAR,
  confirm VARCHAR,
  country VARCHAR,
  broker VARCHAR,
  account VARCHAR,
  login int,
  tradepassword VARCHAR
);