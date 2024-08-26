import java.io.File;
import java.util.Scanner;

public class LineAdder {
    public static int[] sumLines(String filename){
        int[] sum;

        File file = new File(filename);
        Scanner s = new Scanner(file);
        for (int i = 0; s.hasNextLine(); i++) {
            String line = s.nextLine();
            String[] numbers = line.split(" ");
            for (String number : numbers) {
                sum[i] += Integer.parseInt(number);


            }
        }
    }
}
