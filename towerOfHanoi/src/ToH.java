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
        String s = "";
        String s2 = "";
        String disk = "";
        if (stack.get(r) == 0){
            disk = "-";
        }
        else if (stack.get(r) == 1){
            disk = "XXX";
        }
        else if (stack.get(r) == 2){
            disk = "XXXXX";
        }
        else if (stack.get(r) == 3){
            disk = "XXXXXXX";
        }
        else if (stack.get(r) == 4){
            disk = "XXXXXXXXX";
        }
        else if (stack.get(r) == 5){
            disk = "XXXXXXXXXXX";
        }
        else if (stack.get(r) == 6){
            disk = "XXXXXXXXXXXXX";
        }
        if (stack.equals(stack1)){
            for (int i = 0; i<6-stack.get(r); i++){
                s += " ";
            }
            return s + disk;
        }

        for (int i = 0; i<6-stack.get(r); i++){
            s += " ";
        }
        s2 = s + "      ";

        return s + disk + s2;
    }

    public void showPoles(){

        for (int r=stack1.size()-1; r>=0; r--){
            System.out.println(convert(stack1, r) + "" + convert(stack2, r) + "" + convert(stack3, r));
        }
    }


    public static void main(String[] args) {
        ToH toh = new ToH();

        System.out.println("Enter the number of disks you would like to play with (3-6): ");
        Scanner scanner = new Scanner(System.in);
        int diskCount = scanner.nextInt();
        toh.disks(diskCount);

        reset((MyStack<Integer>) toh.stack1, 2);
        reset((MyStack<Integer>) toh.stack2, diskCount+2);
        reset((MyStack<Integer>) toh.stack3, diskCount+2);

        System.out.println("stack 1 " + toh.stack1.toString());
        System.out.println("stack 2 " + toh.stack2.toString());
        System.out.println("stack 3 " + toh.stack3.toString());
        //System.out.println("-------------------------");

        toh.showPoles();
    }

}
