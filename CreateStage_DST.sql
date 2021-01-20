


create table ELEVE
(
id_classe INT(3),
id_eleve INT(3),
id_colonne VARCHAR(50),
id_table INT(3),
nom_eleve VARCHAR(50),
prenom_eleve VARCHAR(50),
CONSTRAINT PK_ELE PRIMARY KEY (id_classe, id_eleve)
)
ENGINE=INNODB;

create table CLASSE
(
id_classe INT(3),
nom_classe VARCHAR(50),
CONSTRAINT PK_CLA PRIMARY KEY (id_classe)
)
ENGINE=INNODB;


create table TABLES
(
id_colonne VARCHAR(50),
id_table INT(3),
CONSTRAINT PK_TAB PRIMARY KEY (id_colonne, id_table)
)
ENGINE=INNODB;

create table COLONNE
(
id_colonne VARCHAR(50),
nb_table INT(3),
CONSTRAINT PK_COL PRIMARY KEY (id_colonne)
)
ENGINE=INNODB;			

/* CREATE TABLE EST_AFFECTEE
(
Id_colonne VARCHAR(50),
Id_classe VARCHAR(50),
PRIMARY KEY(Id_colonne, Id_classe),
FOREIGN KEY(Id_colonne) REFERENCES COLONNE(Id_colonne),
FOREIGN KEY(Id_classe) REFERENCES CLASSE(Id_classe)
)
ENGINE=INNODB;
