import java.io.*;
import java.util.*;
public class Fibonacci{
    public static int Fib(int n){
        if(n==0||n==1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=Fib(n);
        System.out.print(ans);

    }
}
