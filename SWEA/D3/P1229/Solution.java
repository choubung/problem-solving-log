import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for(int testCase = 1; testCase <= 10; testCase++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            List<Integer> nums = new ArrayList();

            for (int i = 0; i < n; i++) {
                nums.add(sc.nextInt());
            }

            int commandCount = sc.nextInt();

            for (int i = 0; i < commandCount; i++) {
                String command = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (command.equals("I")) {
                    List<Integer> toAdd = new ArrayList<Integer>(); // 리팩터링
                    for (int j = 0; j < y; j++) {
                        toAdd.add(sc.nextInt());
                    }
                    nums.addAll(x, toAdd);
                } else if (command.equals("D")) {
                    nums.subList(x, x+y).clear();
                }
            }

            sb.append("#").append(testCase);
            for (int i = 0; i < 10; i++) {
                sb.append(" ");
                sb.append(nums.get(i));
            }
            System.out.println(sb.toString());
        }
        sc.close(); // 추가
    }
}