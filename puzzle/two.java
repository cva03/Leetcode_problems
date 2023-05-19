package puzzle;

import java.util.Arrays;

public class two {

    public static int[] tsp(int[][] distances) {
        int n = distances.length;
        int[] tour = new int[n];
        for (int i = 0; i < n; i++) {
            tour[i] = i;
        }
        boolean improved = true;
        while (improved) {
            improved = false;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 2; j < n; j++) {
                    int dist1 = distances[tour[i]][tour[i + 1]] + distances[tour[j]][tour[(j + 1) % n]];
                    int dist2 = distances[tour[i]][tour[j]] + distances[tour[i + 1]][tour[(j + 1) % n]];
                    if (dist2 < dist1) {
                        reverse(tour, i + 1, j);
                        improved = true;
                    }
                }
            }
        }
        return tour;
    }

    private static void reverse(int[] tour, int i, int j) {
        while (i < j) {
            int temp = tour[i];
            tour[i] = tour[j];
            tour[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] distances = {
                {0, 2, 9, 10},
                {2, 0, 6, 4},
                {9, 6, 0, 8},
                {10, 4, 8, 0}
        };
        int[] tour = tsp(distances);
        System.out.println(Arrays.toString(tour)); // Output: [0, 1, 3, 2]
    }
}