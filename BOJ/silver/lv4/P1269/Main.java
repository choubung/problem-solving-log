package BOJ.silver.lv4.P1269;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> resultSet = new HashSet<>(setA);
        resultSet.removeAll(setB);
        setB.removeAll(setA);
        resultSet.addAll(setB);

        System.out.println(resultSet.size());
    }
}
