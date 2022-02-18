package level1;


import java.util.*;


/*
* getOrDefault(A,B)
* A: 가져올값
* B: default 값
* 그후에 완주자 이름의 key로 하여 값을 1씩 감소시킨다. 값에 하나라도 있으면?
* 완주하지 못한사람은 감소되지않음 1을 가지게된다.
* */
public class 완주하지못한선수 {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        solution(participant, completion);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String , Integer> map = new HashMap<>();

        for(String name : participant)
            map.put(name, map.getOrDefault(name, 0) + 1);

        //완주자 기준으로 -1 씩 for 문
            for(String name : completion)
                map.put(name, map.get(name) - 1);
                System.out.println(map);

            //int 값이 하나라도 있으면 완주X
            for(String key : map.keySet()){
                if(map.get(key) > 0){
                    answer = key;
                    System.out.println(answer);
                    break;
                }
            }


        return answer;
    }
}


