package SWEA.D3.P1230;

import java.util.Scanner;
import java.util.List;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        List<Integer> nums;

        for(int testCase = 1; testCase <= 10; testCase++) {
            nums = new ArrayList();
            sb = new StringBuilder();

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                nums.add(sc.nextInt());
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String command = sc.next();

                if (command.equals("I")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    List<Integer> addTo = new ArrayList();

                    for (int j = 0; j < y; j++) {
                        addTo.add(sc.nextInt());
                    }

                    nums.addAll(x, addTo);
                } else if (command.equals("D")){
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    for (int j = 0; j < y; j++) {
                        nums.remove(x);
                    }
                } else if (command.equals("A")){
                    int y = sc.nextInt();
                    List<Integer> addToRear = new ArrayList();
                    for (int j = 0; j < y; j++) {
                        addToRear.add(sc.nextInt());
                    }
                    nums.addAll(addToRear);
                }
            }

            sb.append("#").append(testCase);
            for (int i = 0; i < 10; i++) {
                sb.append(" ").append(nums.get(i));
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}