package level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 두개뽑아서더하기 {
    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j= i+1; j<numbers.length; j++){
                int result = numbers[i] + numbers[j];
                if(list.indexOf(result) < 0){
                    list.add(result);
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0 ;i<list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int [] val = {2,1,3,4,1};

        solution(val);

    }
}
