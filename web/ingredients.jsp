<%-- 
    Document   : ingredients
    Created on : 5 avr. 2022, 09:09:23
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="classes.*"%>
<%@page import="Control.*"%>
<%
  
    ViewIngredientConsommer[] liste=(ViewIngredientConsommer[])request.getAttribute("ingredient");
    double total=(double)request.getAttribute("total");
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

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Ingrédients</a>
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
        <div class="card">
            <div class="card-body">
                <table class="table">
                    <thead class="thead-light">
                      <tr>
                        <th scope="col">Nom du Produit</th>
                        <th scope="col">Quantité consommées</th>
                         <th scope="col">PrixTotal</th>
                      </tr>
                    </thead>
                    <tbody>
                        <%for(int i=0;i<liste.length;i++){%>
                      <tr>
                          <td><% out.print(liste[i].getDesignation());%></td>
                          <td><%out.print(liste[i].getQuantite());%></td>
                          <td><%out.print(liste[i].getPrixTotal());%></td>
                          
                      </tr>
                      
                     
                       <% } %>
                        <tr>
                          
                         
                          <td><%out.print("Total : " +total);%></td>
                          
                      </tr>
                    </tbody>
                </table>
            </div>
                    <a href="FormIngredient.jsp"><input type="submit" class="btn btn-info" value="Retour" ></a>
        </div>
    </div>
    
    <div class="col-md-2 ">    </div>
  </div>
</div>

</body>
</html>
