/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.Model;

/**
 *
 * @author iqbal
 */
import com.gmail.iqbalsalman.Dao.NasabahDao;
import com.gmail.iqbalsalman.Controller.Nasabah;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author iqbal
 */
public class KoneksiDB {

    public static Connection koneksi() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername("hr");
        ds.setPassword("salman");
        ds.setUrl("jdbc:postgresql://localhost:5432/hr");
        ds.setDriverClassName("org.postgresql.Driver");
        Connection connection = null;
        try {
            // membuka koneksi ke database
//            System.out.println("berhasil koneksi ke database");
//            NasabahDao dao = new NasabahDao(connection);
            connection = ds.getConnection();
            connection.setAutoCommit(false);
//            dao.update(new Department(3004, "Sistem Analis", 1000, null));
//            dao.delete(3003);
            //            untuk ambil nilainya

        } catch (SQLException sqle) {
            sqle.printStackTrace();
//            try {
//                if (connection != null) {
//                    connection.close();
//
//                }
//            } 
//            catch (SQLException ex) {
//                ex.printStackTrace();
//            }
            //System.err.printf("tidak dapat koneksi ke databas!");
        }
        return connection;
    }

}
