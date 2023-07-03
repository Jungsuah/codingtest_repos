import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int p = 0; p < commands.length; p++) {
            int i = commands[p][0];
            int j = commands[p][1];
            int k = commands[p][2];
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(subArray);
            answer[index] = subArray[k - 1];
            index++;
        }

        for (int aa : answer) {
            System.out.println(aa);
        }

        return answer;
    }
}
