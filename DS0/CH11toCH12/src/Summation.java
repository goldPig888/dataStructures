public class Summation {
    public static int summation(int a, int b) {
        if (a < b) return a + summation(a + 1, b);
        return a;

    }
}
