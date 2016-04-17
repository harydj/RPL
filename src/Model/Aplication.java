/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThareeqAD
 */
public class Aplication {

    private Database connection;
    private String query;
    private String kd_penerimaan;

    public Aplication() {
        connection = new Database();
    }

    public boolean savepembelian(Pembelian pemb) {
        query = "insert into Pembelian(kd_pembelian, nama_pembelian,"
                + " total_biaya_pembelian, tgl_pembelian) values ('" + pemb.getKd_pembelian() + "',' "
                + "','" + pemb.getNama_pembelian() + "','" + pemb.getTgl_pembelian() + "','" + pemb.getTgl_pembelian() + "')";
        if (connection.manipulate(query)) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Pembelian> getData() throws SQLException {
        ArrayList<Pembelian> daftarpembelian = null;
        query = "select * from pembelian";
        ResultSet rs = connection.getData(query);
        while (rs.next()) {
            try {
                Pembelian pemb = new Pembelian(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDouble(4));
                daftarpembelian.add(pemb);
            } catch (SQLException ex) {
                Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return daftarpembelian;
    }

    public Pembelian getData(int kd_pembelian) {
        Pembelian pemb = new Pembelian();
        try {

            query = "select * from pembelian where kd_pembelian ='" + pemb.getKd_pembelian() + "";
            ResultSet rs = connection.getData(query);

            if (rs.first()) {
                pemb.setKd_pembelian(rs.getInt(1));
                pemb.setNama_pembelian(rs.getString(2));
                pemb.setTgl_pembelian(rs.getDate(3));
                pemb.setTotal_biaya_pembelian(rs.getDouble(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pemb;
    }
    
    public boolean savepenerimaan(Penerimaan penerimaan){
    query = "insert into Pembelian(kd_pembelian, nama_pembelian,"
                + " total_biaya_pembelian, tgl_pembelian) values ('" + penerimaan.getKd_penerimaan()+ "',' "
                + "','" + penerimaan.getNama_penerimaan()+ "','" + penerimaan.getTotal_biaya_penerimaan()+ "','" + penerimaan.getTgl_transaksi()+ "')";
      if (connection.manipulate(query)){
            return true;
        }
        else{
        return false;
        }
    }
    
        public ArrayList<Penerimaan> getdata() throws SQLException {
        ArrayList<Penerimaan> daftarpenerimaan = null;
        query = "select * from penerimaan";
        ResultSet rs = connection.getData(query);
        while (rs.next()) {
            try {
                Penerimaan penerimaan = new Penerimaan(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDate(4));
                daftarpenerimaan.add(penerimaan);
            } catch (SQLException ex) {
                Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return daftarpenerimaan;
    }
        
         public Penerimaan getdata(int kd_penerimaan) {
        Penerimaan penerimaan = new Penerimaan();
        try {

            query = "select * from pembelian where kd_penerimaan ='" + penerimaan.getKd_penerimaan()+ "";
            ResultSet rs = connection.getData(query);

            if (rs.first()) {
                penerimaan.setKd_penerimaan(rs.getInt(1));
                penerimaan.setNama_penerimaan(rs.getString(2));
                penerimaan.setTgl_transaksi(rs.getDate(3));
                penerimaan.setTotal_biaya_penerimaan(rs.getDouble(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Aplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return penerimaan;
    }
}
