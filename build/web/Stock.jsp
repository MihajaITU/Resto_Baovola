<%-- 
    Document   : Stock
    Created on : 27 mai 2022, 21:41:25
    Author     : ASUS TUF
--%>
<%@page import="classes.ViewStock"%>
<%
    ViewStock[] liste = (ViewStock[]) request.getAttribute("listeStock");
%>
<div class="block-header">
    <div class="row clearfix">
        <div class="col-lg-5 col-md-5 col-sm-12">
            <h2>Dashboard</h2>
        </div>
        <div class="col-lg-7 col-md-7 col-sm-12">
            <ul class="breadcrumb float-md-right padding-0">
                <li class="breadcrumb-item"><a href="index.html"><i class="zmdi zmdi-home"></i></a></li>
                <li class="breadcrumb-item active">Dashboard</li>
            </ul>
        </div>
    </div>
</div>
<div class="col-md-12">
    <div class="card">
        <div class="header">
            <h2><strong>Reste en </strong> Stock</h2>
        </div>
        <div class="body table-responsive">
            <table class="table m-b-0 table-striped table-dark">
                <thead>
                    <tr>
                        <th scope="col">Ingredient</th>
                        <th scope="col">Quantite</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 0; i < liste.length; i++) {%>
                    <tr>
                        <td><%= liste[i].getIngredient()%></td>
                        <td><%= liste[i].getIngredientrestante()%> mg</td>
                    </tr>
                    <%  }%>
                </tbody>
            </table>
        </div>
    </div>
</div>
