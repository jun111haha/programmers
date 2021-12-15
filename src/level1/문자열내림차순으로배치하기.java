package level1;

import java.util.*;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {

        String val = "Zbcdefg";
        solution(val);
    }

    public static String solution(String s) {
        String answer = "";
        String [] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());

        for(int i=0; i<str.length; i++){
            answer+= str[i];
        }

        return answer;
    }
}
