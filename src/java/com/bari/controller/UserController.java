
package com.bari.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bari.dao.UserDao;
import com.bari.model.User;
 

public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/user.jsp";
    private static String LIST_USER = "/listuser.jsp";
    private UserDao dao;

    public UserController() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String username = request.getParameter("name");
            dao.deleteUser(username);
            forward = LIST_USER;
            request.setAttribute("Login", dao.getAllUsers());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String username1= request.getParameter("username");
            User user = dao.getUserById(username1);
            
            request.setAttribute("user", user);
           // dao.updateUser(user);
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_USER;
            request.setAttribute("Login", dao.getAllUsers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        //request.getParameter("userId")
        user.setId(request.getParameter("uname"));
        user.setUname(request.getParameter("pw"));
        user.setPassword(request.getParameter("em"));
        user.setEmail(request.getParameter("email"));
        user.setPhone(request.getParameter("phn"));
        user.setAddress(request.getParameter("add"));
        
        
        dao.checkUser(user);

        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("Login", dao.getAllUsers());
        view.forward(request, response);
    }
}
