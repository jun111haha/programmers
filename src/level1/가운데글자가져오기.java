package level1;

/*
* 글자가 짝수면 substring API 활용 / 2 한 후, 전 index 부터 잘라서 answer 에 담아준다.
* 글자가 홀수면 subsrting API 활용 / 2 한 후, 뒤에 +1 하여 잘라서 answer 에 담아준다.
* */
public class 가운데글자가져오기 {

    public static String solution(String s) {
        String answer = "";
        int dot = s.length();

        if(dot % 2 == 0){
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 +1);
        }else{
            answer = s.substring(s.length() / 2, s.length() / 2 +1);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        solution("abcd");
    }
}
