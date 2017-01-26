/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bari.dao;

import java.sql.*;
import java.util.*;
import com.bari.model.User;
import com.bari.util.DataBase;

public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DataBase.getConnection();
    }

    public void checkUser(User user) {
        try {
            PreparedStatement ps = connection.prepareStatement("select * from Login where ID=?");
            ps.setString(1, user.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                updateUser(user);
            } else {
                addUser(user);
                //updateUser(user);
            }
        } catch (Exception ex) {
            System.out.println("Error in check() -->" + ex.getMessage());
        } 
    }
    public void addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Login(UserName, Password, Email,Phone,Address) values (?, ?, ?, ?,? )");
            // Parameters start with 1
            preparedStatement.setString(1, user.getUname());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
//            preparedStatement.setDate(4, new java.sql.Date(user.getRegisteredon().getTime()));
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(4, user.getAddress());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(String userId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from Login where ID=?");
            // Parameters start with 1
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("update Login set password=?, email=? where ID=?");
            //System.out.println("ASDF" + user.getId());
            // Parameters start with 1
        //    System.out.println(new java.sql.Date(user.getRegisteredon().getTime()));
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getEmail());
            //preparedStatement.setDate(3, new java.sql.Date(user.getRegisteredon().getTime()));
            //preparedStatement.setString(3, user.getRegisteredon());
            preparedStatement.setString(3, user.getId());
            preparedStatement.executeUpdate();
            //System.out.println("ASDF" + user.getId());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from Login");
            while (rs.next()) {
                User user = new User();
                //user.setUname("Myname");
                //user.setPassword("Mypassword");
                //user.setEmail("Myemail");
                //user.setRegisteredon("Myregisteredon");
                
                user.setUname(rs.getString("UserName"));
                user.setPassword(rs.getString("Password"));
                user.setEmail(rs.getString("Email"));
                user.setPhone(rs.getString("Phone"));
                user.setId(rs.getString("ID"));
                user.setAddress(rs.getString("Address"));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }

    public User getUserById(String userId) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Login where ID=?");
            preparedStatement.setString(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setUname(rs.getString("UserName"));
                user.setPassword(rs.getString("Password"));
                user.setEmail(rs.getString("Email"));
                user.setPhone(rs.getString("Phone"));
                user.setAddress(rs.getString("Address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }


 public User getUserByName(String UserName) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Login where UserName=?");
            preparedStatement.setString(1, UserName);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setUname(rs.getString("UserName"));
                user.setPassword(rs.getString("Password"));
                user.setEmail(rs.getString("Email"));
//                user.setPhone(rs.getString("phone"));
//                user.setAddress(rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}
