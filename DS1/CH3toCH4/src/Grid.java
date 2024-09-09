import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Grid {
    public static int[] rowSums(String fileName){
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        return reader.lines().mapToInt(line -> {
            Scanner scanner = new Scanner(line);
            return scanner.tokens().mapToInt(Integer::parseInt).sum();
        }).toArray();


    }

    public static int[] columnSums(String fileName){
        ArrayList<int[]> yay = new ArrayList<>();

        BufferedReader r = new BufferedReader(new FileReader(fileName));
        for (String line : r.lines().parseInt().Array(String[]::new.) {
            yay.add(line);
        }



    }
}