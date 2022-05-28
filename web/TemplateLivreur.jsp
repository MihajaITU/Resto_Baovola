<%-- 
    Document   : TemplateAdmin
    Created on : 27 mai 2022, 20:12:30
    Author     : ASUS TUF
--%>
<%@page import="classes.*"%>
<%
    String pagesLivreur;
    if (request.getParameter("p") != null) {
        pagesLivreur = "/" + request.getParameter("p") + ".jsp";
    } else {
        pagesLivreur = "/LoginLivreur";
    }
    int idLivreur= (Integer)session.getAttribute("idLivreur");

%>
<!doctype html>
<html class="no-js " lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <meta name="description" content="Responsive Bootstrap 4 and web Application ui kit.">
        <title>Resto - Livreur</title>
        <link rel="icon" href="favicon.ico" type="image/x-icon"> <!-- Favicon-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/plugins/morrisjs/morris.css" />
        <link rel="stylesheet" href="assets/plugins/jvectormap/jquery-jvectormap-2.0.3.min.css" />
        <!-- Custom Css -->
        <link rel="stylesheet" href="assets/css/main.css">
        <link rel="stylesheet" href="assets/css/color_skins.css">
    </head>

    <body class="theme-black">
        <!-- Page Loader -->
        <div class="page-loader-wrapper">
            <div class="loader">
                <div class="m-t-30"><img src="assets/images/logo.svg" width="48" height="48" alt="Alpino"></div>
                <p>Please wait...</p>
            </div>
        </div>
        <div class="overlay_menu">
            <button class="btn btn-primary btn-icon btn-icon-mini btn-round"><i class="zmdi zmdi-close"></i></button>
            <div class="container">
                <div class="row clearfix">
                    <div class="card">
                        <div class="body">
                            <div class="input-group m-b-0">
                                <input type="text" class="form-control" placeholder="Recherche...">
                                <span class="input-group-addon">
                                    <i class="zmdi zmdi-search"></i>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row clearfix">
                    <div class="col-lg-12 col-md-12">
                        <div class="social">
                            <a class="icon" href="https://www.facebook.com/thememakkerteam" target="_blank"><i
                                    class="zmdi zmdi-facebook"></i></a>
                            <a class="icon" href="https://www.behance.net/thememakker" target="_blank"><i
                                    class="zmdi zmdi-behance"></i></a>
                            <a class="icon" href="#"><i class="zmdi zmdi-twitter"></i></a>
                            <a class="icon" href="#"><i class="zmdi zmdi-linkedin"></i></a>
                            <p>Coded by WrapTheme<br> Designed by <a href="http://thememakker.com/"
                                                                     target="_blank">thememakker.com</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="overlay"></div><!-- Overlay For Sidebars -->

        <nav class="navbar">
            <div class="container">
                <ul class="nav navbar-nav">
                    <li>
                        <div class="navbar-header">
                            <a href="javascript:void(0);" class="h-bars"></a>
                            <a class="navbar-brand" href=""><img src="assets/images/logo-black.svg" width="35"
                                                                           alt="Alpino"><span class="m-l-10">Livreur</span></a>
                        </div>
                    </li>
                   
                    <li class="dropdown task badgebit"><a href="javascript:void(0);" class="dropdown-toggle"
                                                          data-toggle="dropdown" role="button"><i class="zmdi zmdi-flag"></i>
                            
                        </a>
                    </li>
                      
                    <li class="float-right">
                        
                      
                        <a href="javascript:void(0);" class="js-right-sidebar"><i
                                class="zmdi zmdi-settings zmdi-hc-spin"></i></a>
                        <a href="/Resto/LogOutLivreur" class="mega-menu"><i class="zmdi zmdi-power"></i></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="menu-container">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <ul class="h-menu">
                            <li class="open active"><a href="/Resto/PlatALivraison?id=<% out.print(idLivreur); %>"><i class="zmdi zmdi-home"></i></a></li>
                            
                            
                            <li><a href="/Resto/PlatALivraison?id=<% out.print(idLivreur); %>">Liste des plats à livrer</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <aside class="right_menu">
            <div id="rightsidebar" class="right-sidebar">
                <ul class="nav nav-tabs">
                    <li class="nav-item"><a class="nav-link active" data-toggle="tab" href="#setting">Setting</a></li>
                   
                </ul>
                <div class="tab-content slim_scroll">
                    <div class="tab-pane slideRight active" id="setting">
                        <div class="card">
                            <div class="header">
                                <h2><strong>Colors</strong> Skins</h2>
                            </div>
                            <div class="body">
                                <ul class="choose-skin list-unstyled m-b-0">
                                    <li data-theme="black" class="active" >
                                        <div class="black"></div>
                                    </li>
                                    <li data-theme="purple">
                                        <div class="purple"></div>
                                    </li>
                                    <li data-theme="blue">
                                        <div class="blue"></div>
                                    </li>
                                    <li data-theme="cyan">
                                        <div class="cyan"></div>
                                    </li>
                                    <li data-theme="green" >
                                        <div class="green"></div>
                                    </li>
                                    <li data-theme="orange">
                                        <div class="orange"></div>
                                    </li>
                                    <li data-theme="blush">
                                        <div class="blush"></div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        
                        
                    </div>
                   
                   
                </div>
            </div>
        </aside>

        <!-- Main Content -->
        <section class="content home">
            <div class="container">
                <jsp:include page="<%=pagesLivreur%>"></jsp:include>
            </div>
        </section>
        <!-- Jquery Core Js -->
        <script src="assets/bundles/libscripts.bundle.js"></script>
        <!-- Lib Scripts Plugin Js ( jquery.v3.2.1, Bootstrap4 js) -->
        <script src="assets/bundles/vendorscripts.bundle.js"></script> <!-- slimscroll, waves Scripts Plugin Js -->

        <script src="assets/bundles/knob.bundle.js"></script> <!-- Jquery Knob-->
        <script src="assets/bundles/sparkline.bundle.js"></script> <!-- sparkline Plugin Js -->
        <script src="assets/plugins/chartjs/Chart.bundle.js"></script> <!-- Chart Plugins Js -->
        <script src="assets/plugins/chartjs/polar_area_chart.js"></script><!-- Polar Area Chart Js -->

        <script src="assets/bundles/mainscripts.bundle.js"></script>
        <script src="assets/js/pages/index.js"></script>
        <script src="assets/js/pages/charts/polar_area_chart.js"></script>
    </body>

</html>