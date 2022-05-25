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

-- update
create table DetailsCommande(
    id int,
    id_Commande int,
    id_Produit int, 
    id_Serveur int,
    prixVente float,
    estLivrere boolean,
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
-- update
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

--Steack frite 
insert into Recette values (nextval('recette_sq'),5,1,300);
insert into Recette values (nextval('recette_sq'),5,6,20);

--28/03/2021

insert into serveur values (nextval('serveur_sq'),'Jean');
insert into serveur values (nextval('serveur_sq'),'Bob');
insert into serveur values (nextval('serveur_sq'),'Marie');


insert into tables values (nextval('tables_sq'),'Table1');
insert into tables values (nextval('tables_sq'),'Table2');
insert into tables values (nextval('tables_sq'),'Table3');

--update 
update tables set designation = 'Table1' where id=1;
update tables set designation = 'Table2' where id=2;
update tables set designation = 'Table3' where id=3;

--table,serveur,date
insert into commande values (nextval('commande_sq'),1,now());
insert into commande values (nextval('commande_sq'),1,'2022-03-25');
insert into commande values (nextval('commande_sq'),1,'2022-03-27');
insert into commande values (nextval('commande_sq'),1,'2022-03-29');

insert into commande values (nextval('commande_sq'),2,now());
insert into commande values (nextval('commande_sq'),3,now());

--idCommande,idProduit,id_serveur,prixVente
    --commande 1 
    insert into DetailsCommande values (nextval('detailsCommande_sq'),1,1,1,20000,true);
    insert into DetailsCommande values (nextval('detailsCommande_sq'),1,2,1,15000,true);
    insert into DetailsCommande values (nextval('detailsCommande_sq'),1,3,1,10000,true);
    insert into DetailsCommande values (nextval('detailsCommande_sq'),1,4,2,10000,true);
    insert into DetailsCommande values (nextval('detailsCommande_sq'),1,5,2,15000,true);

    --commande 2 
    insert into DetailsCommande values (nextval('detailsCommande_sq'),2,1,1,20000,true);
    insert into DetailsCommande values (nextval('detailsCommande_sq'),2,2,2,1000,true);

    --commande 3 
    -- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,2,3,15000,false);
    -- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,3,2,10000,false);
    -- insert into DetailsCommande values (nextval('detailsCommande_sq'),3,4,3,10000,false);

    --commande 5
    insert into detailscommande values (nextval('detailsCommande_sq'),5,4,3,10000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),5,2,3,15000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),5,1,3,20000,true);

    --commande 6 
    insert into detailscommande values (nextval('detailsCommande_sq'),6,1,3,20000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),6,4,3,10000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),6,5,3,10000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),6,5,3,10000,true);



create view prixRevientProduit as 
    select p.id as id_produit ,sum((p2.prix*r.qte)/a.referenceprix)  as prixRevient  
        from recette r 
        join produit p  on p.id=r.id_produit 
        join  ingredient i on i.id=r.id_ingredient 
        join prixproduit p2 on p2.id_produit =p.id 
        join achatingredient a on a.id_ingredient = i.id  
        group by p.id   ;


create view view_prixRevient as 
    select prp.id_produit as idProduit,p.designation , prp.prixrevient 
    from prixrevientproduit prp 
    join  produit p on p.id=prp.id_produit ;

-- update
create view total_CommandeServeur as 
    select dc.id_Serveur, sum(dc.prixvente) as TotalPrixVente,c.dateCommande  
    from detailscommande dc 
    join commande c on c.id=dc.id_commande 
    group by id_commande,id_Serveur,dateCommande;

-- update
create view view_pourboire as 
    select  tc.id_serveur ,s.nom,tc.totalprixvente,(tc.totalprixvente*0.02) as totalpourboire ,tc.dateCommande 
    from total_CommandeServeur tc 
    join serveur s on s.id=tc.id_serveur;


select id_serveur ,sum(totalpourboire) as totalPourBoire 
    from view_pourboire 
    where id_serveur=1 
    and dateCommande>='2022-03-29' 
    and dateCommande<='2022-03-29'  
    group by id_serveur ;

--ingredient par Produit 
 create view recetteProduit as 
    select p.id,p.designation as produit,i.designation as ingredient,r.qte as quantite,a.reference
        from recette r 
        join produit p  on p.id=r.id_produit 
        join  ingredient i on i.id=r.id_ingredient 
        join achatingredient a on a.id_ingredient =i.id;

-- update
--produit avec prix pour chercher addition
create view view_prixProduit as 
    select dc.id_commande as idCommande,id_table as idTable , dc.id_produit  
        from detailscommande dc 
        join commande c on c.id=dc.id_commande 
        join tables t on t.id =c.id_table 
        join prixproduit p on p.id_produit = dc.id_produit 
        group by id_table , dc.id_commande ,dc.id_produit ;


--prod
 select  distinct(idTable)  , t.designation , sum(p.prix) as Addition  
    	from view_prixproduit vp
    	join prixproduit p on p.id=vp.id_produit
    	join tables t on t.id = vp.idtable 
    	join commande c on c.id = vp.idcommande 
    	group by idtable , idcommande ,t.designation ;


--liste des additions pour chaque table
create view view_additionTable as 
select 	idTable  ,idCommande, t.designation , sum(p.prix) as Addition  
    	from view_prixproduit vp
    	join prixproduit p on p.id=vp.id_produit
    	join tables t on t.id = vp.idtable 
    	join commande c on c.id = vp.idcommande 
    	group by idtable , idcommande ,t.designation 

--view liste detailsCommande where non livrer (idCommande , idTable , idProduit)

--addition des commandes par tables 
select * from view_additionTable where idcommande=(select max(idcommande) from view_additionTable where idTable = 1)

--liste des additions par tables 
select * from view_additionTable where idtable in (select distinct(idtable) from view_additionTable)

--ingredient consomée par jour 
create view total_ingredient as 
select r.id_ingredient  ,c.datecommande , sum(r.qte) as quantiteJour , sum(a.prixunitaire*r.qte) /a.referenceprix as prixparJour
	from detailscommande d 
	join commande c  on c.id=d.id_commande 
	join recette r on r.id_produit =d.id_produit 
	join achatingredient a on a.id_ingredient = r.id_ingredient 
	where d.estlivrere = true
	group by c.datecommande ,r.id_ingredient,a.referenceprix  

create view ingredientConsommeJour as 
    select ti.id_ingredient ,i.designation,ti.datecommande,ti.quantiteJour , ti.prixparjour
    from total_ingredient ti
	join ingredient  i on i.id= ti.id_ingredient 

--liste quantite et prix des ingredient par jour 
    select sum(quantitejour) as ingredientConsomeeJour,sum(prixparjour) as prixJour ,  datecommande from ingredientConsommeJour
	 group by datecommande  


-- update des données 
alter table detailsCommande add column estLivrere boolean; 
    update detailsCommande set estLivrere=true;

    insert into Recette values (nextval('recette_sq'),5,1,300);
    insert into Recette values (nextval('recette_sq'),5,6,20);

    insert into detailscommande values (nextval('detailsCommande_sq'),6,5,3,10000,true);
    insert into detailscommande values (nextval('detailsCommande_sq'),6,5,3,10000,true);



create table stock(
    id int,
    idIngredient int,
    entree float,
    sortie float,
    dateStock date ,
    primary key(id),
    foreign key (idIngredient) references Ingredient(id)
);

create sequence stock_sq start with 1 increment by 1; 
---entree stock
insert into stock values (nextval('stock_sq'),1,50000,null,'2022-03-25');
insert into stock values (nextval('stock_sq'),2,10000,null,'2022-03-25');
insert into stock values (nextval('stock_sq'),3,50000,null,'2022-03-25');
insert into stock values (nextval('stock_sq'),4,100000,null,'2022-03-25');
insert into stock values (nextval('stock_sq'),5,100000,null,'2022-03-25');

--sortie stock 
insert into stock values (nextval('stock_sq'),1,null,1000,'2022-03-26');

insert into stock values (nextval('stock_sq'),1,null,1000,'2022-03-25');

insert into stock values (nextval('stock_sq'),2,null,200,'2022-03-26');
insert into stock values (nextval('stock_sq'),2,null,300,'2022-03-27');

insert into stock values (nextval('stock_sq'),3,null,1000,'2022-03-26');
insert into stock values (nextval('stock_sq'),4,null,10000,'2022-03-26');
insert into stock values (nextval('stock_sq'),5,null,10000,'2022-03-26');

-- stock restante ajd
select idingredient, sum(entree)-sum(sortie) as IngredientRestante,now()  from stock group by idingredient

--stock restante par jour 
select idingredient, sum(entree)-sum(sortie) as IngredientRestante,dateStock  from stock group by idingredient,dateStock



--07/04/2022


create table typePaiement(
    id int,
    designation varchar(30),
    primary key(id)
);

create table paiement(
    id int,
    idDetailsCommande int,
    idTypePaiement int,
    primary key(id),
    foreign key (idDetailsCommande) references detailsCommande,
    foreign key (idTypePaiement) references typePaiement
);

create sequence typepaiement_sq start with 1 increment by 1; 
create sequence paiement_sq start with 1 increment by 1; 


insert into typePaiement values (nextval('typepaiement_sq'),'Cheque');
insert into typePaiement values (nextval('typepaiement_sq'),'Espece');

--idDetailsCommande, idtypepaiement

--paiement commande 5 
insert into paiement values (nextval('paiement_sq'),7,1);
insert into paiement values (nextval('paiement_sq'),8,2);
insert into paiement values (nextval('paiement_sq'),9,1);


--paiement commande 6 
insert into paiement values (nextval('paiement_sq'),10,2);
insert into paiement values (nextval('paiement_sq'),11,2);

--paiement commande 2
insert into paiement values (nextval('paiement_sq'),12,1);
insert into paiement values (nextval('paiement_sq'),13,1);

--liste paiement par type
create view viewtotal_paiementByType as 
select tp.id ,tp.designation,sum(d.prixvente) as valeur, c.datecommande 
	from detailscommande d 
	join commande c  on c.id=d.id_commande 
	join paiement p on p.iddetailscommande = d.id 
	join typepaiement tp on tp.id=p.idtypepaiement
	where d.estlivrere = true
	group by c.datecommande ,tp.id,tp.designation
    
select designation,sum(valeur ) as total from viewtotal_paiementByType
	where dateCommande>'2022-03-04' and dateCommande <'2022-04-01'
	group by designation


--11/04/2022

    insert into tables values (nextval('tables_sq'),'Table4');

    --commande 7
    insert into commande values (nextval('commande_sq'),4,now());

    insert into detailscommande values (nextval('detailsCommande_sq'),7,5,3,10000,false);
    insert into detailscommande values (nextval('detailsCommande_sq'),7,5,3,10000,false);

    --commande 6 

    insert into detailscommande values (nextval('detailsCommande_sq'),6,1,3,20000,false);
    insert into detailscommande values (nextval('detailsCommande_sq'),6,4,3,10000,false);


    --addition non payer par tablbe 
    create view view_totalAddNonPayer as 
        select c.id as idCommande,t.id as idTable,t.designation ,sum(d.prixVente) as totalNonPayer,c.datecommande 
        from detailscommande d 
        join commande c  on c.id=d.id_commande 
        join tables t on t.id =c.id_table 
        where d.id not in (select idDetailsCommande from paiement)
        group by t.id,c.dateCommande,c.id
	
    --idtable , total , date