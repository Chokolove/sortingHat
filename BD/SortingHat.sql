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

INSERT INTO `tb_houses` (`id`, `houseName`, `members`, `founder`, `description`, `imageHouse`) VALUES ('0', 'Gryffindor', 'Familia Potter, Familia Weasley, Neville Longbottom', 'Godric Gryffindor', 'El elemento de Gryffindor es el fuego, ya que se lo asocia al valor y coraje de esta casa. Además, el fuego simboliza el honor en variadas ocasiones, lo cual también puede aplicar para Gryffindor.', 'FALTA IMAGEN');
INSERT INTO `tb_houses` (`id`, `houseName`, `members`, `founder`, `description`, `imageHouse`) VALUES ('0', 'Hufflepuff', 'Pomona Sprout, Nymphadora Tonks, Cedric Diggory', 'Helga Hufflepuff', 'Hufflepuff es la más inclusiva de las cuatro casas; el trabajo duro, la paciencia, la amistad y la honestidad son sumamente necesarias para ser miembros. Su animal emblemático es el tejón y sus colores son el amarillo y negro.', 'FALTA IMAGEN');

INSERT INTO `tb_character` (`id`, `nameCharacter`, `ageCharacter`, `imageCharacter`, `nameFather`, `nameMother`) VALUES ('0', 'Harry Potter', '38', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Harry_Potter.jpg?alt=media&token=c2809d45-a19c-45e0-a09b-a66ba0b45205', 'James Potter', 'Lily Potter');
INSERT INTO `tb_character` (`id`, `nameCharacter`, `ageCharacter`, `imageCharacter`, `nameFather`, `nameMother`) VALUES ('0', 'Ronald Bilius Weasley', '39', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Ron_Weasley.jpg?alt=media&token=8c223685-efe5-43e0-8d79-0dc165eaacf4', 'Arthur Weasley', 'Molly Weasley');



