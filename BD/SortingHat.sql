DROP DATABASE IF EXISTS SortingHat;

CREATE DATABASE SortingHat;

USE SortingHat;


CREATE TABLE IF NOT EXISTS tb_houses(
id int auto_increment  not null,
houseName varchar(70) not null,
members varchar(255) not null,
founder varchar(255) not null,
description varchar(500) not null,
imageHouse varchar(255) not null,
PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS tb_character(
id int auto_increment  not null,
nameCharacter varchar(70) not null,
ageCharacter varchar(10) not null,
imageCharacter varchar(255) not null,
nameFather varchar(70) not null,
nameMother varchar(70) not null,
PRIMARY KEY (id)
);





