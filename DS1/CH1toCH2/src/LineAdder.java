import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LineAdder {

    public static int[] sumLines(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
            return br.lines().mapToInt(line -> Arrays.stream(line.split(","))
                            .mapToInt(number -> Integer.parseInt(number.trim()))
                            .sum()).toArray();

    }
}