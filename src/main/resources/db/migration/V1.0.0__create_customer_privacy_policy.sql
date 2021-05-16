CREATE TABLE customer (
            customer_id VARCHAR (100),
            name VARCHAR (30) NOT NULL,
            number_id VARCHAR (30) NOT NULL,
            cellphone_number VARCHAR (20) NOT NULL,
            PRIMARY KEY (customer_id)
);

CREATE TABLE privacy_policy (
            customer_id VARCHAR (100),
            otp VARCHAR (4),
            create_date DATETIME NOT NULL,
            update_date DATETIME,
            accepted BOOLEAN NOT NULL,
            PRIMARY KEY (customer_id, otp)
);