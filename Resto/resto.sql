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

create table type_produit(
    id int,
    designation varchar(60),
    primary key(id)
);

 create table produit(
    id int,
    id_type_produit int,
    designation varchar(100),
    primary key(id),
    foreign key (id_type_produit) references type_produit(id)
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

create table AchatIngredient(
    id int,
    id_Ingredient int, 
    prixUnitaire float,
    referencePrix float,
    reference varchar(30),
    dateAchat date,
    primary key(id),
    foreign key(id_Ingredient) references  Ingredient(id)
);

create table prixProduit(
    id int,
    id_produit int,
    prix float,
    primary key(id),
    foreign key (id_produit) references Produit(id)
);

create table Serveur(
    id int,
    nom varchar(50),
    primary key(id)
);

create table commande(
    id int,
    id_Table int,
    dateCommande date,
    primary key(id),
    foreign key (id_Table) references tables(id)
);

create table DetailsCommande(
    id int,
    id_Commande int,
    id_Produit int, 
    id_Serveur int,
    prixVente float,
    primary key(id),
    foreign key(id_Commande) references commande,
    foreign key (id_Produit) references produit,
    foreign key (id_serveur) references serveur
);


create sequence produit_sq start with 1 increment by 1 ;
create sequence ingredient_sq start with 1 increment by 1 ;
create sequence tables_sq start with 1 increment by 1;
create sequence recette_sq start with 1 increment by 1;

create sequence historique_stock_ingredient_sq start with 1 increment by 1 ;
create sequence produit_par_multiple_sq start with 1 increment by 1;
create sequence ingredient_par_multiple_sq start with 1 increment by 1 ;
create sequence type_produit_sq start with 1 increment by 1 ;
create sequence achatIngredient_sq start with 1 increment by 1;

create sequence prixProduit_sq start with 1 increment by 1;
create sequence serveur_sq start with 1 increment by 1 ;

create sequence commande_sq start with 1 increment by 1;
create sequence DetailsCommande_sq start with 1 increment by 1;



insert into type_produit values (nextval('type_produit_sq'),'Plat');
insert into type_produit values (nextval('type_produit_sq'),'Entree');
insert into type_produit values (nextval('type_produit_sq'),'Tsaky');
insert into type_produit values (nextval('type_produit_sq'),'Dessert');

insert into produit values (nextval('produit_sq'),1,'henakisoa sy Ravitoto');
insert into produit values (nextval('produit_sq'),1,'Misao Speciale');
insert into produit values (nextval('produit_sq'),1,'Soupe Speciale');
insert into produit values (nextval('produit_sq'),1,'Stock');
insert into produit values (nextval('produit_sq'),1,'Steak Frite ');
insert into produit values (nextval('produit_sq'),1,'Poulet pannee');
insert into produit values (nextval('produit_sq'),1,'Cote Pannee');
insert into produit values (nextval('produit_sq'),1,'Entre Cote Grillee');
insert into produit values (nextval('produit_sq'),1,'Hena Omby Ritra');


insert into produit values (nextval('produit_sq'),4,'Banana Split');
insert into produit values (nextval('produit_sq'),4,'Glace Chocolat');
insert into produit values (nextval('produit_sq'),4,'Crepe Flambee');

insert into Ingredient values (nextval('ingredient_sq'),'Hena omby');
insert into Ingredient values (nextval('ingredient_sq'),'Pate');
insert into Ingredient values (nextval('ingredient_sq'),'Hena kisoa');
insert into Ingredient values (nextval('ingredient_sq'),'Patate Douce');
insert into Ingredient values (nextval('ingredient_sq'),'Carotte');
insert into Ingredient values (nextval('ingredient_sq'),'Huile');

insert into AchatIngredient values(nextval('achatIngredient_sq'),1,18000,1000,'g','2022-03-24');
insert into AchatIngredient values(nextval('achatIngredient_sq'),2,5000,1000,'g','2022-03-24');
insert into AchatIngredient values(nextval('achatIngredient_sq'),3,20000,1000,'g','2022-03-24');
insert into AchatIngredient values(nextval('achatIngredient_sq'),4,2000,1000,'g','2022-03-24');
insert into AchatIngredient values(nextval('achatIngredient_sq'),5,1500,1000,'g','2022-03-24');
insert into AchatIngredient values(nextval('achatIngredient_sq'),6,6000,100,'cl','2022-03-24');


insert into prixProduit values(nextval('prixproduit_sq'),1,7000);
insert into prixProduit values(nextval('prixproduit_sq'),2,6000);
insert into prixProduit values(nextval('prixproduit_sq'),3,4000);
insert into prixProduit values(nextval('prixproduit_sq'),4,3000);
insert into prixProduit values(nextval('prixproduit_sq'),5,6000);
insert into prixProduit values(nextval('prixproduit_sq'),6,5000);
insert into prixProduit values(nextval('prixproduit_sq'),7,8000);
insert into prixProduit values(nextval('prixproduit_sq'),8,7000);
insert into prixProduit values(nextval('prixproduit_sq'),9,6000);

insert into prixProduit values(nextval('prixproduit_sq'),12,6000);

--henom-ritra
insert into Recette values (nextval('recette_sq'),12,1,200);
insert into Recette values (nextval('recette_sq'),12,6,20);

--misao speciale 
insert into Recette values (nextval('recette_sq'),2,2,100);
insert into Recette values (nextval('recette_sq'),2,6,100);
insert into Recette values (nextval('recette_sq'),2,5,10);

--28/03/2021

insert into serveur values (nextval('serveur_sq'),'Jean');
insert into serveur values (nextval('serveur_sq'),'Bob');
insert into serveur values (nextval('serveur_sq'),'Marie');


insert into tables values (nextval('tables_sq'),'Table1');
insert into tables values (nextval('tables_sq'),'Table2');
insert into tables values (nextval('tables_sq'),'Table3');

--table,serveur,date
insert into commande values (nextval('commande_sq'),1,now());
insert into commande values (nextval('commande_sq'),1,'2022-03-25');
insert into commande values (nextval('commande_sq'),1,'2022-03-27');
insert into commande values (nextval('commande_sq'),1,'2022-03-29');

--idCommande,idProduit,id_serveur,prixVente
insert into DetailsCommande values (nextval('detailsCommande_sq'),1,1,1,20000);
insert into DetailsCommande values (nextval('detailsCommande_sq'),1,2,1,15000);
insert into DetailsCommande values (nextval('detailsCommande_sq'),1,3,1,10000);
insert into DetailsCommande values (nextval('detailsCommande_sq'),1,4,2,10000);
insert into DetailsCommande values (nextval('detailsCommande_sq'),1,5,2,15000);

-- insert into DetailsCommande values (nextval('detailsCommande_sq'),2,1,20000);
-- insert into DetailsCommande values (nextval('detailsCommande_sq'),2,2,1000);

-- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,2,15000);
-- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,3,10000);
-- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,4,10000);

-- insert into DetailsCommande values (nextval('detailsCommande_sq'),4,1,20000);
-- insert into DetailsCommande values (nextval('detailsCommande_sq'),4,2,15000);
-- insert into DetailsCommande values (nextval('detailsCommande_sq'),4,4,10000);

insert into AchatIngredient values (nextval('achatIngredient_sq'))

create view prixRevientProduit as 
    select p.id as id_produit ,sum((p2.prix*r.qte)/a.referenceprix)  as prixRevient  
        from recette r 
        join produit p  on p.id=r.id_produit 
        join  ingredient i on i.id=r.id_ingredient 
        join prixproduit p2 on p2.id_produit =p.id 
        join achatingredient a on a.id_ingredient = i.id  
        group by p.id   


create view view_prixRevient as 
    select prp.id_produit as idProduit,p.designation , prp.prixrevient 
    from prixrevientproduit prp 
    join  produit p on p.id=prp.id_produit 


create view total_CommandeServeur as 
    select dc.id_Serveur, sum(dc.prixvente) as TotalPrixVente,c.dateCommande  
    from detailscommande dc 
    join commande c on c.id=dc.id_commande 
    group by id_commande,id_Serveur,dateCommande


create view view_pourboire as 
    select  tc.id_serveur ,s.nom,tc.totalprixvente,(tc.totalprixvente*0.02) as totalpourboire ,tc.dateCommande 
    from total_CommandeServeur tc 
    join serveur s on s.id=tc.id_serveur

select id_serveur ,sum(totalpourboire) as totalPourBoire 
    from view_pourboire 
    where id_serveur=1 
    and dateCommande>='2022-03-29' 
    and dateCommande<='2022-03-29'  
    group by id_serveur 

    
    


