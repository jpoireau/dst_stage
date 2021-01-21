alter table ELEVE
	ADD CONSTRAINT FK_CLA FOREIGN KEY (id_classe) references classe(id_classe),
	ADD CONSTRAINT FK_COLO FOREIGN KEY (id_colonne, id_table) references tables(id_colonne, id_table);
	

alter table TABLES
	ADD CONSTRAINT FK_COL FOREIGN KEY (id_colonne) references colonne(id_colonne);

