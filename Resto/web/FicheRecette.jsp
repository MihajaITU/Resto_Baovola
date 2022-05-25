<%-- 
    Document   : FicheRecette
    Created on : 31 mars 2022, 16:31:33
    Author     : jeant
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="Control.*"%>

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
    
    label{
        font-family:"Segoe UI";
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
        
        List<RecetteProduit> rec=(List<RecetteProduit>)request.getAttribute("fiche");
    %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Liste Produit</a>
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
        <h2>Fiche Produit : </h2>
        <div class="card">
            <div class="card-body">
          
              <%
            for(int i=0;i<rec.size();i++){
        %>
            <div class="card-body">
                <label><strong>Nom de l'ingrédient:</strong><% out.print(rec.get(i).getIngredient());%></label><br>
                <label><strong>Quantité des ingrédients :</strong>  <% out.print(rec.get(i).getQuantite());%></label><br>
                <label><strong>Valeur :</strong>  <% out.print(rec.get(i).getReference());%></label>
            </div>
            <%}%>
            
        </div>
            </div>
       
    </div>
    <div class="col-md-2 ">    </div>
  </div>
</div>

</body>
</html>
