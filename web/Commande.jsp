<%-- 
    Document   : Commande
    Created on : 21 mars 2022, 17:50:52
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        //Produit[] listeProd=(Produit[])request.getAttribute("listeProd");
        Type_Produit[] listeType=(Type_Produit[])request.getAttribute("listeType");
        //Produit[] listeByType=(Produit[])request.getAttribute("byType");
    %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Commandes</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
  </div>
</nav>
  
<div class="container-fluid ">    
  <div class="row">
    <div class="col-md-2"> </div>
    <div class="col-md-4"> 
         <br>
                <br>
        <div class="card">
            <div class="card-body">
                <h1>Type des plats</h1>
                <br>
                <br>
                  <div class="checkbox">
                      <%for(int i=0;i<listeType.length;i++){%>
                       
                      <a href="/Resto/TypeProduit?type=<% out.print(listeType[i].getDesignation());%>"><button class="btn btn-light"><% out.print(listeType[i].getDesignation());%></button></a>
                    <% } %>
                  </div>
    
               
            </div>
                    <br>
                <br>
        </div>
    </div>
   
    </div>
    <div class="col-md-2 ">    </div>
  </div>
</div>

</body>
</html>
