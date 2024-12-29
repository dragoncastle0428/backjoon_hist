class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_lenI = toSeconds(video_len);
        int posI = toSeconds(pos);
        int op_startI = toSeconds(op_start);
        int op_endI = toSeconds(op_end);
        
        if ((op_startI <= posI) && (posI <= op_endI)){
                    posI = op_endI;
        }
        
        for (String command: commands){
            if (command.equals("next")){
                posI += 10;
                if(posI > video_lenI){
                    posI = video_lenI;
                }
            }
            else{
                posI -= 10;
                if (posI < 0){
                    posI = 0;
                }
            }
            
            if ((op_startI <= posI) && (posI <= op_endI)){
                posI = op_endI;
            }
        }
        int min = posI/60;
        int sec = posI%60;
        
        answer = String.format("%02d:%02d", min, sec);
        return answer;
    }
    
    public int toSeconds(String time){
        String[] times = time.split(":");
        
        return Integer.parseInt(times[1]) + (Integer.parseInt(times[0])*60);
    }
}