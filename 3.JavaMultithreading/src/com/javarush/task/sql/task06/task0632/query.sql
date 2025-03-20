-- Write your code here:
ALTER TABLE event
    ADD CONSTRAINT fk_event_user
        FOREIGN KEY (user_id) REFERENCES users (id)
            ON UPDATE CASCADE
            ON DELETE SET NULL;