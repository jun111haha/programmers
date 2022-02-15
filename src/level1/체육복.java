package level1;

import java.util.Arrays;

/*
* 순차적으로 배열을 비교 할 수 있게 정렬한다.
* 여벌 체육복을 가져온 학생이 도난당한경우 -> 체육복을 빌려줄수없음 reserve , lost 배열에서 -1 로 제외한다.
* 여벌의 체육복을 가져온학생이 자기번호 +1 , -1 로 앞, 뒤 학생에게 빌려준다.
* 그 후에 reserve[j] = -1 로 빌려준사람 제외시킨다.
* */
public class 체육복 {

    static public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //체육복을 가져온사람이 도난당한경우
        for(int i =0; i < lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 5;
        int [] lost = {2,4};
        int [] reserve = {1,3,5};


        solution(n , lost, reserve);

    }
}
