/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.Dao;

/**
 *
 * @author iqbal
 */
import com.gmail.iqbalsalman.Controller.Nasabah;
import com.gmail.iqbalsalman.Model.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iqbal
 */
public class NasabahDao {
    private Connection connection;

    public NasabahDao() {
        
        KoneksiDB ad = new KoneksiDB(); 
        
        this.connection = ad.koneksi();
    }
    
        public Nasabah Save(Nasabah dep) throws SQLException {

        String sqlInsert = ""
                + "insert into nasabah (id,namanasabah,alamat)"
                + " values(nextval('nasabah_id_seq'), ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
        //preparedStatement.setInt(1, dep.getId());
        preparedStatement.setString(1, dep.getNamaNasabah());
        preparedStatement.setString(2, dep.getAlamat());
        preparedStatement.executeUpdate();
            connection.commit();

        ResultSet primaryKey = preparedStatement.getGeneratedKeys();
        if (primaryKey.next()) {
            dep.setId(primaryKey.getInt(1));
        }
        preparedStatement.close();
        primaryKey.close();
        return dep;
    }
        public List<Nasabah> findAll() throws SQLException {
        List<Nasabah> values = new ArrayList();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from nasabah");

        while (resultSet.next()) {
            Nasabah dep = new Nasabah(
                    resultSet.getInt("id"),
                    resultSet.getString("namanasabah"),
                    resultSet.getString("alamat")     
            );
            values.add(dep);
        }
        // tutup koneksi untuk ambil data
        resultSet.close();
        statement.close();

        return values;

    }
    
    
  
    
}
