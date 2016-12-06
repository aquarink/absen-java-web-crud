/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.Koneksi;
import model.AbsensiModel;

/**
 *
 * @author Peb Dev
 */
public class AbsensiDataAccess {

    public void addNew(AbsensiModel absensi) {
        try {
            PreparedStatement ps = Koneksi.getPS("INSERT INTO absensi VALUES(?,?,?,?,?,?)");
            ps.setInt(1, absensi.getIdKaryawan());
            ps.setString(2, absensi.getTglAbsMasuk());
            ps.setString(3, absensi.getTglAbsKeluar());
            ps.setString(4, absensi.getAbsMasuk());
            ps.setString(5, absensi.getAbsKeluar());
            ps.setString(6, absensi.getBulan());
            ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<AbsensiModel> getAll() {
        List<AbsensiModel> listAbsensi = new LinkedList<>();
        try {
            ResultSet rs = Koneksi.getPS("SELECT * FROM absensi").executeQuery();

            while (rs.next()) {
                AbsensiModel absensi = new AbsensiModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                listAbsensi.add(absensi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAbsensi;
    }

    public static List<AbsensiModel> getById(int id) {
        List<AbsensiModel> listAbsensi = new LinkedList<>();

        String sqlQuery = "SELECT * FROM absensi WHERE id_absensi = " + id;

        try {
            ResultSet rs = Koneksi.getPS(sqlQuery).executeQuery();

            while (rs.next()) {
                AbsensiModel absensi = new AbsensiModel(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                listAbsensi.add(absensi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAbsensi;
    }

    public void editData(int idAbsen, int idKaryawan, String tglAbsMasuk, String tglAbsKeluar, String absMasuk, String absKeluar, String bulan) {

        String sqlQuery = "UPDATE absensi SET id_karyawan = ?, tgl_abs_masuk = ?, tgl_abs_pulang = ?, absen_masuk = ?, absen_keluar = ?, bulan = ? WHERE id_absensi = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = Koneksi.getPS(sqlQuery);

            preparedStatement.setInt(1, idKaryawan);
            preparedStatement.setString(2, tglAbsMasuk);
            preparedStatement.setString(3, tglAbsKeluar);
            preparedStatement.setString(4, absMasuk);
            preparedStatement.setString(5, absKeluar);
            preparedStatement.setString(6, bulan);
            //
            preparedStatement.setInt(7, idAbsen);
            //
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteData(int id) {
        
        String sqlQuery = "DELETE FROM absensi WHERE id_absensi = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = Koneksi.getPS(sqlQuery);

            preparedStatement.setInt(1, id);
            //
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AbsensiDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
