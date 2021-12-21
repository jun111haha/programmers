package level1;


import java.util.*;

public class 완주하지못한선수 {
    public static void main(String[] args) {

        String[] val1 = {"leo", "kiki", "eden"};
        String[] val2 = {"eden", "kiki"};

        solution(val1, val2);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        for(int i=0; i<participant.length; i++){
            boolean check = true;
            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    completion[j] = null;
                    check = false;
                    break;
                }
            }
            if(check) {
                answer += participant[i];
            }
        }
        return answer;
    }

}


