/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.iqbalsalman.Controller;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author iqbal
 */
public class TransaksiTabungan {

    private Integer id;
    private Integer jenisTransksi;
    private Date tanggalTransaksi;
    private BigDecimal kredit;
    private BigDecimal debet;
    private BigDecimal saldo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJenisTransksi() {
        return jenisTransksi;
    }

    public void setJenisTransksi(Integer jenisTransksi) {
        this.jenisTransksi = jenisTransksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public BigDecimal getKredit() {
        return kredit;
    }

    public void setKredit(BigDecimal kredit) {
        this.kredit = kredit;
    }

    public BigDecimal getDebet() {
        return debet;
    }

    public void setDebet(BigDecimal debet) {
        this.debet = debet;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    

}
