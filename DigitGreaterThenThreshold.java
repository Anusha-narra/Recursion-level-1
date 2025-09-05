import java.io.*;
import java.util.*;

public class DigitGreaterThenThreshold {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int target=in.nextInt();
        int count=0;
        String numstr=String.valueOf(n);
        for(char ch:numstr.toCharArray()){
            int digit=ch-'0';
            if(digit>target){
                count++;
            }
        }
        
        System.out.print(count==0?-1:count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}