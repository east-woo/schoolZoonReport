CREATE TABLE Users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL,
                       password VARCHAR(100) NOT NULL,
                       email VARCHAR(100) NOT NULL,
                       role VARCHAR(20) NOT NULL
);
CREATE TABLE Reports (
                         report_id SERIAL PRIMARY KEY,
                         user_id INT REFERENCES Users(user_id),
                         location VARCHAR(100) NOT NULL,
                         report_date TIMESTAMP NOT NULL,
                         description TEXT,
                         status VARCHAR(20) NOT NULL
);
CREATE TABLE Vehicles (
                          vehicle_id SERIAL PRIMARY KEY,
                          license_plate VARCHAR(20) NOT NULL,
                          make VARCHAR(50),
                          model VARCHAR(50),
                          color VARCHAR(50),
                          user_id INT REFERENCES Users(user_id)
);
CREATE TABLE Images (
                        image_id SERIAL PRIMARY KEY,
                        report_id INT REFERENCES Reports(report_id),
                        image_path VARCHAR(200) NOT NULL,
                        uploaded_date TIMESTAMP NOT NULL
);

