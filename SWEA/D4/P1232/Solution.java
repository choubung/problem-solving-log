package SWEA.D4.P1232;

import java.util.*;
import java.io.*;

class Solution {
    static String[] data;
    static int[] left;
    static int[] right;
    static int n;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int testCase = 1; testCase <= 10; testCase++) {
            n = Integer.parseInt(br.readLine());

            data = new String[n + 1];
            left = new int[n + 1];
            right = new int[n + 1];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int index = Integer.parseInt(st.nextToken());
                String value = st.nextToken();
                data[index] = value;

                if (st.hasMoreTokens()) {
                    left[index] = Integer.parseInt(st.nextToken());
                    right[index] = Integer.parseInt(st.nextToken());
                }
            }
            double result = calculate(1);
            System.out.println("#" + testCase + " " + (int)result);
        }
    }

    static double calculate(int index) {
        String operator = data[index];

        if (isOperator(operator)) {
            double leftResult = calculate(left[index]);
            double rightResult = calculate(right[index]);

            switch (operator) {
                case "+":
                    return leftResult + rightResult;
                case "-":
                    return leftResult - rightResult;
                case "*":
                    return leftResult * rightResult;
                case "/":
                    return leftResult / rightResult;
            }
        }
        return Double.parseDouble(operator);
    }

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}