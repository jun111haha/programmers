package level1;

/*
* 소문자로 전부 변경후
* count 변수 선언
* 분기처리 -> 카운트 증감 / 감소
* */
public class 문자열p와y개수 {

    public static boolean solution(String s) {

        int count = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(c == 'p'){
                count ++;
            }
            if(c == 'y'){
                count --;
            }
        }
        return count == 0 ? true : false;
    }

    public static void main(String[] args) {
        solution("pPoooyY");

    }
}
