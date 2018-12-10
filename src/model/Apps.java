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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACT
 */
public class Apps {
    private int status;
    private String app_name, desc, owned_by, version;
    
//    public Apps(int status, String app_name, String desc, String owned_by, String version)
//    {
//        this.status = status;
//        this.app_name = app_name;
//        this.desc = desc;
//        this.owned_by = owned_by;
//        this.version = version;
//    }
    
    public static int Insert(HashMap<String, String> request){
        
        DbConn db = new DbConn();
        Connection conn = db.koneksiDB();
        Statement st;
        ResultSet rs;
        
        try {
            String sql = "insert into apps (app_name, description, owned_by, version,status) "
                    + "values ('"+request.get("app_name")+"', '"+request.get("desc")+"', '"+request.get("owned_by")+"', '"+request.get("version")+"', '"+request.get("status")+"')";
            System.out.println(sql);
            st = conn.createStatement();
            st.execute(sql);
            
        } catch (Exception e) {
        }
        return 1;
    }
    
    public int getStatus(){
        return status;
    }
    
    public String getAppName()
    {
        return app_name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getOwnedBy()
    {
        return owned_by;
    }
    
    public String getVersion()
    {
        return version;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    public void setAppName(String app_name)
    {
        this.app_name = app_name;
    }
    
    public void getDesc(String desc)
    {
        this.desc = desc;
    }
    
    public void setOwnedBy(String owned_by)
    {
        this.owned_by = owned_by;
    }
    
    public void setVersion(String version)
    {
        this.version = version;
    }
}
