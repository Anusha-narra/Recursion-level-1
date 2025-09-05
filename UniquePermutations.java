import java.io.*;
import java.util.*;

public class UniquePermutations {
    static Set<String>ob=new LinkedHashSet<>();
 public static void perm(String s,String ans){
        if(s.length()==0){
           ob.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String lss=s.substring(0,i);
            String rss=s.substring(i+1);
            String pss=lss+rss;
        perm(pss,ans+c);
        }
    }
    

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        perm(s,"");
        for(String Unique:ob){
            System.out.println(Unique);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}