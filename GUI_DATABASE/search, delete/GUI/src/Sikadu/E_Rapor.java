/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sikadu;

import static Sikadu.connSikadu.con;
import static Sikadu.connSikadu.getKoneksi;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        

/**
 *
 * @author user
 */
public class E_Rapor extends javax.swing.JFrame {

   DefaultTableModel model;
   private String Nim;
   private String Nama;
   private String MataKuliah;
   private String KetKalimat;
   private String KetAlfabet;
   private int Absen;
   private int Tugas,Uas,Uts,NilaiAkhir;
   
   
   
    public E_Rapor() {
        initComponents();
        // Membuat Tabel Model
        model = (DefaultTableModel) jTable2.getModel();
        //Menambahkan Tabel Model ke Jtable
        jTable2.setModel(model);
        //Menampilkan data ke table dari database dengan method load data
        loadData();
    }

 //Read
    private void loadData(){
    //Menampilkan data kedalam table
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nim");
            model.addColumn("Nama");
            model.addColumn("Matakuliah");
            model.addColumn("Absen");
            model.addColumn("Tugas");
            model.addColumn("UAS");
            model.addColumn("UTS");
            model.addColumn("Nilai");
            model.addColumn("Keterangan");
            model.addColumn("Keterangan Nilai");
    try {
           String sql = "SELECT * FROM v_raport";
           java.sql.Connection conn = (Connection)connSikadu.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                Object [] obj = new Object[10];
                obj[0] = res.getString("nim");
                obj[1] = res.getString("nama");
                obj[2] = res.getString("matakuliah");
                obj[3] = res.getInt("absen");
                obj[4] = res.getInt("tugas");
                obj[5] = res.getInt("uas");
                obj[6] = res.getInt("uts");
                obj[7] = res.getInt("nilai");
                obj[8] = res.getString("ketkalimat");
                obj[9] = res.getString("ket");
                
                //Menampilkan satu baris data ke dalam table
                model.addRow(obj);
            }
            jTable2.setModel(model);
            //Menutup Hasil penelusuran dan koneksi          
            res.close();
            stm.close();
        } catch (Exception e) {
            System.out.println("Terjadi Error");
        }
    
    }
    private void kosong(){
    nama.setText(null);
    nim.setText(null);
    absen.setText(null);
    absen.setText(null);
    tugas.setText(null);
    uts.setText(null);
    uas.setText(null);
    hasil.setText(null);
    keterangan.setText(null);
    K_huruf.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        tugas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uas = new javax.swing.JTextField();
        uts = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        text_cari = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        panel1 = new Sikadu.panel();
        jLabel15 = new javax.swing.JLabel();
        panel2 = new Sikadu.panel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        matkul = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        K_huruf = new javax.swing.JTextField();
        keterangan = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(79, 155, 227));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("Nama ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 40, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setText("Absen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 40, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tugas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 40, 20));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 120, 30));
        getContentPane().add(absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 49, 30));
        getContentPane().add(tugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("UTS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 30, 20));
        getContentPane().add(uas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, 30));
        getContentPane().add(uts, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 30));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 76, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 280, -1, -1));

        jButton2.setText("Simpan");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, -1));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 64, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("PENILAIAN");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, -1));

        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jTable2.setBackground(new java.awt.Color(207, 226, 241));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nim", "Nama", "Mata Kuliah", "Absen", "Tugas", "UAS", "UTS", "Nilai", "Keterangan", "Keterangan Nilai"
            }
        ));
        jTable2.setOpaque(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 180));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Pencarian");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 70, 20));
        getContentPane().add(text_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, -1));

        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("UAS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 30, 20));

        panel2.setBackground(new java.awt.Color(204, 204, 255));
        panel2.setOpaque(false);
        panel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("Keterangan");
        panel2.add(jLabel9);
        jLabel9.setBounds(240, 150, 78, 13);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Nilai Akhir Mahasiswa");
        panel2.add(jLabel12);
        jLabel12.setBounds(135, 0, 170, 30);
        panel2.add(nim);
        nim.setBounds(280, 74, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("NIM");
        panel2.add(jLabel2);
        jLabel2.setBounds(240, 79, 30, 20);

        matkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBO", "Pemrograman Web", "Arsitektur", "Jaringan Komputer" }));
        panel2.add(matkul);
        matkul.setBounds(240, 126, 150, 26);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("Mata Kuliah");
        panel2.add(jLabel4);
        jLabel4.setBounds(240, 104, 80, 20);

        hasil.setEditable(false);
        panel2.add(hasil);
        hasil.setBounds(130, 164, 60, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Nilai Akhir");
        panel2.add(jLabel16);
        jLabel16.setBounds(65, 164, 61, 30);

        K_huruf.setEditable(false);
        panel2.add(K_huruf);
        K_huruf.setBounds(316, 164, 38, 30);

        keterangan.setEditable(false);
        panel2.add(keterangan);
        keterangan.setBounds(240, 164, 70, 30);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3);
        jButton3.setBounds(69, 212, 67, 29);

        proses.setText("Result");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        panel2.add(proses);
        proses.setBounds(0, 212, 75, 29);

        logout.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        panel2.add(logout);
        logout.setBounds(357, 10, 33, 13);

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sikadu/campus1.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        jButton6.setText("Daftar Mahasiswa Mengulang");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        // TODO add your handling code here:
        int ABSEN,TUGAS,UTS,UAS,NILAI;
        String result;
        ABSEN = Integer.parseInt(absen.getText());
        TUGAS = Integer.parseInt(tugas.getText());
        UTS = Integer.parseInt(uts.getText());
        UAS = Integer.parseInt(uas.getText());
        NILAI = (ABSEN/14*10)+(TUGAS*20/100)+(UTS*30/100)+(UAS*40/100);
        result = String.valueOf(NILAI);
        if(nama.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
        keterangan.setText("");
        K_huruf.setText("");
        hasil.setText("");
        }
        
        else if (nim.getText().equals("")){
         JOptionPane.showMessageDialog(null,"NIM Tidak Boleh Kosong");
        }
        
        else{
       hasil.setText(result);
        if (NILAI >= 81) {
            keterangan.setText("Lulus");
            K_huruf.setText("A");
        }
        else if((NILAI<81)&&(NILAI>=71)){
        keterangan.setText("Lulus");
        K_huruf.setText("B");
        
        }
        else if ((NILAI<71)&&(NILAI>=61)){
        keterangan.setText("Lulus");
        K_huruf.setText("C");
        }
        else if ((NILAI<61)&&(NILAI>=51)){
        keterangan.setText("Mengulang");
        K_huruf.setText("D");
        }
        else {
        keterangan.setText("Mengulang");
        K_huruf.setText("E");
        
        }
        }
        
        
//        output.setText("NIM : "+nim.getText()+"\n" + "Nama : "+nama.getText()+"\n"
//                +"Mata Kuliah : "+matkul.getSelectedItem()+'\n'
//                +"Absen : "+absen.getText()+'\n'
//                +"Tugas : "+tugas.getText()+'\n'
//                +"UTS : "+uts.getText()+'\n'
//                +"UAS : "+uas.getText()+'\n'
//                +"Nilai Angka : "+hasil.getText()+'\n'
//                +"Nilai Huruf : "+ K_huruf.getText()+'\n'
//                + "Keterangan : "+keterangan.getText()+'\n');
    }//GEN-LAST:event_prosesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nama.setText("");
        nim.setText("");
        keterangan.setText("");
        K_huruf.setText("");
        hasil.setText("");
        absen.setText("");
        uas.setText("");
        uts.setText("");
        tugas.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
      new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_logoutMouseClicked
//Insert Data
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Nim = nim.getText();
        Nama = nama.getText();
        MataKuliah = matkul.getSelectedItem().toString();
        Absen= Integer.parseInt(absen.getText());
        Tugas= Integer.parseInt(tugas.getText());
        Uas= Integer.parseInt(uas.getText());
        Uts= Integer.parseInt(uts.getText());
        NilaiAkhir= Integer.parseInt(hasil.getText());
        KetKalimat = keterangan.getText();
        KetAlfabet = K_huruf.getText();
        
        try {
            String sql = "INSERT INTO raport (nim,nama,matakuliah,absen,tugas,uas,uts,nilai,"
                    + "ketkalimat,ket) VALUES (?,?,?,?,?,?,?,?,?,?)";
            java.sql.Connection con = (Connection) connSikadu.getKoneksi();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            
            pst.setString(1, Nim);
            pst.setString(2, Nama);
            pst.setString(3, MataKuliah);
            pst.setInt(4, Absen);
            pst.setInt(5, Tugas);
            pst.setInt(6, Uas);
            pst.setInt(7, Uts);
            pst.setInt(8, NilaiAkhir);
            pst.setString(9, KetKalimat);
            pst.setString(10, KetAlfabet);
            
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        Object[] Data = {Nim,Nama,MataKuliah,Absen,Uas,Uts,Tugas,NilaiAkhir,KetKalimat,KetAlfabet};
        model.addRow(Data);
        loadData();
        kosong();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           try {
            String sql = "Select * from raport where nim like '%" +
                    text_cari.getText() + "%'" +
                    "or nama like '%" + text_cari.getText() + "%'";
            java.sql.Connection conn = (Connection)connSikadu.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
    
           while (res.next()) {
                Object [] obj = new Object[10];
                obj[0] = res.getString("nim");
                obj[1] = res.getString("nama");
                obj[2] = res.getString("matakuliah");
                obj[3] = res.getInt("absen");
                obj[4] = res.getInt("tugas");
                obj[5] = res.getInt("uas");
                obj[6] = res.getInt("uts");
                obj[7] = res.getInt("nilai");
                obj[8] = res.getString("ketkalimat");
                obj[9] = res.getString("ket");
                
                //Menampilkan satu baris data ke dalam table
                model.addRow(obj);
            }
            jTable2.setModel(model);
            //Menutup Hasil penelusuran dan koneksi
           
            res.close();
            stm.close();
            } catch (Exception e) {
            System.out.println("Terjadi Error");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//fungsi untuk tombol update
              try {
            String sql ="UPDATE raport SET nim = '"+nim.getText()+"', nama = '"+nama.getText()
                    +"', matakuliah = '"+matkul.getSelectedItem()
                    +"',absen= '"+Integer.parseInt(absen.getText())
                    +"',tugas= '"+Integer.parseInt(tugas.getText())
                    +"',uas= '"+Integer.parseInt(uas.getText())
                    +"',uts= '"+Integer.parseInt(uts.getText())
                    +"',nilai= '"+Integer.parseInt(hasil.getText())
                    +"',ketKalimat= '"+keterangan.getText()
                    +"',ket= '"+K_huruf.getText()
                    +"' WHERE nim = '"+nim.getText()+"'";
            java.sql.Connection con = (Connection) connSikadu.getKoneksi();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        loadData();
        kosong();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //menghapus dengan menunjukkan nim nya
  //menghapus
        try{
            getKoneksi();
            String sql = "delete from raport where Nim='"+nim.getText() +"'";
            java.sql.Connection con = (Connection) connSikadu.getKoneksi();
            java.sql.PreparedStatement pst=con.prepareStatement(sql);
            pst.execute();
            loadData();
            kosong();
            JOptionPane.showMessageDialog(null,"Data berhasil di hapus");
            }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Proses hapus gagal/koneksi gagal..");
            System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
         int kolom = jTable2.rowAtPoint(evt.getPoint());
         
        Nim =jTable2.getValueAt(kolom, 0).toString();
        nim.setText(Nim);
        Nama =jTable2.getValueAt(kolom, 1).toString();
        nama.setText(Nama);
        MataKuliah =jTable2.getValueAt(kolom, 2).toString();
        matkul.setSelectedItem(MataKuliah);
        Absen=Integer.parseInt(jTable2.getValueAt(kolom, 3).toString());
        absen.setText(Integer.toString(Absen));
        Tugas=Integer.parseInt(jTable2.getValueAt(kolom, 4).toString());
        tugas.setText(Integer.toString(Tugas));
        Uas=Integer.parseInt(jTable2.getValueAt(kolom, 5).toString());
        uas.setText(Integer.toString(Uas));
        Uts=Integer.parseInt(jTable2.getValueAt(kolom, 6).toString());
        uts.setText(Integer.toString(Uts));
        NilaiAkhir=Integer.parseInt(jTable2.getValueAt(kolom, 7).toString());
        hasil.setText(Integer.toString(NilaiAkhir));
        KetKalimat =jTable2.getValueAt(kolom, 8).toString();
        keterangan.setText(KetKalimat);
        KetAlfabet =jTable2.getValueAt(kolom, 9).toString();
        K_huruf.setText(KetAlfabet);

    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E_Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E_Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E_Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E_Rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E_Rapor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField K_huruf;
    private javax.swing.JTextField absen;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField keterangan;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> matkul;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private Sikadu.panel panel1;
    private Sikadu.panel panel2;
    private javax.swing.JButton proses;
    private javax.swing.JTextField text_cari;
    private javax.swing.JTextField tugas;
    private javax.swing.JTextField uas;
    private javax.swing.JTextField uts;
    // End of variables declaration//GEN-END:variables

    private void connSikadu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
