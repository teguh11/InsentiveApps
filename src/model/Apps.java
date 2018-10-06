/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import components.comboItems;
import config.DbConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACT
 */
public class Apps {
    public HashMap<String, Integer> appsCombo(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        DbConn dbcon = new DbConn();
        Connection conn = dbcon.koneksiDB();
        Statement st;
        ResultSet rs;
        
        try {
//Statement st = conn.createStatement();
//            
//            String query = "select * from user where username='"+ username +"'";
//            ResultSet rs = st.executeQuery(query);

            st = conn.createStatement();
            rs = st.executeQuery("select id, name FROM user");
            comboItems cmi;
            
            while(rs.next()){
                cmi = new comboItems(rs.getInt(1), rs.getString(2));
                map.put(cmi.getValue(), cmi.getId());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Apps.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
    }
}
