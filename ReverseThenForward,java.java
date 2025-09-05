import java.io.*;
import java.util.*;

public class ReverseThenForward {
    public static void decrincr(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        decrincr(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        decrincr(n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}