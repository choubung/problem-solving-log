package SWEA.D3.P5215;

import java.util.Scanner;

class Solution {
    static int n;
    static int maxCal;
    static int maxScore;
    static int[] cal;
    static int[] score;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            maxScore = 0;
            n = sc.nextInt();
            maxCal = sc.nextInt();

            cal = new int[n];
            score = new int[n];

            for (int i = 0; i < n; i++){
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }

            dfs(0, 0, 0);

            System.out.println("#"+test_case+" "+maxScore);
        }
    }

    public static void dfs(int index, int currentScore, int currentCal) {
        if (currentCal > maxCal){
            return;
        }

        maxScore = Math.max(maxScore, currentScore);

        if (index == n){
            return;
        }

        dfs(index+1, currentScore+score[index], currentCal+cal[index]);
        dfs(index+1, currentScore, currentCal);
    }
}
