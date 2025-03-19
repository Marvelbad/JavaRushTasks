-- Write your code here:
ALTER TABLE customers
    ADD COLUMN `sup_rank`    INT          NULL,
    ADD COLUMN `sup_name`    VARCHAR(100) NULL,
    ADD COLUMN `sup_country` VARCHAR(100) NULL,
    ADD COLUMN `sup_revenue` INT          NULL;




-- SHOW CREATE TABLE suppliers // Getting snippet code below

# CREATE TABLE `suppliers`
# (
#     `sup_rank`    int          NOT NULL,
#     `sup_name`    varchar(100) NOT NULL,
#     `sup_country` varchar(100) NOT NULL,
#     `sup_revenue` int          NOT NULL
# ) ENGINE = InnoDB
#   DEFAULT CHARSET = utf8mb4
#   COLLATE = utf8mb4_0900_ai_ci