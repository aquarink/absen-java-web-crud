/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Peb Dev
 */
public class AbsensiModel {

    private int idAbsen;
    private int idKaryawan;
    private String tglAbsMasuk;
    private String tglAbsKeluar;
    private String absMasuk;
    private String absKeluar;
    private String bulan;

    public AbsensiModel(int idAbsen, int idKaryawan, String tglAbsMasuk, String tglAbsKeluar, String absMasuk, String absKeluar, String bulan) {
        this.idAbsen = idAbsen;
        this.idKaryawan = idKaryawan;
        this.tglAbsMasuk = tglAbsMasuk;
        this.tglAbsKeluar = tglAbsKeluar;
        this.absMasuk = absMasuk;
        this.absKeluar = absKeluar;
        this.bulan = bulan;
    }

    public int getIdAbsen() {
        return idAbsen;
    }

    public void setIdAbsen(int idAbsen) {
        this.idAbsen = idAbsen;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getTglAbsMasuk() {
        return tglAbsMasuk;
    }

    public void setTglAbsMasuk(String tglAbsMasuk) {
        this.tglAbsMasuk = tglAbsMasuk;
    }

    public String getTglAbsKeluar() {
        return tglAbsKeluar;
    }

    public void setTglAbsKeluar(String tglAbsKeluar) {
        this.tglAbsKeluar = tglAbsKeluar;
    }

    public String getAbsMasuk() {
        return absMasuk;
    }

    public void setAbsMasuk(String absMasuk) {
        this.absMasuk = absMasuk;
    }

    public String getAbsKeluar() {
        return absKeluar;
    }

    public void setAbsKeluar(String absKeluar) {
        this.absKeluar = absKeluar;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }
}
