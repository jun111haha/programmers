package level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
* 1. 카운트를 위한 getCount 해시맵에 리스트 id_list 아이디, 0 추가한다.
* 2. reportIdListMap 해시맵에 id_list id와 중복 제거를 위한 HashSet 을 추가.
* 3. report 배열에서 split 메소드를 통해 " " 분기점으로 잘라서 배열로 저장
* 4. add 메소드를 통해 추가하여 저장한다.
* 5. for 문을 통해서 중복제거를 하고 getMail 의 초기값을 0으로 설정
* 6. 키에대한 값을 +1 추가시켜 return 해준다.
*
* */

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportIdListMap = new HashMap<>();
        Map<String, Integer> getCount = new HashMap<>();

        for(String id : id_list){
            getCount.put(id, 0);
            reportIdListMap.put(id, new HashSet<>());
        }

        for(String reportId : report){
            String [] checkReport = reportId.split(" ");
            reportIdListMap.get(checkReport[1]).add(checkReport[0]);
        }

        System.out.println(reportIdListMap);
        for(String key : reportIdListMap.keySet()){
            HashSet<String> reporters = reportIdListMap.get(key);
            if(reporters.size() >= k){
                for(String reporter : reporters){
                    int getMail = getCount.get(reporter);
                    getCount.put(reporter, getMail+1);
                    System.out.println(getCount);
                }
            }
        }

        for(int i = 0; i< answer.length; i++){
            answer[i] = getCount.get(id_list[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

        String [] idList = {"muzi", "frodo", "apeach", "neo"};
        String [] reportList = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        solution(idList, reportList, k);

    }
}
