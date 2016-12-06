<%-- 
    Document   : AllAbsensi
    Created on : Dec 6, 2016, 11:35:50 AM
    Author     : Peb Dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Semua Data Absensi</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>ID Karyawan</th>
                <th>Tanggal Absen Masuk</th>
                <th>Tanggal Absen Keluar</th>
                <th>Absen Masuk</th>
                <th>Absen Keluar</th>
                <th>Bulan</th>
                <th>Action</th>
            </tr>
            
            <c:forEach items="${AllAbsensiDataAtt}" var="absen">
            
            <tr>
                <td>${absen.idKaryawan}</td>
                <td>${absen.tglAbsMasuk}</td>
                <td>${absen.tglAbsKeluar}</td>
                <td>${absen.absMasuk}</td>
                <td>${absen.absKeluar}</td>
                <td>${absen.bulan}</td>
                <td>
                   <a href="linkEditAbsen?id=${absen.idAbsen}">Edit</a> | 
                    <a href="linkHapusAbsen?id=${absen.idAbsen}">Delete</a>
                </td>
            </tr>
            
            </c:forEach>
            
        </table>
    </body>
</html>
