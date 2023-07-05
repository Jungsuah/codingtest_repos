import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String genre : genres){
            for(int play : plays){
                map.put(genre, map.getOrDefault(genre, 0) + play);
            }
        }
        
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(((o2, o1) -> map.get(o1.getKey()) - map.get(o2.getKey())));
        List<Integer> index = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : entryList){
            //System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
                for(int i =0; i < genres.length; i++){
                   String genrecount = entry.getKey();
                    int count = 0;
                    if(entry.getKey().equals(genres[i])){
                        index.add(i);
                        count++;
                    }
                }
            }
         System.out.println(index);
        
        return answer;
    }
}