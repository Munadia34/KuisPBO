
package inputnilai;

import java.awt.event.ActionEvent;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tampilan extends JFrame {
    JLabel lnim, lnama, lmatkul1, lnilai1, lmatkul2, lnilai2;
    JTextField tnim, tnama, tmatkul1, tnilai1, tmatkul2, tnilai2;
    JButton convert;
    int a1;
    float a4, a6, mean;
    String a2, a3, a5;
    
    public void FormInput(){
        setTitle("Hitung Nilai");
        //dibawah ini untuk menampilkan form input data nilai
        lnim = new JLabel("NIM");
        tnim = new JTextField("");
        lnama = new JLabel("Nama");
        tnama = new JTextField("");
        lmatkul1 = new JLabel("Mata Kuliah 1");
        tmatkul1 = new JTextField("");
        lnilai1 = new JLabel("Nilai 1");
        tnilai1 = new JTextField("");
        lmatkul2 = new JLabel("Mata Kuliah 2");
        tmatkul2 = new JTextField("");
        lnilai2 = new JLabel("Nilai 2");
        tnilai2 = new JTextField("");
        convert = new JButton("Convert");
        
        setLayout(null);
        add (lnim);
        add (tnim);
        add (lnama);
        add (tnama);
        add (lmatkul1);
        add (tmatkul1);
        add (lnilai1);
        add (tnilai1);
        add (lmatkul2);
        add (tmatkul2);
        add (lnilai2);
        add (tnilai2);
        add (convert);
        
        
        lnim.setBounds(70, 40, 80, 25);
        tnim.setBounds(200, 40, 200, 25);
        lnama.setBounds(70, 80, 80, 25);
        tnama.setBounds(200, 80, 200, 25);
        lmatkul1.setBounds(70, 120, 80, 25);
        tmatkul1.setBounds(200, 120, 200, 25);
        lnilai1.setBounds(70, 160, 80, 25);
        tnilai1.setBounds(200, 160, 200, 25);
        lmatkul2.setBounds(70, 200, 80, 25);
        tmatkul2.setBounds(200, 200, 200, 25);
        lnilai2.setBounds(70, 240, 80, 25);
        tnilai2.setBounds(200, 240, 200, 25);
        convert.setBounds(150, 300, 175, 23);
        
        setSize(500,410);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        convert.addActionListener((ActionEvent e) -> { //untuk mengambil nilai yang kita masukkan
            try {
                a1 =  Integer.parseInt(tnim.getText()); //untuk mengambil nilai yang berupa integer
                a2 = tnama.getText(); //untuk mengambil nilai yg berupa text/string
                a3 = tmatkul1.getText();
                a4 = Float.parseFloat(tnilai1.getText()); //untuk mengambil nilai yang berupa float
                a5 = tmatkul2.getText();
                a6 = Float.parseFloat(tnilai2.getText());
                JOptionPane.showMessageDialog(rootPane, "Data Tersimpan"); //message yang akan keluar apabila data yang dimasukkan benar untuk diambil
                
                Nilai nilai = new Nilai();
                nilai.getratarata(a4,a6);//untuk mengambil nilai yang telah dikerjakan di class Nilai(nilai rata2 dan convert nilia) 
                
                OutputData output = new OutputData();//untuk menampilkan hasil inputan data
                output.data(a1, a2, a3, a5);
                
                System.out.println("Rata-rata     : " + nilai.getratarata(a4,a6));
                System.out.println("Nilai Huruf   : " + nilai.getconvertNilai(nilai.getratarata(a4, a6)));
                
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane,"Data Salah!");
            }
        });
}
}
