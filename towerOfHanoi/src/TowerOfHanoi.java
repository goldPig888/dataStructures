import java.util.Scanner;
public class TowerOfHanoi {
    StackInterface<Integer> stack1 = new MyStack<Integer>();
    StackInterface<Integer> stack2 = new MyStack<Integer>();
    StackInterface<Integer> stack3 = new MyStack<Integer>();

    public static void reset(MyStack<Integer> stack, int n) {
        for (int i = n; i > 0; i--) {
            stack.push(0);
        }
    }

    public static void unReset(MyStack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) == 0) {
                stack.pop();
            }
        }
    }

    public void disks(int n) {
        for (int i = n; i > 0; i--) {
            stack1.push(i);
        }
    }

    public String convert(StackInterface<Integer> stack, int r) {

            String disk = "";

            if (stack.get(r) == 0){
                disk = "-";
            } else {
                disk = "X".repeat(stack.get(r)*2+1);
            }
            String s = " ".repeat( (8 - disk.length()) / 2);

            return s + disk + s;


    }

    public void showPoles(int height) {
        String s = "";
        reset((MyStack<Integer>) stack1, height - stack1.size());
        reset((MyStack<Integer>) stack2, height - stack2.size());
        reset((MyStack<Integer>) stack3, height - stack3.size());



        for (int r = stack1.size() - 1; r >= 0; r--) {

            s = " " + convert(stack1, r) + convert(stack2, r) + convert(stack3, r);
            System.out.println(s);
        }
        System.out.println("-".repeat(s.length()) + "\n");

        unReset((MyStack<Integer>) stack1);
        unReset((MyStack<Integer>) stack2);
        unReset((MyStack<Integer>) stack3);
    }

    public boolean move(int to, int from) {
        try {
            if (to == 1 && from == 2) {
                if (stack1.isEmpty() || stack1.peek() > stack2.peek()) {
                    stack1.push(stack2.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            } else if (to == 1 && from == 3) {
                if (stack1.isEmpty() || stack1.peek() > stack3.peek()) {
                    stack1.push(stack3.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            } else if (to == 2 && from == 1) {
                if (stack2.isEmpty() || stack2.peek() > stack1.peek()) {
                    stack2.push(stack1.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            } else if (to == 2 && from == 3) {
                if (stack2.isEmpty() || stack2.peek() > stack3.peek()) {
                    stack2.push(stack3.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            } else if (to == 3 && from == 1) {
                if (stack3.isEmpty() || stack3.peek() > stack1.peek()) {
                    stack3.push(stack1.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            } else if (to == 3 && from == 2) {
                if (stack3.isEmpty() || stack3.peek() > stack2.peek()) {
                    stack3.push(stack2.pop());
                    return true;
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            System.out.println("\tInvalid Move.");
        }
        return false;
    }

    public boolean checkWin(int diskCount) {
        if (stack3.size() == diskCount) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        Scanner s = new Scanner(System.in);
        int from = -1;
        int to = -1;
        int height = 0;
        int diskCount = 0;
        int moves = 0;

        boolean playing = true;
        boolean input = true;

        while (true) {
            System.out.println("Enter the number of disks you would like to play with (3-6):");
            diskCount = s.nextInt();
            height = diskCount + 2;
            if (diskCount < 3 || diskCount > 6) {
                System.out.println("That value is out of range, please try again.");
                continue;
            }
            toh.disks(diskCount);
            toh.showPoles(height);
            break;
        }

        while (playing) {
            input = true;

            while (input) {

                System.out.println("Enter your from pole (1-3):");
                from = s.nextInt();
                if (from < 1 || from > 3) {
                    System.out.println("\tInvalid Move.");
                    continue;
                }

                System.out.println("Enter your to pole (1-3):");
                to = s.nextInt();
                if (to < 1 || to > 3) {
                    System.out.println("\tInvalid Move.");
                    continue;
                }

                if (toh.move(to, from)) {
                    moves++;
                    toh.showPoles(height);
                    playing = toh.checkWin(diskCount);
                    input = false;

                }
            }
        }
        System.out.println("Congratulations you solved " + diskCount + " disks in " + moves + " moves. A perfect solutions is 7 moves.");
    }
}


