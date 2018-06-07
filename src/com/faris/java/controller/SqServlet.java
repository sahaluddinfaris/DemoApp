package com.faris.java.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {

        int k = 0;

        Cookie cookie[] = req.getCookies();

        for(Cookie c: cookie)
        {
            if(c.getName().equals("k"))
                k = Integer.parseInt(c.getValue());
        }

//        HttpSession session = req.getSession();
//
//        int k = (int) session.getAttribute("k");

//        int k = (int) req.getAttribute("k");

        k = k*k;

        PrintWriter out = res.getWriter();
        out.println("Result = "+k);

        System.out.println("sq");

//        out.println("Hasil ="+k);

    }
}
