package SWEA.D4.P1231;

import java.util.*;
import java.io.*;

class Solution {
    static int n;
    static char[] tree;
    static StringBuilder sb;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int testCase = 1; testCase <= 10; testCase++) {
            n = Integer.parseInt(br.readLine());
            tree = new char[n+1];

            for (int i = 1; i < n + 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int index = Integer.parseInt(st.nextToken());
                char value = st.nextToken().charAt(0);
                tree[index] = value;
            }

            sb = new StringBuilder();
            inOrder(1);

            System.out.println("#"+testCase+" "+sb.toString());

        }
    }

    public static void inOrder(int index) {
        if (index > n) {
            return;
        }

        inOrder(index*2);

        sb.append(tree[index]);

        inOrder(index*2+1);
    }

}