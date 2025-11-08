package SWEA.D4.P1233;

import java.util.*;
import java.io.*;

class Solution {
    static int n;
    static int result;
    static String[] data;
    static int[] leftChildIndex;
    static int[] rightChildIndex;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int testCase = 1; testCase <= 10; testCase++) {
            result = 0;
            n = Integer.parseInt(br.readLine());
            data = new String[n + 1];
            leftChildIndex = new int[n + 1];
            rightChildIndex = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int index = Integer.parseInt(st.nextToken());
                data[index] = st.nextToken();

                if (st.hasMoreTokens()) {
                    leftChildIndex[index] = Integer.parseInt(st.nextToken());
                }

                if (st.hasMoreTokens()) {
                    rightChildIndex[index] = Integer.parseInt(st.nextToken());
                }
            }

            if (checkValidate(1)) {
                result = 1;
            }
            System.out.println("#" + testCase + " " + result);
        }
    }

    public static boolean checkValidate(int index) {
        int left = leftChildIndex[index];
        int right = rightChildIndex[index];

        if (isOperator(data[index])) {
            if (left == 0 ||  right== 0){
                return false;
            }
            return checkValidate(left) && checkValidate(right);
        } else {
            if (left != 0 ||  right!= 0) {
                return false;
            }
            return true;
        }
    }

    public static boolean isOperator(String op) {
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
            return true;
        }
        return false;
    }
}
