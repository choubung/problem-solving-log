package programmers.lv1.P340213;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_sec = toSeconds(video_len);
        int pos_sec = toSeconds(pos);
        int op_start_sec = toSeconds(op_start);
        int op_end_sec = toSeconds(op_end);

        for (String c : commands) {
            if (pos_sec >= op_start_sec && pos_sec <= op_end_sec){
                pos_sec = op_end_sec;
            }

            if (c.equals("next")){
                pos_sec = Math.min(video_sec, pos_sec+10);
            } else if (c.equals("prev")){
                pos_sec = Math.max(0, pos_sec-10);
            }
        }

        if (pos_sec >= op_start_sec && pos_sec <= op_end_sec){
            pos_sec = op_end_sec;
        }

        return String.format("%02d:%02d", pos_sec/60, pos_sec%60);
    }

    public int toSeconds(String time){
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
}