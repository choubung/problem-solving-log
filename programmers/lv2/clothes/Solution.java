package programmers.lv2.clothes;

import java.util.*;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] item : clothes) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }

        for (int count : map.values()) {
            answer *= count + 1;
        }

        answer -= 1;

        return answer;
    }
}
