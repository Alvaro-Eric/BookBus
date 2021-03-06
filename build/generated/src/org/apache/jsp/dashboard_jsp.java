package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ManagerAccount;
import model.Account;
import java.util.List;
import dao.GeneralDao;
import model.Company;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/tailwind.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"h-screen overflow-hidden flex items-center justify-start\" style=\"background: #edf2f7\">\n");
      out.write("        ");

            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

            if (session.getAttribute("user") == null) {
                response.sendRedirect("login.jsp?trigger=dashboard");
            } else {
                ManagerAccount account = null;
                try {
                    account = (ManagerAccount) session.getAttribute("user");
                    request.setAttribute("email", account.getEmail());
                    request.setAttribute("role", account.getAccountRole());
                } catch (ClassCastException e) {
                    response.sendRedirect("login.jsp?trigger=dashboard");
                }

            }

            //            request.setAttribute("genderlist", ds.getGenderList());
        
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"./assets/alpine.js\"\n");
      out.write("            defer\n");
      out.write("        ></script>\n");
      out.write("\n");
      out.write("        <div class=\"bg-gray-200 font-sans\">\n");
      out.write("            <div class=\"flex flex-col sm:flex-row sm:justify-around\">\n");
      out.write("                <div class=\"w-64 h-screen bg-gray-800\">\n");
      out.write("                    <div class=\"flex items-center justify-center mt-10\">\n");
      out.write("                        <!--<img class=\"h-6\" src=\"https://premium-tailwindcomponents.netlify.app/assets/svg/tailwindcomponent-light.svg\">--> \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <nav class=\"mt-10\">\n");
      out.write("                        <div x-data=\"{ open: false }\">\n");
      out.write("                            <button\n");
      out.write("                                @click=\"open = !open\"\n");
      out.write("                                class=\"w-full flex justify-between items-center py-3 px-6 text-gray-100 cursor-pointer hover:bg-gray-700 hover:text-gray-100 focus:outline-none\"\n");
      out.write("                                >\n");
      out.write("                                <span class=\"flex items-center\">\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-5 w-5\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M19 11H5M19 11C20.1046 11 21 11.8954 21 13V19C21 20.1046 20.1046 21 19 21H5C3.89543 21 3 20.1046 3 19V13C3 11.8954 3.89543 11 5 11M19 11V9C19 7.89543 18.1046 7 17 7M5 11V9C5 7.89543 5.89543 7 7 7M7 7V5C7 3.89543 7.89543 3 9 3H15C16.1046 3 17 3.89543 17 5V7M7 7H17\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("\n");
      out.write("                                    <span class=\"mx-4 font-medium\">Dashboard</span>\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("                                <span>\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-4 w-4\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"! open\"\n");
      out.write("                                        d=\"M9 5L16 12L9 19\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        style=\"display: none\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"open\"\n");
      out.write("                                        d=\"M19 9L12 16L5 9\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div x-show=\"open\" class=\"bg-gray-700\">\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"addaccount.jsp\"  onclick=\"openMenu(event, 'view-routes')\"\n");
      out.write("                                    >Add account</a\n");
      out.write("                                >\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"accountspercompany.jsp\"\n");
      out.write("                                    >Manage Accounts</a\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div x-data=\"{ open: false }\">\n");
      out.write("                            <button\n");
      out.write("                                @click=\"open = !open\"\n");
      out.write("                                class=\"w-full flex justify-between items-center py-3 px-6 text-gray-100 cursor-pointer hover:bg-gray-700 hover:text-gray-100 focus:outline-none\"\n");
      out.write("                                >\n");
      out.write("                                <span class=\"flex items-center\">\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-5 w-5\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M16 7C16 9.20914 14.2091 11 12 11C9.79086 11 8 9.20914 8 7C8 4.79086 9.79086 3 12 3C14.2091 3 16 4.79086 16 7Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M12 14C8.13401 14 5 17.134 5 21H19C19 17.134 15.866 14 12 14Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("\n");
      out.write("                                    <span class=\"mx-4 font-medium\">Routes</span>\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("                                <span>\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-4 w-4\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"! open\"\n");
      out.write("                                        d=\"M9 5L16 12L9 19\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        style=\"display: none\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"open\"\n");
      out.write("                                        d=\"M19 9L12 16L5 9\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div x-show=\"open\" class=\"bg-gray-700\">\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"requestroute.jsp\"\n");
      out.write("                                    >Request Route</a\n");
      out.write("                                >\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"routespercompany.jsp\"\n");
      out.write("                                    >All Routes</a\n");
      out.write("                                >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div x-data=\"{ open: false }\">\n");
      out.write("                            <button\n");
      out.write("                                @click=\"open = !open\"\n");
      out.write("                                class=\"w-full flex justify-between items-center py-3 px-6 text-gray-100 cursor-pointer hover:bg-gray-700 hover:text-gray-100 focus:outline-none\"\n");
      out.write("                                >\n");
      out.write("                                <span class=\"flex items-center\">\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-5 w-5\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M16 7C16 9.20914 14.2091 11 12 11C9.79086 11 8 9.20914 8 7C8 4.79086 9.79086 3 12 3C14.2091 3 16 4.79086 16 7Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M12 14C8.13401 14 5 17.134 5 21H19C19 17.134 15.866 14 12 14Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("\n");
      out.write("                                    <span class=\"mx-4 font-medium\">Journey</span>\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("                                <span>\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-4 w-4\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"! open\"\n");
      out.write("                                        d=\"M9 5L16 12L9 19\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        style=\"display: none\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"open\"\n");
      out.write("                                        d=\"M19 9L12 16L5 9\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div x-show=\"open\" class=\"bg-gray-700\">\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"addjourney.jsp\"\n");
      out.write("                                    >Add Journey</a\n");
      out.write("                                >\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"journeyspercompany.jsp\"\n");
      out.write("                                    >All Journey</a\n");
      out.write("                                >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div x-data=\"{ open: false }\">\n");
      out.write("                            <button\n");
      out.write("                                @click=\"open = !open\"\n");
      out.write("                                class=\"w-full flex justify-between items-center py-3 px-6 text-gray-100 cursor-pointer hover:bg-gray-700 hover:text-gray-100 focus:outline-none\"\n");
      out.write("                                >\n");
      out.write("                                <span class=\"flex items-center\">\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-5 w-5\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M15 5V7M15 11V13M15 17V19M5 5C3.89543 5 3 5.89543 3 7V10C4.10457 10 5 10.8954 5 12C5 13.1046 4.10457 14 3 14V17C3 18.1046 3.89543 19 5 19H19C20.1046 19 21 18.1046 21 17V14C19.8954 14 19 13.1046 19 12C19 10.8954 19.8954 10 21 10V7C21 5.89543 20.1046 5 19 5H5Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("\n");
      out.write("                                    <span class=\"mx-4 font-medium\">Tickets</span>\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("                                <span>\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-4 w-4\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"! open\"\n");
      out.write("                                        d=\"M9 5L16 12L9 19\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        style=\"display: none\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"open\"\n");
      out.write("                                        d=\"M19 9L12 16L5 9\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div x-show=\"open\" class=\"bg-gray-700\">\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"ticketspercompany.jsp\"\n");
      out.write("                                    >All Tickets</a\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div x-data=\"{ open: false }\">\n");
      out.write("                            <button\n");
      out.write("                                @click=\"open = !open\"\n");
      out.write("                                class=\"w-full flex justify-between items-center py-3 px-6 text-gray-100 cursor-pointer hover:bg-gray-700 hover:text-gray-100 focus:outline-none\"\n");
      out.write("                                >\n");
      out.write("                                <span class=\"flex items-center\">\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-5 w-5\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        d=\"M15 5V7M15 11V13M15 17V19M5 5C3.89543 5 3 5.89543 3 7V10C4.10457 10 5 10.8954 5 12C5 13.1046 4.10457 14 3 14V17C3 18.1046 3.89543 19 5 19H19C20.1046 19 21 18.1046 21 17V14C19.8954 14 19 13.1046 19 12C19 10.8954 19.8954 10 21 10V7C21 5.89543 20.1046 5 19 5H5Z\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("\n");
      out.write("                                    <span class=\"mx-4 font-medium\">Settings</span>\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("                                <span>\n");
      out.write("                                    <svg\n");
      out.write("                                        class=\"h-4 w-4\"\n");
      out.write("                                        viewBox=\"0 0 24 24\"\n");
      out.write("                                        fill=\"none\"\n");
      out.write("                                        xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                        >\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"! open\"\n");
      out.write("                                        d=\"M9 5L16 12L9 19\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        style=\"display: none\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    <path\n");
      out.write("                                        x-show=\"open\"\n");
      out.write("                                        d=\"M19 9L12 16L5 9\"\n");
      out.write("                                        stroke=\"currentColor\"\n");
      out.write("                                        stroke-width=\"2\"\n");
      out.write("                                        stroke-linecap=\"round\"\n");
      out.write("                                        stroke-linejoin=\"round\"\n");
      out.write("                                        ></path>\n");
      out.write("                                    </svg>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            <div x-show=\"open\" class=\"bg-gray-700\">\n");
      out.write("                                <a\n");
      out.write("                                    class=\"py-2 px-16 block text-sm text-gray-100 hover:bg-blue-500 hover:text-white\"\n");
      out.write("                                    href=\"CompanyControl?action=logout\"\n");
      out.write("                                    >Logout</a\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <div class=\"absolute bottom-0 my-8\">\n");
      out.write("                        <a\n");
      out.write("                            class=\"flex items-center py-2 px-8 text-gray-300 mx-1 rounded-lg bg-gray-600 hover:text-gray-200\"\n");
      out.write("                            href=\"#\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"flex justify-between items-center\">\n");
      out.write("                                <img\n");
      out.write("                                    class=\"h-6 w-6 rounded-full mr-3 object-cover\"\n");
      out.write("                                    src=\"./assets/img/service/avatar.jpg\"\n");
      out.write("                                    alt=\"avatar\"\n");
      out.write("                                    />\n");
      out.write("                                <div class=\"flex flex-col justify-between\">\n");
      out.write("                                    <div class=\"text-sm font-thin\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    <div class=\"text-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <div class=\"grid w-full min-h-screen place-items-center\"> -->\n");
      out.write("\n");
      out.write("        <!-- </div> -->\n");
      out.write("        <script>\n");
      out.write("            function openMenu(evt, MenuName) {\n");
      out.write("                var i, x, tablinks;\n");
      out.write("                x = document.getElementsByClassName(\"admin-tab\");\n");
      out.write("                for (i = 0; i < x.length; i++) {\n");
      out.write("                    x[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                document.getElementById(MenuName).style.display = \"block\";\n");
      out.write("                evt.currentTarget.className += \" w3-grey\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
