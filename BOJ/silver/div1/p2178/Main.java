package boj.silver.div1.p2178;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String row = br.readLine();

            for (int j = 0; j < m; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        int answer = bfs(map);
        System.out.println(answer);
    }

    public static int bfs(int[][] map){
        int n = map.length;
        int m = map[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int distance = current[2];

            if (cx == n-1 && cy == m-1) {
                return distance;
            }

            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < n && nx >= 0 && ny < m && ny >=0) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, distance + 1});
                    }
                }
            }
        }

        return -1;
    }
}
