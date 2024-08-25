import java.util.ArrayList;

public class AbsoluteDifference {
    public static ArrayList<Integer> absoluteDifference(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            result.add(Math.abs(a.get(i) - b.get(i)));
        }
        return result;
    }
}
