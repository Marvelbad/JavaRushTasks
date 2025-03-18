DROP TABLE IF EXISTS object;

CREATE TABLE object
(
    `id`             INT NOT NULL AUTO_INCREMENT,
    `name`           VARCHAR(100) DEFAULT NULL,
    `type`           VARCHAR(100) DEFAULT NULL,
    `discoverer`     VARCHAR(100) DEFAULT NULL,
    `discovery_date` DATE         DEFAULT NULL,
    PRIMARY KEY (`id`)
);