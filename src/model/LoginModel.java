/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import components.Rajamobil;
import config.DbConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author $Teguh Kristianto
 */
public class LoginModel {
    public String username;
    public String password;
    
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String login() throws SQLException{
        
        String result = "empty";
        try {
            DbConn objConn = new DbConn();
            Connection conn = objConn.koneksiDB();
            Statement st = conn.createStatement();
            
            String query = "select * from gf_clients where username='"+ username +"'";
            ResultSet rs = st.executeQuery(query);
            Rajamobil rm = new Rajamobil();
            String md5password = rm.md5(password);
            if(rs.next()){
                if(rs.getString("password").equals(md5password)){
                    result = "exist";
                }
            }
        } catch (Exception e) {
            
        }
        return result;
    }
    
    public void test(){
        System.out.println(username);
    }
}
