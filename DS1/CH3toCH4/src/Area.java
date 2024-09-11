import java.io.*;
import java.util.*;
public class Area {
    public static int largestAreaSum(String fileName) throws IOException {
       BufferedReader br = new BufferedReader(new FileReader(fileName));


        String[] dimensions = br.readLine().split("X");

        int cols = Integer.parseInt(dimensions[0]);
        int rows = Integer.parseInt(dimensions[1]);

        int[][] grid = new int[rows][cols];

        for (int r=0; r<rows; r++){
            String[] line =  br.readLine().split(" ");
            for (int c=0; c<cols; c++){
                grid[r][c] = Integer.parseInt(line[c]);

            }
        }

        int sum = 0;
        int maxSum = 0;

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                sum = grid[r][c];
                if (r-1 >= 0){
                    sum += grid[r-1][c];
                }
                if (r+1 < rows){
                    sum += grid[r+1][c];
                }
                if (c-1 >= 0){
                    sum += grid[r][c-1];
                }
                if (c+1 < cols){
                    sum += grid[r][c+1];
                }
                if (sum > maxSum){
                    maxSum = sum;
                }

            }
        }
        return maxSum;




    }
}
