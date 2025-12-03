package BOJ.silver.lv4.P1620;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> numNameMap = new HashMap<>();
        HashMap<String, String> nameNumMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            numNameMap.put(String.valueOf(i), name);
            nameNumMap.put(name, String.valueOf(i));

        }

        while(m-- > 0){
            String key = br.readLine();
            if (numNameMap.containsKey(key)) {
                System.out.println(numNameMap.get(key));
            }
            if (nameNumMap.containsKey(key)){
                System.out.println(nameNumMap.get(key));
            }
        }
    }
}
