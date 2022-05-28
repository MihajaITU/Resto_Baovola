<%-- 
    Document   : llsteprixProduit 
    Created on : 21 mars 2022, 17:50:52
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="classes.*"%>
<%@page import="Control.*"%>


<%@page import="classes.*"%>
<%@page import="Service.*"%>

<%
    ViewPrixProduit[] listeVente = (ViewPrixProduit[]) request.getAttribute("listeVente");
    ViewPrixProduit[] listePrix = (ViewPrixProduit[]) request.getAttribute("listePrix");
%>
<div class="block-header">
    <div class="row clearfix">
        <div class="col-lg-5 col-md-5 col-sm-12">
            <h2>Plats</h2>
        </div>
        <div class="col-lg-7 col-md-7 col-sm-12">
            <ul class="breadcrumb float-md-right padding-0">
                <li class="breadcrumb-item"><a href="index.html"><i class="zmdi zmdi-home"></i></a></li>
                <li class="breadcrumb-item active">Plats</li>
            </ul>
        </div>
    </div>
</div>
<div class="col-md-12">
    <div class="card">
        <div class="header">
            <h2>Prix de revient et Prix de vente des <strong> Plats </strong>  </h2>
        </div>
        <div class="body table-responsive">
            <table class="table m-b-0 table-striped ">
                <thead>
                    <tr>
                        <th scope="col">Plats </th>
                        <th scope="col">Prix de Revient</th>
                        <th scope="col">Prix de Vente</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 0; i < listePrix.length; i++) {%>
                    <tr>
                        <td><%= listePrix[i].getDesignation()%></td>
                        <td><%= listePrix[i].getPrixrevient()%> Ar</td>
                        <td><%= listePrix[i].getPrixdevente()%> Ar</td>
                    </tr>
                    <%  }%>
                </tbody>
            </table>
        </div>
    </div>
</div>
