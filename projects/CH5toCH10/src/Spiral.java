public class Spiral {

    public static char[][] javaSpiral(int cols, int rows) {
        char[][] s = new char[rows][cols];
        String w = "java";
        int wl = w.length();

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int r = 0, c = 0, d = 0, i = 0;

        for (int j = 0; j < rows * cols; j++) {
            s[r][c] = w.charAt(i);
            i = (i + 1) % wl;

            int nr = r + dx[d];
            int nc = c + dy[d];

            if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || s[nr][nc] != '\0') {
                d = (d + 1) % 4;
                nr = r + dx[d];
                nc = c + dy[d];
            }

            r = nr;
            c = nc;
        }

        return s;
    }
}
