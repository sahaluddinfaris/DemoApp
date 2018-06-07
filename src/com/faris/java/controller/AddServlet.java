package com.faris.java.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;

        PrintWriter out = res.getWriter();
        out.println("Hasil penambahan = "+k);

//        Cookie cookie = new Cookie("k", k +"");
//        res.addCookie(cookie);

//        HttpSession session = req.getSession();
//        session.setAttribute("k",k);

//        res.sendRedirect("sq");

        //        k=k*k;

//        req.setAttribute("k", k);

//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);

    }


}
