<%-- 
    Document   : TambahAbsensi
    Created on : Dec 6, 2016, 1:49:43 PM
    Author     : Peb Dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tambah Absensi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <h1>Tambah Absensi</h1>
        
        <form action="Controller/InputAbsensiController.jsp" method="POST">
            <table>
                <tr>
                    <td>ID Karyawan</td>
                    <td><input name="idKaryawan" type="number" placeholder="ID Karyawan"></td>
                </tr>
                <tr>
                    <td>Tanggal Absen Masuk</td>
                    <td><input name="tglAbsenMasuk" type="text" placeholder="Tanggal Absen Masuk"></td>
                </tr>
                <tr>
                    <td>Tanggal Absen Keluar</td>
                    <td><input name="tglAbsenKeluar" type="text" placeholder="Tanggal Absen Keluar"></td>
                </tr>
                <tr>
                    <td>Absen Masuk</td>
                    <td><input name="absenMasuk" type="text" placeholder="Absen Masuk"></td>
                </tr>
                <tr>
                    <td>Absen Keluar</td>
                    <td><input name="absenKeluar" type="text" placeholder="Absen Keluar"></td>
                </tr>
                <tr>
                    <td>Bulan</td>
                    <td><input name="bulan" type="number" placeholder="Bulan"></td>
                </tr>
                <tr>
                    <td colspan="2"><input name="subData" type="submit" value="Simpan"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
