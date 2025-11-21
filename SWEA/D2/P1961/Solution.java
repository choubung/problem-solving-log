package SWEA.D2.P1961;

import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] arr = new int [n][n];

            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            StringBuilder sb  = new StringBuilder();
            sb.append("#").append(test_case).append("\n");

            for (int i = 0; i < n; i++) {
                // 1단
                for (int j = 0; j < n; j++) {
                    sb.append(arr[n - 1 - j][i]);
                }

                sb.append(" ");

                // 2단
                for (int j = 0; j < n; j++) {
                    sb.append(arr[n - 1 - i][n - 1 - j]);
                }

                sb.append(" ");

                // 3단
                for (int j = 0; j < n; j++) {
                    sb.append(arr[j][n - 1 - i]);
                }

                sb.append("\n");
            }

            System.out.print(sb.toString());
        }
    }
}