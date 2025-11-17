package SWEA.D2.P1859;

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int profit = 0;
            int n = sc.nextInt();
            int nums[] = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int max = nums[n-1];
            int outcome = 0;
            int count = 0;

            for (int i = n - 2; i >=0; i--) {
                if (nums[i] > max) {
                    profit += count*max - outcome;
                    max = nums[i];
                    outcome = 0;
                    count = 0;
                } else {
                    count++;
                    outcome += nums[i];
                }
            }
            profit += count*max - outcome;
            System.out.println("#"+test_case+" "+profit);
        }
    }
}
