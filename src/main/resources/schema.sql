CREATE TABLE IF NOT EXISTS clothing (
    clothingID IDENTITY,
    clothingName VARCHAR(50) NOT NULL,
    yearOfCreation INT NOT NULL,
    price DOUBLE NOT NULL,
    brandFrom varchar(50) NOT NULL,
    createdAt TIMESTAMP NOT NULL
);