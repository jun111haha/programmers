package level1;

public class 내적 {

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] val = {1,2,3,4};
        int [] val2 = {-3,-1,0,2};


        solution(val, val2);

    }
}
