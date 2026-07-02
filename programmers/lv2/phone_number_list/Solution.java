package programmers.lv2.phone_number_list;
import java.util.*;

public class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

        for (String num : phone_book) {
            set.add(num);
        }

        for (String num : phone_book) {
            for (int i = 1; i < num.length(); i++) {
                if (set.contains(num.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
