
CREATE TABLE product

(

   id        INT PRIMARY KEY,

   product_name       VARCHAR(255) NOT NULL,

   product_price      INT         NOT NULL,

   default_price INT         NOT NULL

);
INSERT INTO product VALUES(1, 'Ordinateur portable' , 350, 120);
INSERT INTO product VALUES(2, 'Aspirateur Robot' , 500, 200);
INSERT INTO product VALUES(3, 'Table de Ping Pong' , 750, 400);
