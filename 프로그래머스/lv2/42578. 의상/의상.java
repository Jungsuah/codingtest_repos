import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap <String,Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
               map.put(clothes[i][1], map.getOrDefault(clothes[i][1],1)+1);
            
        }
 
        int num  = 1;
        for(int a : map.values()){
           num = num * a; 
        }
        answer = num -1;
        return answer;
    }
}