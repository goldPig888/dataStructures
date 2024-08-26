import java.io.File;
import java.util.*;

public class Names {
    public static int vowelNames(String fileName){
        int count = 0;
            File file = new File(fileName);
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] names = line.split(" ");
                for (String name : names) {
                    if (name.toCharArray()[0].contains(".*[aeiouAEIOU].*")){
                        count++;
                    }
                }
            }
        return count;
    }
}
