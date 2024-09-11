import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Grid {
    public static int[] rowSums(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String[] dimensions = reader.readLine().split("X");
        int cols = Integer.parseInt(dimensions[0]);
        int rows = Integer.parseInt(dimensions[1]);

        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        reader.close();

        int[] rowSums = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += grid[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }

    public static int[] columnSums(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String[] dimensions = reader.readLine().split("X");
        int cols = Integer.parseInt(dimensions[0]);
        int rows = Integer.parseInt(dimensions[1]);

        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        reader.close();

        int[] columnSums = new int[cols];
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += grid[i][j];
            }
            columnSums[j] = sum;
        }
        return columnSums;
    }
}
