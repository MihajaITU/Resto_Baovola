    <%@page import="classes.*"%>
    <%@page import="Service.*"%>
    <%@page import="Control.*"%>
    
    <% 
        ViewPlatALivre[] listePlat=(ViewPlatALivre[])request.getAttribute("listePlat");
        ViewPrixProduit lt=new ViewPrixProduit();
        ViewPrixProduit[] listeByType=lt.getProduitPrixType();
        Type_Produit tp=new Type_Produit();
        Type_Produit[] listeType=tp.getAllType();
        Serveur s=new Serveur();
        Serveur[] serve=s.getAllServeur();
    %>
    




<div class="col-md-12">
    <div class="card">
        <div class="header">
             <h2>Gestion de Commande :</h2>
        </div>
            <div class="container">
                <form action="/Resto/GestionCommande" method="post">
                    <p>Numéro de la table : <input type="number" name="numero"></p>
                    <p>Date de la commande : <input type="date" name="date"></p>
                    <p>
                        <div class="form-group">
                        <label for="type"> Les plats :</label>
                          <select multiple class="form-control" name="type" id="type">
                              <%for(int i=0;i<listeByType.length;i++){%>
                              <option value="<% out.print(listeByType[i].getId_produit());%>"><% out.print(listeByType[i].getDesignation());%> - <% out.print(listeByType[i].getIntitule());%> - <% out.print(listeByType[i].getPrix());%> Ar</option>
                              <%}%>
                          </select>
                        </div>
                    </p>
                    <p><input type="submit" value="Valider"></p>
                </form>
            </div>
    </div>
</div>

