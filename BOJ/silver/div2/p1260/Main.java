package boj.silver.div2.p1260;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] edges = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());

            edges[nodeA].add(nodeB);
            edges[nodeB].add(nodeA);
        }

        for (List edge : edges) {
            Collections.sort(edge);
        }

        dfs(edges, new boolean[n + 1], v);
        System.out.println();
        bfs(edges, v);
    }

    public static void bfs(ArrayList<Integer>[] edges, int node) {
        int n = edges.length;

        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n];

        queue.offer(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");

            for(int nextNode : edges[current]) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
    }

    public static void dfs(ArrayList<Integer>[] edges, boolean[] visited, int node) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;
        System.out.print(node + " ");

        for(int nextNode : edges[node]) {
            dfs(edges, visited, nextNode);
        }
    }
}
