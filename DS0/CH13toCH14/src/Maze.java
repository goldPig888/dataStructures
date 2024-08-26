public class Maze {
    public static boolean isSolvable(char[][] maze, boolean[][] visited, int col, int row) {
        if (col < 0 || row < 0 || row >= maze.length || col >= maze[0].length) {
            return false;
        }
        if (maze[row][col] == 'E') {
            return true;
        }
        if (maze[row][col] == 'W' || visited[row][col]) {
            return false;
        }
        visited[row][col] = true;
        return isSolvable(maze, visited, col + 1, row) || isSolvable(maze, visited, col - 1, row) || isSolvable(maze, visited, col, row + 1) || isSolvable(maze, visited, col, row - 1);
    }

}
