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


CREATE TABLE my_table22
(
    name    VARCHAR(20),
    address VARCHAR(20),
    country VARCHAR(20),
    primary key (name)
);
INSERT INTO my_table22
    (name, address, country)
VALUES ('kim', 'seoul', 'korea');
INSERT INTO my_table22
    (address, country)
VALUES ('jeju', 'usa');

CREATE TABLE my_table23
(
    name    VARCHAR(30),
    address VARCHAR(30),
    country VARCHAR(30),
    info    VARCHAR(30),
    PRIMARY KEY (name, address)
);


CREATE TABLE my_table24
(
    email    VARCHAR(100) NOT NULL,
    password VARCHAR(50)  NOT NULL,
    score    INT          NULL,
    name     VARCHAR(20)  NOT NULL,
    address  VARCHAR(200) NOT NULL,
    CONSTRAINT pk_my_table24 PRIMARY KEY (name, address)
);

# 복합키가 있는 my_table25 테이블 만들고 entity 만들어보기

# 복합키가 있는 Entity26 만들고 my_table26 만들어보기









