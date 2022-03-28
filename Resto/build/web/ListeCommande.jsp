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
        
        Produit[] listeByType=(Produit[])request.getAttribute("byType");
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
        <div class="card">
            <div class="card-body">
            <form action="/TraitementChoixCommande" method="get">
                <label> <strong> Numero de table : </strong></label> <input type="number" name="numTable" >
               
                <label for="sel1"><strong> Nom Commande : </strong> </label>
                <select class="form-control" id="sel1">
                     <%for(int i=0;i<listeByType.length;i++){%>
                     <option value="<% out.print(listeByType[i].getId());%>"><% out.print(listeByType[i].getDesignation());%></option>
                     <% } %>
                </select>
                <br>
                <label> <strong> Unités : </strong> </label> <input type="number" name="unitee" >
                <br>
                <br>
                <input type="submit" class="btn btn-info" value="Ajouter" >
            </form>
            </div>
        </div>
    </div>
    <div class="col-md-4">
         <form action="TraitementCommande.jsp" method="post">
            <div class="card">
                <div class="card-body">
                <div data-spy="scroll" data-target="#navbar-example3" data-offset="0">
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>

                </div>
                    <br>
                    <br>
                    <input type="submit" class="btn btn-info" value="Commander" >
                </div>
            </div>
         </form>
    </div>
    <div class="col-md-2 ">    </div>
  </div>
</div>

</body>
</html>
