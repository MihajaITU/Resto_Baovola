<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restol</title>

    <link rel="stylesheet" href="w3/w3.css">
<link rel="stylesheet" href="w3/w3-theme-black.css">
<link rel="stylesheet" href="w3/font-awesome.min.css">

</head>
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
.w3-sidenav a,.w3-sidenav h4 {padding: 12px;}
.w3-navbar li a {
    padding-top: 12px;
    padding-bottom: 12px;
}
</style>
<body>
  
<!-- Navbar -->
<div class="w3-top">
  <ul class="w3-navbar w3-theme w3-top w3-left-align w3-large">
    <li class="w3-opennav w3-right w3-hide-large">
      <a class="w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    </li>
    <li><a href="#" class="w3-theme-l1">Vaika Maika</a></li>
    <li class="w3-hide-small"><a href="<?php echo site_url()."Load/Detruire";?>" class="w3-hover-white">Deconnexion</a></li>
    
  </ul>
</div>

<!-- Sidenav -->
<nav class="w3-sidenav w3-collapse w3-theme-l5 w3-animate-left" style="z-index:3;width:250px;margin-top:51px;" id="mySidenav">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="close menu">
    <i class="fa fa-remove"></i>
  </a>
  <h4><b>Menu de l'utilisateur :</b></h4>
  <a href="<?php echo site_url()."Welcome/vuTrajet"?>" class="w3-hover-black">Ajout des Trajets</a>
  <a href="<?php echo site_url()."Welcome/ListTrajet"?>" class="w3-hover-black">Liste des Trajets</a>
  <a href="<?php echo site_url()."Welcome/vuEcheance"?>" class="w3-hover-black">Ajout échéances</a>
  <a href="<?php echo site_url()."Welcome/vuMajEcheance"?>" class="w3-hover-black">Mise à jour échances</a>
  <a href="<?php echo site_url()."Welcome/vuVehicule"?>" class="w3-hover-black">Liste des Véhicules</a>
  <a href="<?php echo site_url()."Welcome/statEcheance"?>" class="w3-hover-black">Situation des échéances</a>
  <a href="<?php echo site_url()."Load/Detruire";?>" class="w3-hover-white"><button class="w3-btn w3-white w3-border w3-border-red w3-round-xlarge">Deconnexion</button></a>

</nav>


<!-- Main content: shift it to the right by 250 pixels when the sidenav is visible -->
<div class="w3-main" style="margin-left:250px">

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Liste des Véhicules :</h1> 
      <table class="w3-table w3-striped w3-border">
          <tr>
            <th>N°</th>
            <th>Numero</th>
            <th>Marque</th>
            <th>Modèle</th>
            <th>Type</th>
            <th>etat</th>
          </tr>
          <?php foreach ($vaika as $tra){?>
          <tr>
            <td><?php echo $tra['idVehicule'];?></td>
            <td><?php echo $tra['numero'];?></td>
            <td><?php echo $tra['marque'];?></td>
            <td><?php echo $tra['modele'];?></td>
            <td><?php echo $tra['type'];?></td>
            
            <?php if( $check == $tra['numero'] ){?>
            <td style="background-color:brown "><?php echo $check['numero']?> utilisé</td>
            <?php } else {?>
               <td style="background-color:aquamarine "> disponible</td>
            <?php }?><?php }?>
          </tr>
        
      </table>
     </div>
  </div>

  <footer id="myFooter">
    <div class="w3-container w3-theme-l2 w3-padding-32">
      <h4>Evaluation</h4>
    </div>

    <div class="w3-container w3-theme-l1">
      <p>2022 Evaluation</a></p>
    </div>
  </footer>

<!-- END MAIN -->
</div>

<script>
// Get the Sidenav
var mySidenav = document.getElementById("mySidenav");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidenav, and add overlay effect
function w3_open() {
    if (mySidenav.style.display === 'block') {
        mySidenav.style.display = 'none';
        overlayBg.style.display = "none";
    } else {
        mySidenav.style.display = 'block';
        overlayBg.style.display = "block";
    }
}

// Close the sidenav with the close button
function w3_close() {
    mySidenav.style.display = "none";
    overlayBg.style.display = "none";
}
</script>
</body>
</html>