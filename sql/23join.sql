USE mydatabase;

CREATE TABLE table34
(
    name VARCHAR(1)
);

CREATE TABLE table35
(
    score INT
);


INSERT INTO table34
    (name)
VALUES ('a'),
       ('b'),
       ('c'),
       ('d'),
       ('c');
INSERT INTO table35
    (score)
VALUES (5),
       (4),
       (3),
       (3),
       (5);

SELECT *
FROM table34;
SELECT *
FROM table35;

# 행은 25개, 열 2개
SELECT *
FROM table34,
     table35;


# 행 616, 열 9
SELECT *
FROM w3schools.Products,
     w3schools.Categories;

SELECT *
FROM w3schools.Products
         JOIN
     w3schools.Categories;

# Cartesian Product (카테시안 곱)

CREATE TABLE table36
(
    `대회`  VARCHAR(20),
    `연도`  INT,
    `우승자` VARCHAR(30),
    PRIMARY KEY (`대회`, `연도`)
);
CREATE TABLE table37
(
    `우승자`  VARCHAR(30),
    `생년월일` VARCHAR(100),
    PRIMARY KEY (`우승자`)
);
INSERT INTO table36
    (대회, 연도, 우승자)
VALUES ('D', '1998', 'chip'),
       ('I', '1998', 'al'),
       ('C', '1999', 'bob'),
       ('D', '1999', 'al'),
       ('I', '1999', 'chip');
INSERT INTO table37
    (우승자, 생년월일)
VALUES ('chip', '77-3-14'),
       ('al', '75-7-21'),
       ('bob', '68-9-28');


SELECT *
FROM table36;
SELECT *
FROM table37;

# 카테시안 곱
SELECT *
FROM table36
         JOIN
     table37;

SELECT *
FROM table36
         JOIN
     table37
WHERE table36.우승자 = table37.우승자;

SELECT *
FROM table36
         JOIN
     table37
     ON table36.우승자 = table37.우승자;









