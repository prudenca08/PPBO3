/*
 * PRUDENCA AHMAD DAFFA KURNIA
 * 123190005   
 */

package pbo3;

import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        
        GUI g = new GUI();
        g.setSize(600, 600);
        g.setLocationRelativeTo(null);
        g.setVisible(true);
    }

}


class GUI extends JFrame implements ActionListener {
    
    JLabel perintah = new JLabel("Masukkan Angka yang diinginkan : ");
    
    JLabel jPanjang = new JLabel("Input Panjang : ");
    final JTextField fPanjang = new JTextField(5);
    
    JLabel jLebar = new JLabel("Input Lebar : ");
    final JTextField fLebar = new JTextField(5);
    
    JLabel jTinggi = new JLabel("Input Tinggi : ");
    final JTextField fTinggi = new JTextField(5);
    
    JButton submit = new JButton("Hitung");
    
    JButton reset = new JButton("Reset");
    
    JLabel keliling = new JLabel();
    JLabel luas = new JLabel();
    JLabel luasPerm = new JLabel();
    JLabel volume = new JLabel();
    
    JButton hasil = new JButton("Hasil Hitung : ");
    
    
    
    public GUI(){
    setTitle("PBO 3 NIM 123190005 | Kalkulator Bidang Ruang");
    setLayout(null);
    
    add(perintah);
    add(jPanjang);
    add(fPanjang);
    add(jLebar);
    add(fLebar);
    add(jTinggi);
    add(fTinggi);
    add(submit);
    add(reset);
    add(hasil);
    
    submit.addActionListener(this);
    reset.addActionListener(this);
    
    perintah.setBounds(42,8,198,18);
    
    jPanjang.setBounds(42,28,118,18);
    fPanjang.setBounds(128, 28, 148, 18);
    
    jLebar.setBounds(42,58,118,18);
    fLebar.setBounds(128, 58, 148, 18);
    
    jTinggi.setBounds(42,88,118,18);
    fTinggi.setBounds(128, 88, 148, 18);
    
    submit.setBounds(60, 290, 90, 18);
    
    reset.setBounds(170, 290, 90, 18);
    
    hasil.setBounds(65,120,190,30);
    
    
    
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        }
    
    public void actionPerformed (ActionEvent a){
        if(a.getSource() == submit){
           try{
            double panjang,lebar,tinggi;
            panjang = Double.parseDouble(fPanjang.getText()); 
            lebar = Double.parseDouble(fLebar.getText());
            tinggi = Double.parseDouble(fTinggi.getText());
            Balok balok = new Balok(panjang,lebar,tinggi);
            balok.setPanjang(panjang);
            balok.setLebar(lebar);
            balok.setTinggi(tinggi);
            
            
            keliling.setText("Keliling Persegi Panjang : "+ Double.toString(balok.hitungKeliling()));
            add(keliling);
            keliling.setBounds(45,190,200,20);
            
            luas.setText("Luas Persegi Panjang : "+ Double.toString(balok.hitungLuas()));
            add(luas);
            luas.setBounds(45,210,250,20);
           
            luasPerm.setText("Luas Permukaan Balok  : "+ Double.toString(balok.hitungLuasPermukaan()));
            add(luasPerm);
            luasPerm.setBounds(45,230,250,20);
            
            volume.setText("Volume Balok  : "+ Double.toString(balok.hitungVolume()));
            add(volume);
            volume.setBounds(45,250,180,20);
           }
           
           
           catch(NumberFormatException n)
           {
             JOptionPane.showMessageDialog(null,"" + n.getMessage());
             }
           } 
        
        if(a.getSource() == reset){
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            keliling.setText(null);
            luas.setText(null);
            luasPerm.setText(null);
            volume.setText(null);
        }
    }
    
    
    }
    


