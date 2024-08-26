public class Money {
    public static int[] fewest(int cents) {
        int[] hi = {1, 5, 10, 25, 100, 500, 1000, 2000, 5000, 10000};
        int[] result = new int[10];

        for (int i = 9; i >= 0; i--) {
            result[i] = cents / hi[i];
            cents = cents % hi[i];
        }

        return result;
    }

}
