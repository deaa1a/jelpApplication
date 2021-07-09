CREATE TABLE customer (
            customer_id VARCHAR (100),
            first_name VARCHAR (10) NOT NULL,
            second_name VARCHAR (10) ,
            first_surname VARCHAR (10) ,
            second_surname VARCHAR (10) ,
            cellphone_number VARCHAR (20) NOT NULL,
            number_id VARCHAR (30) NOT NULL,
            date_of_issue VARCHAR (30) ,
            expedition_place VARCHAR (30),
            place_of_birth VARCHAR (30) ,
            address VARCHAR (30) ,
            email VARCHAR (30) ,
            city_residence VARCHAR (30),
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

