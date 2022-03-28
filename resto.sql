create table Ingredient(
    id int,
    designation varchar(60),
    primary key (id)
);

create table tables(
    id int, 
    designation varchar(60),
    primary key(id)
);

 create table produit(
    id int,
    designation varchar(100),
    primary key(id)
 );

 create table  recette(
    id  int,
    id_Produit int ,
    id_Ingredient int,
    qte float ,
    primary key(id),
    foreign key (id_Produit) references produit(id),
    foreign key (id_Ingredient) references Ingredient(id)
 );


create table commande(
    id int,
    id_Table int,
    id_Produit int,
    unite int,
    primary key(id),
    foreign key (id_Table) references tables(id),
    foreign key (id_Produit) references produit(id)
);

create table historique_stock_ingredient(
    id int,
    id_Ingredient  int,
    qte int,
    primary key(id),
    foreign key (id_Ingredient) references Ingredient(id)
);

create table Produit_Par_Multiple(
    id int, 
    id_Produit int,
    qte int,
    primary key(id),
    foreign key (id_Produit) references produit(id)
);

create table Ingredient_Par_Multiple(
    id int, 
    id_ProdPar_Multiple int,
    id_Ingredient int,
    qte int,
    primary key(id),
    foreign key (id_ProdPar_Multiple) references Produit_Par_Multiple(id),
    foreign key (id_Ingredient) references Ingredient(id)
);

    create sequence produit_sq start with 1 increment by 1 ;

insert into produit values (nextval('produit_sq'),'henakisoa sy Ravitoto');
insert into produit values (nextval('produit_sq'),'Misao Speciale');
insert into produit values (nextval('produit_sq'),'Soupe Speciale');
insert into produit values (nextval('produit_sq'),'Stock');
insert into produit values (nextval('produit_sq'),'Steak Frite ');
insert into produit values (nextval('produit_sq'),'Poulet pannee');
insert into produit values (nextval('produit_sq'),'Cote Pannee');
insert into produit values (nextval('produit_sq'),'Entre Cote Grillee');