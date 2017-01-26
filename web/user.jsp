<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bari.dao.UserDao"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New User</title>
    </head>
    <body>
        <form method="POST" action='UserController' name="frmAddUser">
            <% String action = request.getParameter("action");
                System.out.println(action);
                UserDao ubean= new UserDao();
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <input type="hidden" name="userId"
                               value="<%= request.getParameter("uname") %>"/>
            
            UserName : <input type="text" name="uname"
                               value="<%= ubean.getUserById(request.getParameter("userId")).getUname() %>" readonly="readonly"/>(You Can't Change this)  <br /> 
            
            Password : <input
                type="password" name="pass"
                value="<%= ubean.getUserById(request.getParameter("pw")).getPassword()%>" /> <br /> 
            Email : <input
                type="text" name="email"
                value="<%= ubean.getUserById(request.getParameter("em")).getEmail()%>" /> <br />
            
            Phone : <input
                type="text" name="phn"
                value="<%= ubean.getUserById(request.getParameter("phn")).getPhone() %>"/>  <br />
            
            Address : <input
                type="text" name="add"
                value="<%= ubean.getUserById(request.getParameter("add")).getAddress() %>" /> <br />
            
            <%} else {%>
            User Name : <input type="text" name="uname" value="" /> <br />
            
            Password : <input
                type="text" name="pass" value="" /> <br /> 
            Email : <input
                type="text" name="email"  value="" /> <br /> 
            
            Phone : <input
                type="text" name="phn" value="" /> <br /> 
            <%}%>
            <input  type="submit" value="Submit" />
        </form>
    </body>
</html>
