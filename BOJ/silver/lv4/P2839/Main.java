package BOJ.silver.lv4.P2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    final static int MAX_WEIGHT = 5000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(find(n));
    }

    public static int find(int n) {
        final int SUGAR_3 = 3;
        final int SUGAR_5 = 5;

        int min = MAX_WEIGHT / SUGAR_3;

        for (int i = 0; i < MAX_WEIGHT / SUGAR_3 + 1; i++) {
            for (int j = 0; j < MAX_WEIGHT / SUGAR_5 + 1; j++) {
                if (i*SUGAR_3 + j*SUGAR_5 == n) {
                    min = Math.min(min, i+j);
                }
            }
        }

        if (min != MAX_WEIGHT / SUGAR_3) return min;
        return -1;
    }
}
