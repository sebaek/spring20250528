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
CREATE TABLE my_table25
(
    class_number   INT,
    student_number INT,
    name           VARCHAR(20),
    score          INT,
    PRIMARY KEY (class_number, student_number)
);

# 복합키가 있는 Entity26 만들고 my_table26 만들어보기
CREATE TABLE my_table26
(
    country VARCHAR(255) NULL,
    state   VARCHAR(255) NULL,
    phone   VARCHAR(15)  NOT NULL,
    name    VARCHAR(255) NOT NULL,
    number  INT          NOT NULL,
    CONSTRAINT pk_my_table26 PRIMARY KEY (name, number)
);


# foreign key (외래키, 참조키, FK)
CREATE TABLE my_table27
(
    id            INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(30),
    info          VARCHAR(1000)
);

CREATE TABLE my_table28
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(30),
    price        INT,
    unit         VARCHAR(30),
    category_id  INT NOT NULL,
    FOREIGN KEY (category_id) REFERENCES my_table27 (id)
);


CREATE TABLE my_table29
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(10),
    last_name  VARCHAR(10),
    birth_date DATE
);

CREATE TABLE my_table30
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    order_date  DATE,
    info        VARCHAR(20),
    employee_id INT,
    FOREIGN KEY (employee_id) REFERENCES my_table29 (id)
);

# 연습 : 29,30 엔티티 만들기
# repository * 2 만들기
    
# insert 해보기
# select 해보기

# request handler method *4
# service method *4







