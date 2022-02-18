package level1;

import java.util.Arrays;

/*
*
* 1. 배열에서 첫번째 인덱스를 잘라서 변수에 저장
* 2. 배열에서 두번쨰 인덱스를 잘라서 변수에 저장
* 3. Arrays.copyOfRange
*    원본 배열에서 어디서 부터 어디까지 잘라서 배열로 리턴하는 함수이다.
*    두번째 파라미터에는 시작 인덱스, 세번째 파라미터에는 끝 인덱스를 넣는데 끝 인덱스는 포함하지 않는다
* 4. Arrays.sort
*    오름차순 정렬을 해준다.
* 5. 그 후 새로 정렬된 배열에서 commands 의 3번쨰 인덱스를 찾아서 저장
* */
public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i =0; i<commands.length; i++){
            int first = commands[i][0] - 1;
            int second = commands[i][1];

            int [] arr = Arrays.copyOfRange(array, first, second);
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int [] answer = solution(array, commands);
        System.out.println(Arrays.toString(answer));

    }
}
