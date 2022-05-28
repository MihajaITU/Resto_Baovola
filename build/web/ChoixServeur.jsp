<%-- 
    Document   : ChoixServeur
    Created on : 28 mars 2022, 14:25:43
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="Control.*"%>
<%

%>

<%@page import="classes.*"%>
<%@page import="Service.*"%>

<%        //Produit[] listeProd=(Produit[])request.getAttribute("listeProd");
    Serveur[] liste = (Serveur[]) request.getAttribute("Serve");
    //Produit[] listeByType=(Produit[])request.getAttribute("byType");
%>
<div class="row">
    <div class="col-md-2"> </div>
    <div class="col-md-8"> 
        <div class="card">
            <div class="card-body">

                <form action="/Resto/ListePourBoire" method="get" class="serveur">
                    <label style="font-family:Segoe UI;"> <strong>Séléctionner Serveur pour voir ses pourboires entre deux dates :</strong> </label>

                    <select class="form-control" name="serveur">
                        <%
                            for (int i = 0; i < liste.length; i++) {
                        %>
                        <option value="<% out.print(liste[i].getId());%>"><% out.print(liste[i].getNom());%></option>
                        <%}%>
                    </select>

                    <br>
                    <label ><strong> Date 01 : </strong> </label> <input type="date" name="date1"><br>
                    <label ><strong> Date 02 : </strong> </label> <input type="date" name="date2">
                    <br>
                    <br>
                    <input type="submit" class="btn btn-info" value="Valider" >
                </form>
            </div>
        </div>
        <br>
        <br>
        <div class="card">

        </div>
        <div class="col-md-2 ">    </div>
    </div>
</div>