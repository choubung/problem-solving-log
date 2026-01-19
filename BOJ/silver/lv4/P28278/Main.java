package BOJ.silver.lv4.P28278;

import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                cal(command);
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void cal(int command) {
        if (command == 2) {
            if (stack.isEmpty()) {
                sb.append(-1);
            } else {
                sb.append(stack.pop());
            }
            return;
        }

        if (command == 3) {
            sb.append(stack.size());
            return;
        }

        if (command == 4) {
            if (stack.isEmpty()) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            return;
        }

        if (command == 5) {
            if (stack.isEmpty()) {
                sb.append(-1);
            } else {
                sb.append(stack.peek());
            }
        }
    }
}
