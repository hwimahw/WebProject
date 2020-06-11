package ru.nsd;

import ru.nsd.objects.Graph;
import ru.nsd.objects.Matrix;
import ru.nsd.objectsinitializers.GraphInitializer;
import ru.nsd.objectsinitializers.MatrixInitializer;

import javax.annotation.processing.FilerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Matrix matrix = new Matrix();
        System.out.println(matrix.toString());
        Graph graph = new Graph(matrix);
        System.out.println(graph.quantityOfIslands(graph)- matrix.quantityOfDots());
    }
}
