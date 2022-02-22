package level1;

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
