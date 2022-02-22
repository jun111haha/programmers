package level1;

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
