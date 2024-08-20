public class CommonNeighbors {

    public static void commonNeighbors(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (!((i > 0) && (list[i] == list[i - 1])) && !((i < list.length - 1) && (list[i] == list[i + 1]))) {
                list[i] = 0;
            }
        }
    }
}
