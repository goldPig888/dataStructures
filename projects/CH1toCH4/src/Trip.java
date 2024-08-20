public class Trip {

    public static int fuelUsed(int[] site, int capacity) {
        int fuel = 0, pos = -1, total = 0;

        for (int trash : site) {
            total += trash;
        }

        while (total > 0) {
            int current = 0;

            for (int i = 0; i < site.length; i++) {
                if (site[i] > 0) {
                    int trash = Math.min(capacity - current, site[i]);
                    fuel += Math.abs(i - pos);
                    pos = i;

                    current += trash;
                    site[i] -= trash;
                    total -= trash;

                    if (current == capacity) {
                        break;
                    }
                }
            }

            fuel += pos + 1;
            pos = -1;
        }

        return fuel;
    }
}
