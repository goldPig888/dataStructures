import java.io.*;

public class Names {
    public static int vowelNames(String fileName) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) == 'A' || line.charAt(0) == 'E' || line.charAt(0) == 'I' || line.charAt(0) == 'O' || line.charAt(0) == 'U') {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return count;
    }
}