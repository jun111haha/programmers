package level1;

public class 소수만들기 {
    public static void main(String[] args) {

        int [] val1 = {1,2,3,4};

        solution(val1);
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    int n = nums[i] + nums[j] + nums[k];
                    System.out.println(n);
                    if(isCheck(n)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private static boolean isCheck(int num){

        for(int i=2 ; i<num; i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }
}


