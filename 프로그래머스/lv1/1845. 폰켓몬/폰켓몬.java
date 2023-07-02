import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2;
        
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums){
            hash.add(num);
        }
        
        if(pick >= hash.size()){
            answer = hash.size();
        }else{
            answer = pick;
        }
        
        return answer;
    }
}