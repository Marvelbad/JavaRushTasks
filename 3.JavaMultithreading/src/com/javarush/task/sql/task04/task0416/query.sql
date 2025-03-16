-- Write your code here:
SELECT RAND()  AS random_value,
       RAND(1) AS random_with_ssed_1,
       RAND(a) AS random_with_seed_a
FROM math;