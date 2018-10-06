/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Teguh Kristianto
 */
public class DbConn {
    private Connection dbConn = null;
    private String DB = "jdbc:mysql://localhost/test";
    private String user = "root";
    private String password = "";

    public Connection koneksiDB(){
        try {
            DriverManager.registerDriver(new Driver());
            dbConn = DriverManager.getConnection(DB, user, password);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println("koneksi gagal");
        }
        return dbConn;
    }
    
}
