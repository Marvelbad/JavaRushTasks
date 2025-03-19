-- Write your code here:
SELECT DISTINCT publisher.name
FROM book
JOIN author ON author.id = book.author_id
JOIN publisher ON book.publisher_id = publisher.id
WHERE author.full_name = 'Mark Twain';