<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="com.bari.dao.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All Users</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>User Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            
            <%
UserDao ubean= new UserDao(); //(UserDao)request.getAttribute("bean");

//out.print("Welcome, "+ ubean.getAllUsers().toString());

 //   while (ubean.getAllUsers().iterator().hasNext()) {    
     //                       out.println(ubean.getAllUsers().iterator().next());
   // }

for(int i = 0; i < ubean.getAllUsers().size(); i++) {
//out.print("Welcome, "+ ubean.getAllUsers().get(i).getUname());
         //allFestivals.get(i).getFestivalName()
%>
        <tr>      
            <td><%= ubean.getAllUsers().get(i).getUname()%></td>
            <td><%= ubean.getAllUsers().get(i).getEmail() %></td>
            <td><%= ubean.getAllUsers().get(i).getPhone() %></td>
            <td><a href="UserController?action=edit&userId=<%= ubean.getAllUsers().get(i).getId() %>">Update</a></td>
            <td><a href="UserController?action=delete&userId=<%= ubean.getAllUsers().get(i).getId() %>">Delete</a></td>
        </tr>
    <%  } %>

        </tbody>
    </table>
    <p><a href="UserController?action=insert">Add User</a></p>
</body>
</html>
