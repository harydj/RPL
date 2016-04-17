/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.Format;
import java.util.Date;

/**
 *
 * @author ThareeqAD
 */
public class Penerimaan {
    private int kd_penerimaan;
    private String nama_penerimaan;
    private Date tgl_penerimaan = new Date("yyyy-MM-dd HH:mm:ss.S");
    private double total_biaya_penerimaan;
   

    public Penerimaan() {
    }

    public Penerimaan(int kd_penerimaan, String nama_penerimaan, double total_biaya_penerimaan) {
        this.kd_penerimaan = kd_penerimaan;
        this.nama_penerimaan = nama_penerimaan;
        this.total_biaya_penerimaan = total_biaya_penerimaan;
    }

    Penerimaan(int aInt, String string, double aDouble, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    public int getKd_penerimaan() {
        return kd_penerimaan;
    }

    public void setKd_penerimaan(int kd_penerimaan) {
        this.kd_penerimaan = kd_penerimaan;
    }

    public String getNama_penerimaan() {
        return nama_penerimaan;
    }

    public void setNama_penerimaan(String nama_penerimaan) {
        this.nama_penerimaan = nama_penerimaan;
    }

    public double getTotal_biaya_penerimaan() {
        return total_biaya_penerimaan;
    }

    public void setTotal_biaya_penerimaan(double total_biaya_penerimaan) {
        this.total_biaya_penerimaan = total_biaya_penerimaan;
    }

    public Date getTgl_transaksi() {
        return tgl_penerimaan;
    }

    public void setTgl_transaksi(Date tgl_penerimaan) {
        this.tgl_penerimaan = tgl_penerimaan;
    }

    public void setTgl_transaksi(Format tgl_penerimaan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
