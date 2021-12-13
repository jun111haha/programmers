package level1;

public class 두정수사이합구하기 {
    public static void main(String[] args) {

        solution2(3,5);

    }

    public static long solution2(int a, int b) {
        long answer = 0;
        int max =0;
        int min =0;

        if(a==b){
            return a;
        }else if(a<b){
            max = a;
            min = b;
        }else if(b<a){
            max = b;
            min = a;

        }

        for(int i= max; i<=min; i++){
            answer +=i;
        }
            System.out.println(answer);


        return answer;

    }
}


