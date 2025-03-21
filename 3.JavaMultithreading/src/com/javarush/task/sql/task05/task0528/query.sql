-- Write your code here:
SELECT DISTINCT library.publisher.name
FROM book
JOIN library.author ON author.id = book.author_id
JOIN library.publisher ON book.publisher_id = publisher.id
WHERE author.full_name = 'Mark Twain';