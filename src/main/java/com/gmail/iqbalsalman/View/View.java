/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.View;

import com.gmail.iqbalsalman.Controller.Nasabah;
import com.gmail.iqbalsalman.Dao.NasabahDao;
import com.gmail.iqbalsalman.Model.KoneksiDB;
import static com.gmail.iqbalsalman.Model.KoneksiDB.koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author iqbal
 */
public class View {
    
    public static void main(String[] args) throws SQLException{
        KoneksiDB bs = new KoneksiDB();
        Connection connection = null;
        NasabahDao dao = new NasabahDao();
         List<Nasabah> daftarNasabah = dao.findAll();
            for (Nasabah d : daftarNasabah) {
                System.out.println(d.toString());
            }
        //mvn clean compile exec:java -Dexec.mainClass=com.gmail.iqbalsalman.aplikasi_utama 
        bs.koneksi();
         
        try{
            Nasabah nasabahbaru = dao.Save(new Nasabah(null, "Choerul", "Buah Batu"));
            System.out.println(nasabahbaru.toString());
        }catch (SQLException ex) {
                ex.printStackTrace();
            }
    }

    
}
