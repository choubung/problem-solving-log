package SWEA.D3.P1244;

import java.util.*;

class Solution {
    static String[] nums;
    static int max;       // 최대 상금
    static int chance;    // 남은 교환 횟수
    static HashSet<String> visited;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            nums = sc.next().split("");
            chance = sc.nextInt();
            max = 0;
            visited = new HashSet<>();

            if (chance > nums.length) {
                chance = nums.length;
            }
            dfs(0);

            System.out.println("#" + test_case + " " + max);
        }
    }

    public static void dfs(int depth) {
        String currentStr = String.join("", nums);
        int currentVal = Integer.parseInt(currentStr);

        String key = currentStr + "_" + depth;

        if (visited.contains(key)) {
            return;
        }

        visited.add(key);

        if (depth == chance) {
            if (currentVal > max) {
                max = currentVal;
            }
            return;
        }

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                swap(i, j);

                dfs(depth + 1);

                swap(i, j);
            }
        }
    }

    public static void swap(int i, int j) {
        String temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}