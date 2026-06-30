package programmers.lv2.fatigue;

public class Solution {
    static int answer = 0;
    static int n;
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        n = dungeons.length;

        visited = new boolean[n];
        dfs(dungeons, 0, k);

        return answer;
    }

    public void dfs(int[][] dungeons, int depth, int hp) {
        answer = Math.max(answer, depth);

        if (depth == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (hp < dungeons[i][0]) {
                    continue;
                }

                visited[i] = true;
                dfs(dungeons, depth + 1, hp - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
}
