/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database.Database;
import View.FormPenerimaan;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import Model.Aplication;
import Model.Penerimaan;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import View.Formjurnal;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
/**
 *
 * @author ThareeqAD
 */
public class ControllerPenerimaan implements ActionListener, KeyListener{
    private FormPenerimaan gui;
    private Formjurnal gu1;
    private Aplication aplication;
    Database db ;

    public ControllerPenerimaan() {
        aplication = new Aplication();
        gui = new FormPenerimaan();
        gui.addListener(this);
        gui.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //mengambil objek yang sedang di klik
        Object o = ae.getSource();
        
        if(o.equals(gui.getSave())){
            int kode = Integer.parseInt(gui.getRekening().getText());
            String namabarang = gui.getNamaBarang().getText();
            Format tgl_penerimaan = new SimpleDateFormat(gui.getTanggalPenerimaan().getText());
            double total_biaya = Double.parseDouble(gui.getJumlahPenerimaan().getText());
            
            Penerimaan penerimaan = new Penerimaan();
            penerimaan.setKd_penerimaan(kode);
            penerimaan.setNama_penerimaan(namabarang);
            penerimaan.setTgl_transaksi(tgl_penerimaan);
            penerimaan.setTotal_biaya_penerimaan(total_biaya);
            
            if (aplication.savepenerimaan(penerimaan)){
                gui.showmessage("data ke simpan");
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void viewactionperformed(java.awt.event.ActionEvent rvt){
        int i = 0;
        ResultSet rs = null;
        
        rs = db.getData("select * from penerimaan");{
            try {
                while (rs.next()){
                    gu1.setOutput(rs.getInt("kode ")i,0);
                    
                }   } catch (SQLException ex) {
                Logger.getLogger(ControllerPenerimaan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
       
        
    } 
    
    public static void main(String[] args) throws Exception{
        Statement statement = null;
        ResultSet rs = statement.executeQuery("select * from penerimaan");
        JTable table = new JTable(build)
    }
    
}
