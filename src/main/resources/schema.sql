CREATE TABLE IF NOT EXISTS clothing (
    clothing_id IDENTITY,
    clothing_name VARCHAR(50) NOT NULL,
    year_of_creation INT NOT NULL,
    price DOUBLE NOT NULL,
    brand_from varchar(50) NOT NULL,
    created_at TIMESTAMP NOT NULL
);