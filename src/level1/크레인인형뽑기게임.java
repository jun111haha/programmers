package level1;

import java.util.Stack;

/*
* 바구니 역활을 해줄 stack 을 준비하고 0 을 넣는다,
* borad[i][number-1] 이 0이라면 인형이 X
* 0이 아니라면 stack(바구니) 의 가장 윗요소와 stack peek 을 통해서
* 같은지 확인한다. 같으면 pop(꺼내고 스택에서는 해당요소 삭제) answer 에 2 를 더한다.
* 다르다면 stack(바구니) 에 borad[i][number-1]를 push 한다.
* */
public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int number : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][number-1] != 0){
                    if(stack.peek() == board[i][number-1]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[i][number - 1]);
                    }
                    board[i][number-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        int [][] borad = {
                 {0,0,0,0,0}
                ,{0,0,1,0,3}
                ,{0,2,5,0,1}
                ,{4,2,4,4,2}
                ,{3,5,1,3,1}};

        int [] moves = {1,5,3,5,1,2,1,4};


        solution(borad, moves);

    }
}
