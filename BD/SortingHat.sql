DROP DATABASE IF EXISTS SortingHat;

CREATE DATABASE SortingHat;

USE SortingHat;


CREATE TABLE IF NOT EXISTS tb_houses(
id int auto_increment  not null,
houseName varchar(70) not null,
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
houseID int null,
PRIMARY KEY (id),
FOREIGN KEY (houseID) REFERENCES tb_houses(id)
);

INSERT INTO `tb_houses` ( `houseName`,  `founder`, `description`, `imageHouse`) VALUES ( 'Gryffindor', 'Godric Gryffindor', 'La Casa Gryffindor fue fundada por el célebre mago Godric Gryffindor. Godric solo aceptaba en su casa a aquellos magos y brujas que tenían valentía, disposición y coraje, ya que estas son las cualidades de un auténtico Gryffindor. Los colores de esta casa son el dorado y el escarlata y su símbolo es un león. La reliquia más preciada de la casa es la espada de Godric Gryffindor, perteneciente, como su nombre indica, al fundador de la casa.', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Casas%2FGryffindor_Pottermore.png?alt=media&token=336297be-a28b-400d-8f11-7f1185587e3a');
INSERT INTO `tb_houses` ( `houseName`,  `founder`, `description`, `imageHouse`) VALUES ( 'Hufflepuff', 'Helga Hufflepuff', 'La Casa Hufflepuff se encuentra en una bodega en el mismo pasillo subterráneo que en el de la cocina. Hufflepuff anteriormente buscaba alumnos que quisieran pertenecer a esa casa de puro consentimiento, aunque actualmente busca alumnos leales, honestos, que no temen al trabajo pesado. La fundadora es nada menos que la bruja, amiga de toda la vida de Rowena Ravenclaw, Helga Hufflepuff.', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Casas%2FHufflepuff_Pottermore.png?alt=media&token=db09e6ea-5564-4e6b-9d02-db27ed3b193c');
INSERT INTO `tb_houses` ( `houseName`,  `founder`, `description`, `imageHouse`) VALUES ( 'Ravenclaw', 'Rowena Ravenclaw', 'La Casa Ravenclaw se encuentra en una torre en el ala oeste del castillo. Sus colores son el azul y el bronce. Ravenclaw busca alumnos académicos, estudiosos y que siempre sepan lo que hay que hacer. Fue fundada por la bruja, nacida en la Canada, Rowena Ravenclaw. Supuestamente la principal inventora del nombre, lugar y formato de Hogwarts. ', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Casas%2FRavenclaw_Pottermore.png?alt=media&token=f7b6c48f-1c9e-4323-ab6b-c591b4131bf5');
INSERT INTO `tb_houses` ( `houseName`,  `founder`, `description`, `imageHouse`) VALUES ( 'Slytherin', 'Salazar Slytherin', 'La Casa Slytherin, caracterizada principalmente por la ambición y la astucia. Fue fundada por el mago Salazar Slytherin. La Sala Común de esta casa está situada en las mazmorras, pasando por un serie de numerosos pasillos subterráneos. Posiblemente se llega a ellos a través del Vestíbulo de Hogwarts .', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Casas%2FSlytherin_Pottermore.png?alt=media&token=870dbb12-4b28-41a9-b1dc-ecc7bba3bbea');

INSERT INTO `tb_character` ( `nameCharacter`, `ageCharacter`, `imageCharacter`, `nameFather`, `nameMother`,`houseID`) VALUES ( 'Harry Potter', '38', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Harry_Potter.jpg?alt=media&token=c2809d45-a19c-45e0-a09b-a66ba0b45205', 'James Potter', 'Lily Potter',1);
INSERT INTO `tb_character` ( `nameCharacter`, `ageCharacter`, `imageCharacter`, `nameFather`, `nameMother`,`houseID`) VALUES ( 'Ronald Bilius Weasley', '39', 'https://firebasestorage.googleapis.com/v0/b/iosimg-ca639.appspot.com/o/Ron_Weasley.jpg?alt=media&token=8c223685-efe5-43e0-8d79-0dc165eaacf4', 'Arthur Weasley', 'Molly Weasley',1);
