import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String str = "";
        for(char x : a.toCharArray()){
            if(x >= 97 && x <= 122){//소문자인 경우
                str += (char)(x-32);
            }else{
                 str += (char)(x+32);
            }
        }
        System.out.println(str);
    }
}