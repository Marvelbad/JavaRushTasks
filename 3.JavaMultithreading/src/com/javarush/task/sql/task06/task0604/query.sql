-- Write your code here:
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    `user_id`    INT AUTO_INCREMENT NOT NULL,
    `first_name` VARCHAR(255)       NOT NULL,
    `last_name`  VARCHAR(255)       NOT NULL,
    PRIMARY KEY (`user_id`)
);