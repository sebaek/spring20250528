USE jpa;

SELECT *
FROM customer;

INSERT INTO customer
    (customer_name, contact_name, address, city, postal_code, country)
SELECT customer_name, contact_name, address, city, postal_code, country
FROM customer;
SELECT COUNT(*)
FROM customer;

SELECT COUNT(*)
FROM customer
WHERE country = 'mexico';


CREATE TABLE my_table20
(
    name  VARCHAR(30),
    money INT,
    PRIMARY KEY (name)
);
INSERT INTO my_table20
    (name, money)
VALUES ('a', 10000),
       ('b', 10000);


create table my_table21
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(20),
    address     VARCHAR(20),
    inserted_at DATETIME NOT NULL DEFAULT NOW()
);

INSERT INTO my_table21
    (name, address)
VALUES ('lee', 'seoul');

INSERT INTO my_table21
    (name, address)
VALUES ('kim', 'busan');
SELECT *
FROM my_table21;












