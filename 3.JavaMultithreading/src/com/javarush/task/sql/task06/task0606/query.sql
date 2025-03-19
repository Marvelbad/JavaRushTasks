-- Write your code here:
DROP TABLE IF EXISTS team;

CREATE TABLE team
(
    `position`  VARCHAR(100) NOT NULL,
    `full_name` VARCHAR(100) NOT NULL,
    `number`    INT          NOT NULL
);



INSERT INTO team (position, full_name, number)
VALUES ('Goalkeeper', 'Lev Yashin', 1),
       ('Right-back', 'Cafu', 2),
       ('Centre-back', 'Franz Beckenbauer', 3),
       ('Centre-back', 'Bobby Moore', 4),
       ('Left-back', 'Paolo Maldini', 5),
       ('Midfield', 'Johan Cruyff', 6),
       ('Midfield', 'Zinedine Zidane', 7),
       ('Midfield', 'Andrea Pirlo', 8),
       ('Midfield', 'Lothar Matthaus', 9),
       ('Striker', 'Pele', 10),
       ('Forward', 'Marco Van Basten', 11);