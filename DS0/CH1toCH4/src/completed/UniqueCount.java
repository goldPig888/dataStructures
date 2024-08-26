import java.util.*;

public class UniqueCount {
    public static int uniqueCount(int[] ls){
        Set<Integer> hi = new HashSet<>();
        for (int i: ls){
            hi.add(i);
        }
        return hi.size();

    }
}
