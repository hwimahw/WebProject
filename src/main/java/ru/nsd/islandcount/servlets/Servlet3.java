package ru.nsd.islandcount.servlets;

import ru.nsd.islandcount.Data;
import ru.nsd.islandcount.objects.Graph;
import ru.nsd.islandcount.objects.Matrix;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet3 extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session =  request.getSession();
        session.getId();
        PrintWriter pw = response.getWriter();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("aaaa")) {
                pw.println(cookie.getValue());
            }
        }
        pw.println("AAAAAAAAAAAAA");
    }
}