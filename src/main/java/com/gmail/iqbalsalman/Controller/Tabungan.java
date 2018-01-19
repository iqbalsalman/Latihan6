/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iqbal
 */
public class Tabungan {
    
    private Integer id;
    private Nasabah nasabah;
    private String namaTabungan;
    private BigDecimal saldo;
    private List<Tabungan> listTabungan = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public String getNamaTabungan() {
        return namaTabungan;
    }

    public void setNamaTabungan(String namaTabungan) {
        this.namaTabungan = namaTabungan;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    
    
}

