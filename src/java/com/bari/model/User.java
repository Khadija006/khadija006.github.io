/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bari.model;
//import java.util.Date;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory.Result;


public class User {
   String  id,uname, password, email, phone, address;
   
   //Date registeredon;
 public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String registeredon) {
        this.phone = phone;
    }
    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address =address;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }  
  public boolean validate(String pw){
      
      if(password.equals(pw)){
          
          
        return true;
        }
      else
          return false;
  }
          
      
          
      
//      try{
//          Statement s=con.createStatement();
//          ResultSet rs=s.executeQuery("Select*from Login");
//          while(rs.next()&& temp== false)
//          {
//              String nam=rs.getString("UserName");
//              String pass=rs.getString("Password");
//              if(uname.equals(nam) && password.equals(pass))
//              {
//                  temp=true;
//              }
//              else{
//                  temp=false;
//              }
//          }
//                  
//      }
//      catch(Exception e){
//          e.printStackTrace();
//      }
//     
//      
//	return temp;

   
}

