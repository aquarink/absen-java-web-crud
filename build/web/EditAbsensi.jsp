<%-- 
    Document   : EditAbsensi
    Created on : Dec 6, 2016, 1:42:00 PM
    Author     : Peb Dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Data Absensi</title>
    </head>
    <body>
        <h1>Edit Data Absensi</h1>

        <c:forEach items="${AbsensiByIdAtt}" var="absenById">

            <form action="Controller/EditAbsensiController.jsp" method="POST">
                <table>
                    <tr>
                        <td>ID Karyawan</td>
                        <td>
                            <input name="idKaryawan" type="number" value="${absenById.idKaryawan}" placeholder="ID Karyawan">
                            <input name="idAbsen" type="hidden" value="${absenById.idAbsen}">
                        </td>
                    </tr>
                    <tr>
                        <td>Tanggal Absen Masuk</td>
                        <td><input name="tglAbsenMasuk" type="text" value="${absenById.tglAbsMasuk}" placeholder="Tanggal Absen Masuk"></td>
                    </tr>
                    <tr>
                        <td>Tanggal Absen Keluar</td>
                        <td><input name="tglAbsenKeluar" type="text" value="${absenById.tglAbsKeluar}" placeholder="Tanggal Absen Keluar"></td>
                    </tr>
                    <tr>
                        <td>Absen Masuk</td>
                        <td><input name="absenMasuk" type="text" value="${absenById.absMasuk}" placeholder="Absen Masuk"></td>
                    </tr>
                    <tr>
                        <td>Absen Keluar</td>
                        <td><input name="absenKeluar" type="text" value="${absenById.absKeluar}" placeholder="Absen Keluar"></td>
                    </tr>
                    <tr>
                        <td>Bulan</td>
                        <td><input name="bulan" type="number" value="${absenById.bulan}" placeholder="Bulan"></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input name="subData" type="submit" value="Update"></td>
                    </tr>
                </table>
            </form>

        </c:forEach>

    </body>
</html>
