import java.io.*;
import java.util.*;

public class AccessedOn {
    public static void main(String[] args) throws IOException {
        File file = new File("AccessedOn.txt");
        Date date = new Date();

        if (!file.exists()){
            FileWriter writer = new FileWriter(file, true);
            writer.write(date.toString());
            writer.close();
        }else{
            FileWriter writer = new FileWriter(file, true);
            writer.write("\n" + date);
            writer.close();
        }


    }
}

