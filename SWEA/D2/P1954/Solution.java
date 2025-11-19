package SWEA.D2.P1954;

import java.util.Scanner;

class Solution {
    // 우, 하, 좌, 상
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int dir;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            int dir = 0;
            int row = 0;
            int col = 0;

            for (int i = 1; i < n * n + 1; i++) {
                arr[row][col] = i;

                int nr = row + dr[dir];
                int nc = col + dc[dir];

                if (nr < 0 || nr > n-1 || nc < 0 || nc > n-1 || arr[nr][nc] != 0) {
                    dir = (dir+1) % 4;
                    nr = row + dr[dir];
                    nc = col + dc[dir];
                }

                row = nr;
                col = nc;
            }

            System.out.println("#"+test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
