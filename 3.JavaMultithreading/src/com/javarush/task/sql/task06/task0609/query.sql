-- Write your code here:
ALTER TABLE customers
    ADD COLUMN street   VARCHAR(255) NULL,
    ADD COLUMN city     VARCHAR(100) NULL,
    ADD COLUMN state    VARCHAR(100) NULL,
    ADD COLUMN zip_code VARCHAR(20)  NULL,
    ADD COLUMN country  VARCHAR(100) NULL;


INSERT INTO customers (customers.street, customers.city, customers.state, customers.zip_code, customers.country)
VALUES ('123 Main St', 'New York', 'NY', '10001', 'USA'),
       ('456 Maple Ave', 'Los Angeles', 'CA', '90001', 'USA'),
       ('789 Oak St', 'Chicago', 'IL', '60601', 'Testostan'),
       ('101 Pine St', 'Houston', 'TX', '77001', 'USA');


ALTER TABLE sale_addresses
    ADD COLUMN street   VARCHAR(255) NULL,
    ADD COLUMN city     VARCHAR(100) NULL,
    ADD COLUMN state    VARCHAR(100) NULL,
    ADD COLUMN zip_code VARCHAR(20)  NULL,
    ADD COLUMN country  VARCHAR(100) NULL;


INSERT INTO sale_addresses (street, city, state, zip_code, country)
SELECT street, city, state, zip_code, country
FROM customers
WHERE country != 'Testostan;