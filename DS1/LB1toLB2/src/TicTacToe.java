import java.util.*;
import java.io.*;

class TicTacToe{
    static boolean isWinner(char[][] board, char player){
        for (int i = 0; i<3; i++){
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || (board[0][i] == player && board[1][i] == player && board[2][i] == player))

                return true;
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || (board[0][2] == player && board[1][1] == player && board[2][0] == player))

            return true;
        return false;
    }

    static boolean isCat(char[][] b){
        if (count(b) == 9) return true;
        return false;

    }
    static int count(char[][] b){
        int c = 0;
        for (char[] i : b)
            for (char i2: i)
                if (i2 == 'O' || i2 == 'X')
                    c++;
        return c;
    }
    static void toString(char[][] board){
        String st = " " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " \n-----------\n" + " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " \n-----------\n" + " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " ";
        System.out.println(st+"\n");
    }

    static String toStringSave(char[][] board){
        return "" + board[0][0] + board[0][1] + board[0][2] + "," + board[1][0] + board[1][1] + board[1][2] + "," + board[2][0] + board[2][1] + board[2][2];
    }

    static void saveGame(char[][] board) throws IOException{
        FileWriter fw = new FileWriter("save.txt");
        fw.write(toStringSave(board));
        fw.close();
    }

    static boolean checkX(int x, char[][] board) throws IOException{
        if (x == 3){
            saveGame(board);
            System.out.println("Your game has stopped");
            return true;
        }
        return false;
    }

    static char[][] loadGame() throws IOException{
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        Scanner reader = new Scanner(new File("save.txt"));
        String[] line = reader.nextLine().split(",");
        for (int r = 0; r<3; r++){
            for (int c = 0; c<3; c++){
                board[r][c] = line[r].charAt(c);
            }
        }
        reader.close();
        return board;
    }



    public static void main(String args[]) throws IOException{
        char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int p = 1;
        int c = 0;
        int r = 0;
        int load = 0;
        boolean loading = false;
        File file = new File("save.txt");

        if (file.exists()) {
            board = loadGame();
        }

        toString(board);

            while (!isCat(board)) {
                if (p > 0) {
                    System.out.println("Entering column 3 for the row or column will save your game");
                    System.out.println("X enter the column for your move (0-2):");
                    c = s.nextInt();

                    if (checkX(c, board)) break;
                    System.out.println("X enter the row for your move(0-2):");
                    r = s.nextInt();
                    if (checkX(r, board)) break;

                    try {
                        if (board[r][c] == ' ') {
                            board[r][c] = 'X';
                            p *= -1;
                            System.out.print("\n");
                            toString(board);
                            if (isWinner(board, 'X')) {
                                if (file.delete())
                                    System.out.println("Your save file has been deleted.");
                                System.out.print("X WINS!");
                                break;
                            }
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.println("\nInvalid move, enter a new move.\n");
                    }
                } else {
                    System.out.println("O is thinking...");
                    c = rand.nextInt(3);
                    r = rand.nextInt(3);


                    try {
                        if (board[r][c] == ' ') {
                            board[r][c] = 'O';
                            p *= -1;
                            System.out.print("\n");
                            toString(board);
                            if (isWinner(board, 'O')) {
                                if (file.delete())
                                    System.out.println("Your save file has been deleted.");
                                System.out.print("O WINS!");
                                break;
                            }
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {

                    }

                }
            }
        }
    }
