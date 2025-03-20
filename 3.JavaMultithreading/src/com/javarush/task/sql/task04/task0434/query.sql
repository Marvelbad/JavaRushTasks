-- Write your code here:
SELECT name,
       CHAR_LENGTH(name) AS length_in_chars,
       LENGTH(name)      AS length_in_bytes
FROM employee;