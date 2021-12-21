package level1;

import java.util.*;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String [] seoul = {"Jane", "Kim"};
        solution(seoul);
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int newSeoul = Arrays.asList(seoul).indexOf("Kim");

        answer = "김서방은 " + newSeoul + "에 있다";

        return answer;
    }
}
