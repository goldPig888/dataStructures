import java.util.Scanner;
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

    public String convert(StackInterface<Integer> stack, int r){
        String disk = "";

        if (stack.get(r) == 0){
            disk = "-";
        } else {
            disk = "X".repeat(stack.get(r)*2+1);
        }
        String s = " ".repeat(6-stack.get(r));

        return s + disk + s;
    }

    public void showPoles(){
        String s = "";
        for (int r=stack1.size()-1; r>=0; r--){
            s = convert(stack1, r) +  convert(stack2, r) + convert(stack3, r);
            System.out.println(s);

        }
        System.out.println("-".repeat(s.length()));
    }


    public static void main(String[] args) {
        ToH toh = new ToH();
        Scanner s = new Scanner(System.in);
        int from = -1;
        int to = -1;
        boolean playing = true;

        // this is first round
        while (true) {
            System.out.println("Enter the number of disks you would like to play with (3-6): ");
            int diskCount = s.nextInt();
            if (diskCount < 3 || diskCount > 6) {
                System.out.println("That value is out of range, please try again.");
                continue;
            }
            toh.disks(diskCount);

            reset((MyStack<Integer>) toh.stack1, 2);
            reset((MyStack<Integer>) toh.stack2, diskCount + 2);
            reset((MyStack<Integer>) toh.stack3, diskCount + 2);
            toh.showPoles();
            break;
        }

        while (playing) {

            System.out.println("Enter your from pole (1-3):");
            from = s.nextInt();
            while (from < 1 || from > 3) {
                System.out.println("\tInvalid Move.");
                System.out.println("Enter your from pole (1-3):");
                from = s.nextInt();
            }

            System.out.println("Enter your to pole (1-3):");
            to = s.nextInt();
            while (to < 1 || to > 3) {
                System.out.println("\tInvalid Move.");
                System.out.println("Enter your to pole (1-3):");
                to = s.nextInt();
            }

            break;

        }
    }
}


