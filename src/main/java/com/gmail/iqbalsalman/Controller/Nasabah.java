/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.Controller;

import com.oracle.jrockit.jfr.ValueDefinition;

/**
 *
 * @author iqbal
 */
public class Nasabah {
    
    
    private Integer id;
    private String namaNasabah;
    private String alamat;

    public Nasabah() {
        
    }
    public Nasabah(Integer id, String namaNasabah, String alamat) {
        this.id = id;
        this.namaNasabah = namaNasabah;
        this.alamat = alamat;
    }

    Nasabah(String nama,  String alamat) {
        this.namaNasabah = nama;
        this.alamat = alamat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
     @Override
    public String toString() {

        return String.format("{ Id : %s, namaNasabah : %s, Alamat  : %s }",
                id,  namaNasabah, alamat);
    }
    
}
