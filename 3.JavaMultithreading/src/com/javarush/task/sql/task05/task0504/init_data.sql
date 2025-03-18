DROP TABLE IF EXISTS author;

CREATE TABLE author
(
    `id`         INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(50)  DEFAULT NULL,
    `last_name`  VARCHAR(50)  DEFAULT NULL,
    `full_name`  VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
)