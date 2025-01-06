class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int min = 1;
        int max = 100000;
        
        while (min <= max){
            if (max-min < 3){
                for (int i = min-1; i <= max+1; i++){
                    if (i == 0){
                        i = 1;
                    }
                    long time = getTime(diffs, times, i);
                    if (time <= limit){
                        return i;
                    }
                }
            }
            else{
                answer = (max+min)/2;
                long time = getTime(diffs, times, answer);

                if (time >= limit){
                    min = answer+1;
                }
                else{
                    max = answer-1;
                }
            }
        }
        
        return answer;
    }
    
    public long getTime(int[] diffs, int[] times, int answer){
        long time = times[0];
        for (int i = 1; i < diffs.length; i++){
            int diff = diffs[i] - answer;
            if (diff <= 0){
                time += times[i];
            }
            else{
                time += ((times[i]+times[i-1])*diff + times[i]);
            }
        }
        
        return time;
    }
}