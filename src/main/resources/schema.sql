    CREATE TABLE IF NOT EXISTS clothing (
    id IDENTITY,
    clothingID INT NOT NULL,
    clothingName VARCHAR(50) NOT NULL,
    yearOfCreation INT NOT NULL,
    price DOUBLE NOT NULL,
    brandFrom varchar(50) NOT NULL,
    createdAt TIMESTAMP NOT NULL
);