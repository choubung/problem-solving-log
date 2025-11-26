package BOJ.bronze.lv2.P19532;

import java.util.*;
import java.io.*;

public class Main {
    static int[] nums = new int[6];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0;  i< 6; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int answerX = 0,answerY = 0;

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (isAnswer(x, y)) {
                    answerX = x;
                    answerY = y;
                    break;
                }
            }
        }

        System.out.println(answerX+" "+answerY);
    }

    public static boolean isAnswer(int x, int y){
        if (nums[0]*x + nums[1]*y == nums[2] && nums[3]*x + nums[4]*y == nums[5]) return true;
        return false;
    }
}
