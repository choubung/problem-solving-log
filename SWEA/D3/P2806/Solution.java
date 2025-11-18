package SWEA.D3.P2806;

import java.util.Scanner;

class Solution {
    static int[] board;
    static int n;
    static int count;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            n = sc.nextInt();
            board = new int[n];
            count = 0;

            dfs(0);

            System.out.println("#"+test_case+" "+ count);
        }
    }

    public static void dfs(int depth) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isPossible(depth, i)) {
                board[depth] = i;
                dfs(depth+1);
            }
        }
    }

    public static boolean isPossible(int d, int i) {
        for (int k = 0; k < d; k++) {
            if (board[k] == i) { // 열
                return false;
            }
            if (Math.abs(d- k) == Math.abs(board[k] - i)) { // 대각선
                return false;
            }
        }
        return true;
    }
}