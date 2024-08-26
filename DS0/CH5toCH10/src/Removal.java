import java.util.ArrayList;

public class Removal {
    public static void removeAllInRange(ArrayList<Integer> ls, int low, int high) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) >= low && ls.get(i) <= high) {
                ls.remove(i);
                i--;
            }
        }
    }
}
