package BAEKJOON.SILVER.lv3.P1018;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static int BOARD_SIZE = 8;
    static char[][] board;
    static int min = 64;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i <= n - 8; i++){
            for (int j = 0; j <= m - 8; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int startRow, int startCol) {
        char expected = 'W';
        int change = 0;

        for (int i = startRow; i < startRow + BOARD_SIZE; i++) {
            for (int j = startCol; j < startCol + BOARD_SIZE; j++) {
                if ((i + j) % 2 == 0 && board[i][j] != expected) {
                    change++;
                }
                if ((i + j) % 2 != 0 && board[i][j] == expected) {
                    change++;
                }
            }
        }

        int currentMin = Math.min(change, 64 - change);
        min = Math.min(min, currentMin);
    }
}