/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bari.dao.UserDao;
import com.bari.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(urlPatterns = {"/controller"})
public class controller extends HttpServlet {

    private String password;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // String action=request.getParameter("action");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
         /*   if(action.equalsIgnoreCase("login")){
                RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
                rd.forward(request, response); 
                
            }*/
            if(request.getQueryString().equals("home")){
             RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("about")){
             RequestDispatcher rd=request.getRequestDispatcher("about.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("books")){
             RequestDispatcher rd=request.getRequestDispatcher("category.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("specialBooks")){
             RequestDispatcher rd=request.getRequestDispatcher("specials.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("myaccount")){
             RequestDispatcher rd=request.getRequestDispatcher("myaccount.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("register")){
             RequestDispatcher rd=request.getRequestDispatcher("register.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("prices")){
             RequestDispatcher rd=request.getRequestDispatcher("details.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("contact")){
             RequestDispatcher rd=request.getRequestDispatcher("contact.jsp");  
            rd.forward(request, response);
            }
            out.println(request.getQueryString());
        
             
      
    }  
  
   
   
}  
        
    
            
            
            
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out=response.getWriter();
        
        
             User bean=new User();  
            // UserDao ud=new UserDao();
             String name1;
             name1 = request.getParameter("name");
             String name2=request.getParameter("pass");
             
             //bean=ud.getUserByName(name1);
             //bean.setUname(name1);
             // bean.setPassword(name1);
              UserDao d=new UserDao();
              bean=d.getUserByName(name1);
             request.setAttribute("bean",bean);  
       
      
            boolean status=bean.validate(name2);  
          
       if(status){  
           RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
           rd.forward(request, response);  
        }  
        else{  
           RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
           rd.forward(request, response);  
        }  
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
