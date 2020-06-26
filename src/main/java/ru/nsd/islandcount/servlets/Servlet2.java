package ru.nsd.islandcount.servlets;

import ru.nsd.islandcount.Data;
import ru.nsd.islandcount.objects.Graph;
import ru.nsd.islandcount.objects.Matrix;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        response.addCookie(new Cookie("aaaa", "bbbb"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet3");
        requestDispatcher.forward(request, response);
        pw.println("SSSSSSSSSSSSS");


    }
}