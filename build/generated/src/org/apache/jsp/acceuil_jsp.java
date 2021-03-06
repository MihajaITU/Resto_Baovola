package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import classes.*;
import Control.*;
import Service.*;

public final class acceuil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 
        Type_Produit[] listeType=(Type_Produit[])request.getAttribute("listeType");
        Produit[] listeByType=(Produit[])request.getAttribute("byType");
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"fr\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Resto - Acceuil</title>\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,600,600i,700,700i|Satisfy|Comic+Neue:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("      \n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"fixed-top d-flex align-items-center header-transparent\">\n");
      out.write("    <div class=\"container-fluid container-xl d-flex align-items-center justify-content-between\">\n");
      out.write("\n");
      out.write("      <div class=\"logo me-auto\">\n");
      out.write("        <h1><a href=\"acceuil.jsp\">Resto </a></h1>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <nav id=\"navbar\" class=\"navbar order-last order-lg-0\">\n");
      out.write("          \n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"acceuil.jsp\">Accueil</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#about\">About</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#menu\">Menu</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#specials\">Specials</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#events\">Events</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("      <a href=\"#book-a-table\" class=\"book-a-table-btn scrollto\">R??servez une table</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </header><!-- End Header -->\n");
      out.write("\n");
      out.write("  <!-- ======= Hero Section ======= -->\n");
      out.write("  <section id=\"hero\">\n");
      out.write("    <div class=\"hero-container\">\n");
      out.write("      <div id=\"heroCarousel\" data-bs-interval=\"5000\" class=\"carousel slide carousel-fade\" data-bs-ride=\"carousel\">\n");
      out.write("\n");
      out.write("        <ol class=\"carousel-indicators\" id=\"hero-carousel-indicators\"></ol>\n");
      out.write("\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("          <!-- Slide 1 -->\n");
      out.write("          <div class=\"carousel-item active\" style=\"background-image: url(assets/img/slide/slide-1.jpg);\">\n");
      out.write("            <div class=\"carousel-container\">\n");
      out.write("              <div class=\"carousel-content\">\n");
      out.write("                <h2 class=\"animate__animated animate__fadeInDown\"><span>Resto </span>Gasy</h2>\n");
      out.write("                <p class=\"animate__animated animate__fadeInUp\">Une cuisine ambitieuse 100% maison, un cadre cozy et artistique, venez go??ter! Repas d'affaires ou d??ner en amoureux, le Resto Gasy sera votre table ce soir.</p>\n");
      out.write("                <div>\n");
      out.write("                  <a href=\"#menu\" class=\"btn-menu animate__animated animate__fadeInUp scrollto\">Nos Menus </a>\n");
      out.write("                  <a href=\"#book-a-table\" class=\"btn-book animate__animated animate__fadeInUp scrollto\">Reservez une Table</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon bi bi-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon bi bi-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("  <main id=\"main\">\n");
      out.write("    <!-- ======= Menu Section ======= -->\n");
      out.write("    <section id=\"menu\" class=\"menu\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Regardez vos pr??ferences dans notre <span>Menu </span></h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12 d-flex justify-content-center\">\n");
      out.write("              ");
for(int i=0;i<listeType.length;i++){
      out.write("\n");
      out.write("            <ul id=\"menu-flters\">\n");
      out.write("              <li data-filter=\"*\" class=\"filter-active\">Afficher tout</li>\n");
      out.write("              <a href=\"/Resto/TypeProduit?type=");
 out.print(listeType[i].getDesignation());
      out.write("\"><li data-filter=\".filter-");
 out.print(listeType[i].getDesignation());
      out.write('"');
      out.write('>');
 out.print(listeType[i].getDesignation());
      out.write("</li></a>\n");
      out.write("            </ul>\n");
      out.write("              ");
 } 
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row menu-container\">\n");
      out.write("           ");
for(int i=0;i<listeByType.length;i++){
      out.write(" \n");
      out.write("          <div class=\"col-lg-6 menu-item filter-");
 out.print(listeByType[i].getDesignation());
      out.write("\">\n");
      out.write("            <div class=\"menu-content\">\n");
      out.write("              <a href=\"#\">");
 out.print(listeByType[i].getDesignation());
      out.write("</a><span>0 Ar</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-ingredients\">\n");
      out.write("             ");
 out.print(listeByType[i].getDesignation());
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Menu Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Book A Table Section ======= -->\n");
      out.write("    <section id=\"book-a-table\" class=\"book-a-table\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>R??servez une <span>Table</span></h2>\n");
      out.write("          <p>R??servez votre table d??s maintenant.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"forms/book-a-table.php\" method=\"post\" role=\"form\" class=\"php-email-form\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group\">\n");
      out.write("              <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" placeholder=\"Your Name\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group mt-3 mt-md-0\">\n");
      out.write("              <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Your Email\" data-rule=\"email\" data-msg=\"Please enter a valid email\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group mt-3 mt-md-0\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"Your Phone\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group mt-3\">\n");
      out.write("              <input type=\"date\" name=\"date\" class=\"form-control\" id=\"date\" placeholder=\"Date\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group mt-3\">\n");
      out.write("              <input type=\"time\" class=\"form-control\" name=\"time\" id=\"time\" placeholder=\"Time\" data-rule=\"minlen:4\" data-msg=\"Please enter at least 4 chars\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 form-group mt-3\">\n");
      out.write("              <input type=\"number\" class=\"form-control\" name=\"people\" id=\"people\" placeholder=\"# of people\" data-rule=\"minlen:1\" data-msg=\"Please enter at least 1 chars\">\n");
      out.write("              <div class=\"validate\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group mt-3\">\n");
      out.write("            <textarea class=\"form-control\" name=\"message\" rows=\"5\" placeholder=\"Message\"></textarea>\n");
      out.write("            <div class=\"validate\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mb-3\">\n");
      out.write("            <div class=\"loading\">Loading</div>\n");
      out.write("            <div class=\"error-message\"></div>\n");
      out.write("            <div class=\"sent-message\">Your booking request was sent. We will call back or send an Email to confirm your reservation. Thank you!</div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Book A Table Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Gallery Section ======= -->\n");
      out.write("    <section id=\"gallery\" class=\"gallery\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Quelques photos repr??sentatifs du Restaurant<span> Resto Gasy</span></h2>\n");
      out.write("          <p>Ut possimus qui ut temporibus culpa velit eveniet modi omnis est adipisci expedita at voluptas atque vitae autem.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row g-0\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-1.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-1.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-2.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-2.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-3.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-3.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-4.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-4.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-5.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-5.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-6.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-6.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-7.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-7.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-4\">\n");
      out.write("            <div class=\"gallery-item\">\n");
      out.write("              <a href=\"assets/img/gallery/gallery-8.jpg\" class=\"gallery-lightbox\">\n");
      out.write("                <img src=\"assets/img/gallery/gallery-8.jpg\" alt=\"\" class=\"img-fluid\">\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Gallery Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Contact Section ======= -->\n");
      out.write("    <section id=\"contact\" class=\"contact\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2><span>Contactez</span> Nous</h2>\n");
      out.write("          <p>Pour plus d'informations, veuillez contacter notre service client.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container mt-5\">\n");
      out.write("        <div class=\"info-wrap\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 info\">\n");
      out.write("              <i class=\"bi bi-geo-alt\"></i>\n");
      out.write("              <h4>Location : </h4>\n");
      out.write("              <p>Route RN7<br>Mandrimena Andoharanofotsy, Madagascar 101</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Contact Section -->\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h3>Resto </h3>\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong><span>Resto </span></strong>. Tous droits r??serv??s.\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- End Footer -->\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
