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
import java.rmi.ServerException;

public class FileServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        Matrix matrix = new Matrix();
        System.out.println(matrix.toString());
        Graph graph = new Graph(matrix);
        int result = graph.quantityOfIslands(graph)- matrix.quantityOfDots();
        Data data = new Data(matrix.getN(), matrix.getM(), matrix.toString(), result);
        pw.print(data.getJsonString());
        getServletConfig();
    }
}