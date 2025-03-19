-- Write your code here:
ALTER TABLE cars
    ADD COLUMN `brand`       VARCHAR(50) NOT NULL,
    ADD COLUMN `model`       VARCHAR(50) NOT NULL,
    ADD COLUMN `year`        INT         NOT NULL,
    ADD COLUMN `engine`      VARCHAR(50) NOT NULL,
    ADD COLUMN `consumption` FLOAT       NOT NULL;

INSERT INTO cars (cars.brand, cars.model, cars.year, cars.engine, cars.consumption)
VALUES ('Lexus', 'IS', 2017, 'petrol', 7.5),
       ('Volvo', 'XC90', 2019, 'diesel', 8.5),
       ('Volkswagen', 'Golf', 2020, 'petrol', 8),
       ('Toyota', 'Corolla', 2015, 'petrol', 10),
       ('BMW', '5', 2005, 'petrol', 15.5),
       ('Ford', 'Transit', 2010, 'diesel', 9);