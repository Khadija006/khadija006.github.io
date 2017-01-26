package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myaccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\n");
      out.write("<title>Book Store</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <div class=\"center_content\">\n");
      out.write("       \t<div class=\"left_content\">\n");
      out.write("            <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.gif\" alt=\"\" title=\"\" /></span>My Account</div>\n");
      out.write("        \n");
      out.write("        \t<div class=\"feat_prod_box_details\">\n");
      out.write("            <p class=\"details\">\n");
      out.write("             You can login into your account by using your email address and password. \n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("              \t<div class=\"contact_form\">\n");
      out.write("                <div class=\"form_subtitle\">Login into your account</div>\n");
      out.write("                 <form name=\"register\" action=\"UserController\">          \n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    <label class=\"contact\"><strong>Username:</strong></label>\n");
      out.write("                    <input type=\"text\" class=\"contact_input\" />\n");
      out.write("                    </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    <label class=\"contact\"><strong>Password:</strong></label>\n");
      out.write("                    <input type=\"text\" class=\"contact_input\" />\n");
      out.write("                    </div>                     \n");
      out.write("\n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                        <div class=\"terms\">\n");
      out.write("                        <input type=\"checkbox\" name=\"terms\" />\n");
      out.write("                        Remember me\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <div class=\"form_row\">\n");
      out.write("                    <input type=\"submit\" class=\"register\" value=\"login\" />\n");
      out.write("                    </div>   \n");
      out.write("                    \n");
      out.write("                  </form>     \n");
      out.write("                    \n");
      out.write("                </div>  \n");
      out.write("            \n");
      out.write("            </div>\t\n");
      out.write("            \n");
      out.write("              \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        </div><!--end of left content-->\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "divRight.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <div class=\"clear\"></div>\n");
      out.write("       </div><!--end of center content-->\n");
      out.write("       \n");
      out.write("              \n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
