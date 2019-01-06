/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teuku Ngentod hehe
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    public Connection conn;
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Database ditemukan");
        } catch (Exception e) {
            System.out.println("Error Driver Tidak ditemukan " + e);
        }
        String urlDatabase = "jdbc:mysql://localhost/nama_database";
        String user = "root";
        String password = "";
        
        try {
            conn = DriverManager.getConnection(urlDatabase, user, password);
            System.out.println("Berhasil Terhubung ke Database");
        } catch (Exception e) {
            System.out.println("Gagal Terhubung ke Database " + e);
        }
    }
}
