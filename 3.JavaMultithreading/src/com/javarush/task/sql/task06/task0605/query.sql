-- Write your code here:
CREATE TABLE users
(
    `user_id`    INT AUTO_INCREMENT,
    `first_name` VARCHAR(255)              NOT NULL,
    `last_name`  VARCHAR(255)              NOT NULL,
    `date`       DATE DEFAULT CURRENT_DATE NOT NULL,
    `weight`     FLOAT(10)                 NULL,
    PRIMARY KEY (user_id)
);