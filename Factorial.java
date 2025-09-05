import java.io.*;
import java.util.*;

public class Factorial{
    public static int Fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=Fact(n);
        System.out.print(ans);
    }
}