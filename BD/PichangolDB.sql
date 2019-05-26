DROP DATABASE IF EXISTS Pichangol;

CREATE DATABASE Pichangol;

USE Pichangol;


CREATE TABLE IF NOT EXISTS tb_account(
id int auto_increment  not null,
email varchar(70) not null,
password varchar(30) not null,
accType char(1) not null,
status char(1) not null,
PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS tb_profile(
id int auto_increment not null,
account_id int ,
full_name varchar(70) not null,
email varchar(70) not null,
phone1 varchar(9),
phone2 varchar(9),
phone3 varchar(9),
dni char(8),
created_at datetime default now(),
updated_at datetime default now(),
status int not null,
PRIMARY KEY (id),
FOREIGN KEY (account_id) REFERENCES tb_account(id)
);



CREATE TABLE IF NOT EXISTS tb_local(
id int auto_increment  not null,
admin_id int not null,
address varchar(200) not null,
description varchar(400),
latitude float not null,
longitude float not null,
created_at datetime default now(),
updated_at datetime default now(),
deleted_at datetime null,
status char(1) not null,
PRIMARY KEY (id),
FOREIGN KEY (admin_id) REFERENCES tb_account(id)
);




CREATE TABLE IF NOT EXISTS tb_court(
id int auto_increment  not null,
local_id int not null,
capacity int not null,
price decimal(6,2) not null,
status char(1) not null,
PRIMARY KEY (id),
FOREIGN KEY (local_id) REFERENCES tb_local(id)
);






CREATE TABLE IF NOT EXISTS tb_match(
id int auto_increment not null,
court_id int not null,
user_id int not null,
price decimal(6,2) not null,
paid_amount decimal(6,2) not null,
reserved_at datetime not null,
match_date datetime not null,
match_hours int not null,
PRIMARY KEY (id),
FOREIGN KEY (court_id) REFERENCES tb_court(id),
FOREIGN KEY (user_id) REFERENCES tb_account(id)
);





CREATE TABLE IF NOT EXISTS tb_review(
id int auto_increment not null,
account_id int not null,
local_id int not null,
stars int not null,
commentary varchar(400) not null,
PRIMARY KEY (id),
FOREIGN KEY (account_id) REFERENCES tb_account(id),
FOREIGN KEY (local_id) REFERENCES tb_local(id)
);

INSERT INTO `tb_account`(`email`, `password`, `accType`, `status`) VALUES ("asd@asd.com","facil123","1",1);
INSERT INTO `tb_account`(`email`, `password`, `accType`, `status`) VALUES ("qwe@asd.com","facil123","2",1);

INSERT INTO `tb_local`(`admin_id`, `address`, `description`, `latitude`, `longitude`, `created_at`, `updated_at`, `deleted_at`, `status`) VALUES (1,"Calle Mártir José Olaya 114","Cancha 1",-12.119978,-77.030222,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,null,1);
INSERT INTO `tb_local`(`admin_id`, `address`, `description`, `latitude`, `longitude`, `created_at`, `updated_at`, `deleted_at`, `status`) VALUES (1,"Miraflores 15074","Cancha 2",-12.122946,-77.032856,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,null,1);
INSERT INTO `tb_local`(`admin_id`, `address`, `description`, `latitude`, `longitude`, `created_at`, `updated_at`, `deleted_at`, `status`) VALUES (1,"Av Jose Larco 770","Cancha 3",-12.125553,-77.029340,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,null,1);

INSERT INTO `tb_review`(`account_id`, `local_id`, `stars`, `commentary`) VALUES (2,1,4,"Prueba texto 1");
INSERT INTO `tb_review`(`account_id`, `local_id`, `stars`, `commentary`) VALUES (2,2,4,"Prueba texto 2");
INSERT INTO `tb_review`(`account_id`, `local_id`, `stars`, `commentary`) VALUES (2,3,4,"Prueba texto 3");
INSERT INTO `tb_review`(`account_id`, `local_id`, `stars`, `commentary`) VALUES (2,1,5,"Prueba texto 4");

INSERT INTO `tb_profile`(`account_id`, `full_name`, `email`, `phone1`, `phone2`, `phone3`, `dni`, `created_at`, `updated_at`, `status`) VALUES (1,"Pepito Suarez","asd@asd.com",999,888,777,987,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,1);




