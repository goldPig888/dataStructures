import java.util.*;
public class ToH {
    StackInterface<Integer> stack1 = new MyStack<Integer>();
    StackInterface<Integer> stack2 = new MyStack<Integer>();
    StackInterface<Integer> stack3 = new MyStack<Integer>();

    public static void reset(MyStack<Integer> stack, int n){
        for (int i = n; i>0; i--){
            stack.push(0);
        }
    }

    public void disks(int n) {
        for (int i = n; i > 0; i--) {
            stack1.push(i);
        }
    }

    public static void main(String[] args) {
        ToH toh = new ToH();

        System.out.println("Enter the number of disks you would like to play with (3-6): ");
        Scanner scanner = new Scanner(System.in);
        int diskCount = scanner.nextInt();
        toh.disks(diskCount);

        reset((MyStack<Integer>) toh.stack1, 5-diskCount);
        reset((MyStack<Integer>) toh.stack2, 5 );
        reset((MyStack<Integer>) toh.stack3, 5);

        System.out.println("stack 1 " + toh.stack1.toString());
        System.out.println("stack 2 " + toh.stack2.toString());
        System.out.println("stack 3 " + toh.stack3.toString());
    }

}
