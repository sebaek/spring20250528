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
