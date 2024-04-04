//package com.cg.module4.currency;
//
//import java.io.*;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//@WebServlet("/convert")
//public class CurrencyConverterServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        double usd = Double.parseDouble(request.getParameter("usd"));
//        double rate = Double.parseDouble(request.getParameter("rate"));
//        double vnd = usd * rate;
//        request.setAttribute("usd", usd);
//        request.setAttribute("rate", rate);
//        request.setAttribute("vnd", vnd);
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//    }
//}