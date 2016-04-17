/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ThareeqAD
 */
public class Pembelian {
    private int kd_pembelian;
    private String nama_pembelian;
    private double total_biaya_pembelian;
    private Date tgl_pembelian = new Date("yyyy-MM-dd HH:mm:ss.S");

    public Pembelian() {
    }

    public Pembelian(int kd_pembelian, String nama_pembelian, double total_biaya_pembelian) {
        this.kd_pembelian = kd_pembelian;
        this.nama_pembelian = nama_pembelian;
        this.total_biaya_pembelian = total_biaya_pembelian;
    }

    Pembelian(int aInt, String string, java.sql.Date date, double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getKd_pembelian() {
        return kd_pembelian;
    }

    public void setKd_pembelian(int kd_pembelian) {
        this.kd_pembelian = kd_pembelian;
    }

    public String getNama_pembelian() {
        return nama_pembelian;
    }

    public void setNama_pembelian(String nama_pembelian) {
        this.nama_pembelian = nama_pembelian;
    }

    public double getTotal_biaya_pembelian() {
        return total_biaya_pembelian;
    }

    public void setTotal_biaya_pembelian(double total_biaya_pembelian) {
        this.total_biaya_pembelian = total_biaya_pembelian;
    }

    public Date getTgl_pembelian() {
        return tgl_pembelian;
    }

    public void setTgl_pembelian(Date tgl_pembelian) {
        this.tgl_pembelian = tgl_pembelian;
    }
    
    
    
    
}
