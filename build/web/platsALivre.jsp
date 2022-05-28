

    <%@page import="classes.*"%>
    <%@page import="Service.*"%>
    
    <% 
        ViewPlatALivre[] listePlat=(ViewPlatALivre[])request.getAttribute("listePlat");
        
    %>
    




<div class="col-md-12">
    <div class="card">
        <div class="header">
             <h2>Liste des plats à livrer</h2>
        </div>
        <div class="body table-responsive">
            <table class="table m-b-0 table-striped table-light">
                <thead>
                    <tr>
                        <th scope="col">Nom du Produit</th>
                    <th scope="col">Prix de vente</th>
                    <th scope="col">Livreur</th>
                    <th scope="col">Lieu du livraison</th>
                    <th scope="col">Date du livraison</th>
                    <th scope="col">Etat</th>
                    </tr>
                </thead>
                <tbody>
                     <%for(int i=0;i<listePlat.length;i++){%>
                  <tr>
      
                      
                      <td><% out.print(listePlat[i].getDeignation());%></td>
                     <td><% out.print(listePlat[i].getPrixVente());%></td>
                       <td><% out.print(listePlat[i].getNom());%></td>
                       <td><% out.print(listePlat[i].getLieu());%></td>
                       <td><% out.print(listePlat[i].getDaty());%></td>
                       <td>
                           <% if(listePlat[i].getEtaLivre()==true){%> Livré <%}else{%> Non livré <%}%>
                            
                       </td>
                  </tr>
                   <% } %>
                </tbody>
            </table>
        </div>
    </div>
</div>

