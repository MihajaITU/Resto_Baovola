<%-- 
    Document   : acceuil
    Created on : 24 mai 2022, 10:07:52
    Author     : jeant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.*"%>
<%@page import="Control.*"%>
<%@page import="Service.*"%>

<!DOCTYPE html>
<html lang="fr">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Resto - Connexion</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,600,600i,700,700i|Satisfy|Comic+Neue:300,300i,400,400i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">
    </head>
    <body>
        <!-- ======= Hero Section ======= -->
        <main id="main">
            <section id="book-a-table" class="book-a-table">
                <div class="container">

                    <div class="section-title">
                        <h2>Connexion <span>Admin</span></h2>
                        <p>Connectez-vous dès maintenant.</p>
                    </div>

                    <form action="/LoginAdmin" method="post" role="form" class="php-email-form">
                        <div class="row">
                            <div class="col-lg-4 col-md-6 form-group">

                            </div>
                            <div class="col-lg-4 col-md-6 form-group mt-3 mt-md-0">
                                <input type="text" class="form-control" name="login" id="email" placeholder="Nom d'utilisateur" data-rule="email" data-msg="Please enter a valid email">
                                <div class="validate"></div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-6 form-group">

                            </div>
                            <div class="col-lg-4 col-md-6 form-group mt-3 mt-md-0">
                                <input type="password" class="form-control" name="mdp" id="email" placeholder="Mot de passe" data-rule="email" data-msg="Please enter a valid email">
                                <div class="validate"></div>
                            </div>
                        </div>
                        <div class="text-center"><input class="btn btn-warning" type="submit" value="Se Connecter"></div>
                    </form>

                </div>
            </section><!-- End Book A Table Section -->

            <!-- ======= Gallery Section ======= -->

        </main><!-- End #main -->

        <!-- Vendor JS Files -->
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>

</html>
