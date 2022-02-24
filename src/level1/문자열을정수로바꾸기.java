package level1;

public class 문자열을정수로바꾸기 {
    public static int solution(String s) {
        int answer = 0;

        int number = Integer.parseInt(s);
        answer = number;

        return answer;
    }

    public static void main(String[] args) {
        solution("1234");
    }
}
