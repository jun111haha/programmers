package level1;

import java.util.Arrays;
import java.util.Comparator;
/*
* Comparble 와 Comparator 의 차이점을 유히해서 사용.
* 이 문제에서는 Comparator 의 인터페이스를 매개변수로 받아 사용했음.
* 콜백함수 개념 사용.
* 전자는 this 를 이용해서 비교하고 후자는 매개변수 두개를 받아서 비교를한다.
* n번째 문자가 같을 경우에 원본 스트링을 사전순으로 정렬.
* */

public class 문자열내마음대로정렬하기 {

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if(c1 == c2){
                    return o1.compareTo(o2);
                }else if(c1 > c2){
                    return  1;
                }else{
                    return -1;
                }
            }
        });

        answer = new String[strings.length];
        for(int i=0; i< strings.length; i++){
            answer[i] = strings[i];
        }

        return strings;

    }

    public static void main(String[] args) {

        String [] val = {"abce", "abcd", "cdx"};

        solution(val, 2);
    }
}
