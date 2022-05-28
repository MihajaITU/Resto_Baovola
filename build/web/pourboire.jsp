<%-- 
    Document   : ChoixServeur
    Created on : 28 mars 2022, 14:25:43
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="Control.*"%>
<%
    Serveur[] serveur = (Serveur[]) request.getAttribute("Serve");
    Produit[] pr = (Produit[]) request.getAttribute("Serve");
%>

<%@page import="classes.*"%>
<%@page import="Service.*"%>

<%
    ViewPourBoire[] liste = (ViewPourBoire[]) request.getAttribute("liste");
    Serveur srv = (Serveur) request.getAttribute("serveur");
%>              
<div class="block-header">
    <div class="row clearfix">
        <div class="col-lg-5 col-md-5 col-sm-12">
            <h2>Pourboire</h2>
        </div>
        <div class="col-lg-7 col-md-7 col-sm-12">
            <ul class="breadcrumb float-md-right padding-0">
                <li class="breadcrumb-item"><a href="index.html"><i class="zmdi zmdi-home"></i></a></li>
                <li class="breadcrumb-item active">Pourboire</li>
            </ul>
        </div>
    </div>
</div>
<div class="col-md-12">
    <div class="card">
        <div class="header">
            <h2> Liste Pourboire de<strong> <%= srv.getNom()%> </strong> </h2>
        </div>
        <div class="body table-responsive">
            <table class="table m-b-0 table-striped">
                <thead>
                    <tr>
                        <th scope="col">Date </th>
                        <th scope="col">Pourboire</th>
                        <th scope="col">Total prix de vente </th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 0; i < liste.length; i++) {%>
                    <tr>
                        <td><%= liste[i].getDatecommande() %></td>
                        <td><%= liste[i].getPourboire()%> Ar </td>
                        <td><%= liste[i].getPrixvente() %> Ar </td>
                    </tr>
                    <%  }%>
                    <% if(liste.length==0){ %>
                        <td>Pas de pourboire a cette date </td>
                    <% }%>
                </tbody>
            </table>
        </div>
    </div>
</div>
