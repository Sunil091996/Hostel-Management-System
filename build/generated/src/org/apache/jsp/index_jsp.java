package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hostel</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"description\" content=\"Unicat project\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("        <link href=\"plugins/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/owl.theme.default.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"plugins/OwlCarousel2-2.2.1/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main_styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/responsive.css\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                  <!-- Header -->\n");
      out.write("\n");
      out.write("            <header class=\"header\">\n");
      out.write("\n");
      out.write("                <!-- Top Bar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Header Content -->\n");
      out.write("                <div class=\"header_container\">\n");
      out.write("                    <div class=\"container\" style=\"margin-left:0px;\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"header_content d-flex flex-row align-items-center justify-content-start\" > \n");
      out.write("                                    <div>\n");
      out.write("                                        <img src=\"MANIT-Bhopal-.png\" style=\"margin-left:10px ;margin-top:10px;;width:90px; height:90px; float:left; \">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"logo_text\">\n");
      out.write("                                        <p style=\"color:#ff3333; margin-bottom:0px;\">MAULANA AZAD NATIONAL INSTITUTE OF TECHNOLOGY</p>\n");
      out.write("                                        <p style=\"color: #b3003b;margin-bottom:0px;\">PAPERLESS HOSTEL , Bhopal (M.P.)</p>\n");
      out.write("                                        <p style=\"color: #b3003b;\">Pincode - 462003</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <nav class=\"main_nav_contaner ml-auto\">\n");
      out.write("                                        <ul class=\"main_nav\">\n");
      out.write("                                            <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                            <li><a href=\"notification.jsp\">Notification</a></li>\n");
      out.write("                                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                            <li><a href=\"registration.jsp\"><button class=\"btnregister\">Register</button></a></li>\n");
      out.write("                                            <li><a href=\"#\"><button class=\"btnsign_in\" onclick=\"document.getElementById('id01').style.display = 'block'\" >Sign in</button></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </nav>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </header>\n");
      out.write("            ");
      out.write("\n");
      out.write("         <!-- Sign up popup-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "signin.jsp", out, false);
      out.write("  \n");
      out.write("            <!-- Sign up popup-->\n");
      out.write("       \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <!-- Menu -->\n");
      out.write("\n");
      out.write("            <div class=\"menu d-flex flex-column align-items-end justify-content-start text-right menu_mm trans_400\">\n");
      out.write("                <div class=\"menu_close_container\"><div class=\"menu_close\"><div></div><div></div></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Home -->\n");
      out.write("\n");
      out.write("            <div class=\"home\">\n");
      out.write("                <div class=\"home_slider_container\">\n");
      out.write("\n");
      out.write("                    <!-- Home Slider -->\n");
      out.write("                    <div class=\"owl-carousel owl-theme home_slider\">\n");
      out.write("\n");
      out.write("                        <!-- Home Slider Item -->\n");
      out.write("                        <div class=\"owl-item\">\n");
      out.write("                            <div class=\"home_slider_background\" style=\"background-image:url(images/download11.jpeg)\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Home Slider Item -->\n");
      out.write("                        <div class=\"owl-item\">\n");
      out.write("                            <div class=\"home_slider_background\" style=\"background-image:url(images/download32.jpeg)\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Home Slider Item -->\n");
      out.write("                        <div class=\"owl-item\">\n");
      out.write("                            <div class=\"home_slider_background\" style=\"background-image:url(images/download31.jpg)\"></div>\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Home Slider Item -->\n");
      out.write("                        <div class=\"owl-item\">\n");
      out.write("                            <div class=\"home_slider_background\" style=\"background-image:url(images/download.jpeg)\"></div>\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Home Slider Nav -->\n");
      out.write("\n");
      out.write("                <div class=\"home_slider_nav home_slider_prev\"><i class=\"fa fa-angle-left\" aria-hidden=\"true\"></i></div>\n");
      out.write("                <div class=\"home_slider_nav home_slider_next\"><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Features -->\n");
      out.write("\n");
      out.write("            <div class=\"features\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"section_title_container text-center\">\n");
      out.write("                                <h2 class=\"section_title\">Welcome To Hostel</h2>\n");
      out.write("                                <div class=\"section_subtitle\"><p>People tend to make this too complex! \n");
      out.write("                                        Don't drown the traveler in information. Be concise.\n");
      out.write("                                        Many times (in the case of hospitality), \n");
      out.write("                                        photos sell much better than words do. So,show your hostel and your rooms, \n");
      out.write("                                        show the location of your hostel on interactive map, along with your area's relevant\n");
      out.write("                                        landmarks or attractions. Give them a quick idea of price range, or point them to your \n");
      out.write("                                        website's booking engine for checking out rates.\n");
      out.write("                                        It's this simple stuff that really matters.</p></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Rooms -->\n");
      out.write("\n");
      out.write("            <div class=\"courses\">\n");
      out.write("                <div class=\"section_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/courses_background.jpg\" data-speed=\"0.8\"></div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"section_title_container text-center\">\n");
      out.write("                                <h2 class=\"section_title\" id=\"room\">Rooms</h2>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row courses_row\">\n");
      out.write("\n");
      out.write("                        <!-- Occupacy -->\n");
      out.write("                        <div class=\"col-lg-4 course_col\">\n");
      out.write("                            <div class=\"course\">\n");
      out.write("                                <div class=\"course_image\"><img src=\"images/download33.jpeg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"course_body\">\n");
      out.write("                                    <h3 class=\"course_title\"><a href=\"#\">Single Occupancy</a></h3>\n");
      out.write("                                    <div class=\"course_text\">\n");
      out.write("                                        <p>Single Occupancy is only available for P.G. Student ( MCA/M.Tech/MBA/M.Plan/Ph.D )</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"course_footer\">\n");
      out.write("                                    <div class=\"course_footer_content d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                                        <div class=\"course_price ml-auto\">₹ 20500</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Course -->\n");
      out.write("                        <div class=\"col-lg-4 course_col\">\n");
      out.write("                            <div class=\"course\">\n");
      out.write("                                <div class=\"course_image\"><img src=\"images/download34.jpeg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"course_body\">\n");
      out.write("                                    <h3 class=\"course_title\"><a href=\"#\">Double Occupancy</a></h3>\n");
      out.write("                                    <div class=\"course_text\">\n");
      out.write("                                        <p>Double Occupancy is only available for UG Student ( II/III/IV year)</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"course_footer\">\n");
      out.write("                                    <div class=\"course_footer_content d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("\n");
      out.write("                                        <div class=\"course_price ml-auto\">₹ 18500</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Course -->\n");
      out.write("                        <div class=\"col-lg-4 course_col\">\n");
      out.write("                            <div class=\"course\">\n");
      out.write("                                <div class=\"course_image\"><img src=\"images/download33.jpeg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"course_body\">\n");
      out.write("                                    <h3 class=\"course_title\"><a href=\"#\">Triple Occupancy</a></h3>\n");
      out.write("                                    <div class=\"course_text\">\n");
      out.write("                                        <p>Triple Occupancy is only available for UG Student ( I year )</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"course_footer\">\n");
      out.write("                                    <div class=\"course_footer_content d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                                        <div class=\"course_price ml-auto\">₹ 15500</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Team -->\n");
      out.write("\n");
      out.write("            <div class=\"team\">\n");
      out.write("                <div class=\"team_background parallax-window\" data-parallax=\"scroll\" data-image-src=\"images/team_background.jpg\" data-speed=\"0.8\"></div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"section_title_container text-center\">\n");
      out.write("                                <h2 class=\"section_title\">Our Staff</h2>\n");
      out.write("                                <div class=\"section_subtitle\"><p></p></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row team_row\">\n");
      out.write("\n");
      out.write("                        <!-- Team Item -->\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 team_col\">\n");
      out.write("                            <div class=\"team_item\">\n");
      out.write("                                <div class=\"team_image\"><img src=\"images/download4.jpg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"team_body\">\n");
      out.write("                                    <div class=\"team_title\"><a href=\"#\">Mr Ashish</a></div>\n");
      out.write("                                    <div class=\"team_subtitle\">Warden</div>\n");
      out.write("                                    <div class=\"social_list\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Team Item -->\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 team_col\">\n");
      out.write("                            <div class=\"team_item\">\n");
      out.write("                                <div class=\"team_image\"><img src=\"images/download4.jpg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"team_body\">\n");
      out.write("                                    <div class=\"team_title\"><a href=\"#\">Mr Sunil</a></div>\n");
      out.write("                                    <div class=\"team_subtitle\">Caretaker</div>\n");
      out.write("                                    <div class=\"social_list\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Team Item -->\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 team_col\">\n");
      out.write("                            <div class=\"team_item\">\n");
      out.write("                                <div class=\"team_image\"><img src=\"images/download4.jpg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"team_body\">\n");
      out.write("                                    <div class=\"team_title\"><a href=\"#\">Mr Abhishek</a></div>\n");
      out.write("                                    <div class=\"team_subtitle\">Electric Department</div>\n");
      out.write("                                    <div class=\"social_list\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Team Item -->\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 team_col\">\n");
      out.write("                            <div class=\"team_item\">\n");
      out.write("                                <div class=\"team_image\"><img src=\"images/download4.jpg\" alt=\"\"></div>\n");
      out.write("                                <div class=\"team_body\">\n");
      out.write("                                    <div class=\"team_title\"><a href=\"#\">Mr Ankit</a></div>\n");
      out.write("                                    <div class=\"team_subtitle\">Mess Incharge</div>\n");
      out.write("                                    <div class=\"social_list\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
