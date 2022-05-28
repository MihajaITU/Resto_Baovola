
    <%@page import="classes.*"%>
    <%@page import="Service.*"%>
    
    <% 
        ViewPrixProduit[] listePlat=(ViewPrixProduit[])request.getAttribute("listePlat");
        
    %>
    




<div class="col-md-12">
    <div class="card">
        <div class="header">
             <h2>Liste des plats Disponible</h2>
        </div>
        <div class="body table-responsive">
            <table class="table m-b-0 table-striped table-light">
                <thead>
                    <tr>
                        <th scope="col">Nom du Produit</th>
                    <th scope="col">Type</th>
                    <th scope="col">Prix</th>
                    </tr>
                </thead>
                <tbody>
                     <%for(int i=0;i<listePlat.length;i++){%>
                  <tr>
                      <td><% out.print(listePlat[i].getDesignation());%></td>
                     <td><% out.print(listePlat[i].getIntitule());%></td>
                       <td><% out.print(listePlat[i].getPrix());%> Ar</td>
                  </tr>
                   <% } %>
                </tbody>
            </table>
        </div>
    </div>
</div>

