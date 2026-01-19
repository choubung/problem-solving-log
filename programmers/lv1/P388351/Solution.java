package programmers.lv1.P388351;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int total = schedules.length;

        // setting
        for (int i = 0; i < total; i++) {
            int time = schedules[i] + 10;
            if (time % 100 >= 60) {
                time += 40;
            }
            schedules[i] = time;
        }

        // calculate
        for (int i = 0; i < total; i++) {
            int today = startday;
            answer += isSuccess(i, schedules, timelogs, today);
        }

        return answer;
    }

    public int isSuccess(int employee, int[] schedules, int[][] timelogs, int today) {
        for (int j = 0; j < 7; j++) {
            if (today == 8) today = 1;

            if (today == 6 || today == 7) {
                today += 1;
                continue;
            }

            if (timelogs[employee][j] > schedules[employee]) {
                return 0;
            }

            today += 1;
        }

        return 1;
    }
}