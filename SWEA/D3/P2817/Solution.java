package SWEA.D3.P2817;

import java.util.Scanner;

class Solution {
    static int n;
    static int k;
    static int[] arr;
    static int count;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            n = sc.nextInt();
            k = sc.nextInt();
            count = 0;
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            dfs(0, 0);

            System.out.println("#"+test_case+" "+count);
        }
    }

    public static void dfs(int index, int sum) {
        if (sum == k) {
            count++;
            return;
        }

        if (index == n) {
            return;
        }

        dfs(index + 1, sum); // 넣지 않음
        dfs(index + 1, sum + arr[index]); // 넣음
    }
}
