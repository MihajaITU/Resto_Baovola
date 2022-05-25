<%-- 
    Document   : Livraison
    Created on : 4 avr. 2022, 15:47:52
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="Control.*"%>
<%
    String numTable=(String)request.getParameter("numTable");
    
%>
<!DOCTYPE html>
<html lang="fr">
<head>
  <title>Restaurant</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>
  <%@page import="classes.*"%>
    <%@page import="Service.*"%>
    
    <% 
        ViewPlatNonLivree[] liste=(ViewPlatNonLivree[])request.getAttribute("livree");
        
    %>
    
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
     <a class="navbar-brand" href="#">Livraison</a> 
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
  </div>
</nav>
  
<div class="container-fluid ">    
  <div class="row">
    <div class="col-md-2"> </div>
    <div class="col-md-8"> 
        <br>
        <div class="card">
            <form method="get">
            <div class="card-body">
                <div data-spy="scroll" data-target="#navbar-example3" data-offset="0">
                <table class="table">
                <thead class="thead-light">
                  <tr>
                    <th scope="col">N° de Table </th>
                    <th scope="col">Nom du Produit</th>
                    <th scope="col"> </th>
                  </tr>
                </thead>
                <tbody>
                     <%for(int i=0;i<liste.length;i++){%>
                  <tr>
                    <td><% out.print(liste[i].getId_table());%></td>
                    <td><% out.print(liste[i].getProduit());%></td>
                    <td><a href="/Resto/ValiderLivraison?idProduit=<% out.print(liste[i].getId_produit());%>&&idCommande=<% out.print(liste[i].getId_commande());%>&&idTable=<% out.print(liste[i].getId_table());%>"><input type="button" name="livree" value="Livrer" class="btn btn-info"></a></td>
                  </tr>
                </tbody>
              </table>
              </div>
            </div>
           </form>
        </div>
    </div>
    <div class="col-md-2 ">    </div>
  </div>
</div>

</body>
</html>

