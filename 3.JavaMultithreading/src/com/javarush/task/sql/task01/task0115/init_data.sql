DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
    `id`         INT          not null auto_increment primary key,
    `name`       VARCHAR(100) not null,
    `salary`     INT          not null,
    `department` VARCHAR(200) null
);

insert into employee (id, name, salary, department)
values (1, 'Ravshan', 199, 'support'),
       (2, 'Jackie', 3200, 'hr'),
       (3, 'Mohamed', 3200, 'dev'),
       (4, 'Alice', 3100, 'management'),
       (5, 'Jack', 3500, 'dev'),
       (7, 'Mary', 1595, 'qa'),
       (8, 'Anna', 1593, 'hr'),
       (9, 'Kostik', 8765, 'dev'),
       (10, 'Dzhumshut', 201, 'support'),
       (11, 'John', 3200, 'management'),
       (12, 'Sarah', 3300, 'management')
       (13, 'Peter', 4999, 'sales')
       (14, 'John', 5001, 'dev')
       (15, 'Ema', 4321, 'dev')
;