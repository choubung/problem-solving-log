package BOJ.silver.lv5.P7785;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (state.equals("enter")) set.add(name);
            if (state.equals("leave")) set.remove(name);
        }

        List<String> result = new ArrayList<>(set);
        Collections.reverse(result);

        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
