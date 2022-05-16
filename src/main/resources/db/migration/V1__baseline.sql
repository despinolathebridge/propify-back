CREATE TABLE address
(
    id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street   VARCHAR(100),
    city     VARCHAR(100),
    state    VARCHAR(100),
    zip      VARCHAR(100),
    timezone VARCHAR(100)
);

CREATE TABLE property_type
(
    id   INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50)
);

CREATE TABLE property
(
    id          INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    rent_price  FLOAT NOT NULL,
    create_time VARCHAR(50),
    email       VARCHAR(100),
    code        VARCHAR(100),
    type_id     FLOAT NOT NULL,
    address_id  FLOAT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES property_type (id),
    FOREIGN KEY (address_id) REFERENCES address (id)
);
