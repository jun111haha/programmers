package level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
* 1. getCount 리스트에 id_list 아이디, 0 추가해서 카운트 체크
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
            System.out.println(reporters);
            if(reporters.size() >= k){
                for(String reporter : reporters){
                    int getMail = getCount.get(reporter);
                    getCount.put(reporter, getMail+1);
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
