DROP TABLE IF EXISTS lego_set;

CREATE TABLE lego_set
(
    `id`        INT          NOT NULL AUTO_INCREMENT,
    `number`    INT          NOT NULL,
    `name`      VARCHAR(100) NOT NULL,
    `released`  INT          NOT NULL,
    `inventory` INT          NOT NULL,
    PRIMARY KEY (`id`)
);