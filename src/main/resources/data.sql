CREATE TABLE `user` (
                        user_id INT PRIMARY KEY,
                        blood_type VARCHAR(3),
                        email VARCHAR(255),
                        location VARCHAR(255),
                        name VARCHAR(255),
                        phone_number VARCHAR(15)
);
INSERT INTO `user` (user_id, blood_type, email, location, name, phone_number)
VALUES (1, 'O+', 'john.doe@example.com', 'New York', 'John Doe', '123-456-7890');
