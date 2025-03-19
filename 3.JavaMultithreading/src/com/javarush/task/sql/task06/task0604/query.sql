-- Write your code here:
DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    `user_id`         INT AUTO_INCREMENT,
    `first_name` VARCHAR(255),
    `last_name`  VARCHAR(255),
    PRIMARY KEY (`user_id`)
);