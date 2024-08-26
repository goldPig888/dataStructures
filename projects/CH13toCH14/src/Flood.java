import java.util.logging.XMLFormatter;

public class Flood {
    public static void floodFill(char[][] grid, int col, int row, char toReplace, char newValue) {
        if (col < 0 || row < 0 || col >= grid.length || row >= grid[0].length) {
            return;
        }
        if (grid[col][row] != toReplace) {
            return;
        }
        grid[col][row] = newValue;
        floodFill(grid, col + 1, row, toReplace, newValue);
        floodFill(grid, col - 1, row, toReplace, newValue);
        floodFill(grid, col, row + 1, toReplace, newValue);
        floodFill(grid, col, row - 1, toReplace, newValue);

    }
}

