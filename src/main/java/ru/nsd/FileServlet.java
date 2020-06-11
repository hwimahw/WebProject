package ru.nsd;

import ru.nsd.Data;
import ru.nsd.objects.Graph;
import ru.nsd.objects.Matrix;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FileServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        Matrix matrix = new Matrix();
        System.out.println(matrix.toString());
        Graph graph = new Graph(matrix);
        int result = graph.quantityOfIslands(graph)- matrix.quantityOfDots();
        Data data = new Data(matrix.getN(), matrix.getM(), matrix.toString(), result);
        pw.print(data.getJsonString());
    }
}