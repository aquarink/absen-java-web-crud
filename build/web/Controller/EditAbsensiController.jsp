<%-- 
    Document   : EditAbsensiController
    Created on : Dec 6, 2016, 1:47:13 PM
    Author     : Peb Dev
--%>
<%@page import="model.AbsensiModel"%>
<%@page import="dao.AbsensiDataAccess"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Absensi Controller</title>
    </head>
    <body>
        <%
            int id_karyawan;
            id_karyawan = Integer.parseInt(request.getParameter("idKaryawan"));
            
            Date dateTmp = new Date(System.currentTimeMillis());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String date = dateFormat.format(dateTmp.getTime());
            
            
            String tgl_absen_masuk = request.getParameter("tglAbsenMasuk");
            String tgl_absen_keluar = request.getParameter("tglAbsenMasuk");
            String absen_masuk = request.getParameter("absenMasuk");
            String absen_keluar = request.getParameter("absenKeluar");
            String bulan = request.getParameter("bulan");
            
            AbsensiModel absensi = new AbsensiModel(0, id_karyawan, tgl_absen_masuk, tgl_absen_keluar, absen_masuk, absen_keluar, bulan);
            AbsensiDataAccess dataAccess = new AbsensiDataAccess();
            dataAccess.addNew(absensi);
            
            response.sendRedirect("/WebApplication3/AllAbsensiServlet");
        %>
    </body>
</html>
