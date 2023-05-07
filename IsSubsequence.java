import java.util.HashSet;

public class IsSubsequence {
    public static void main(String[] args) {
       String s="abc";
       String t="abaebdsc";
       boolean ans=isSubsequence(s,t);
        System.out.println(ans);
    }
    public static boolean isSubsequence(String s, String t){
       if(s.length()==0) return true;

       int i=0;
       int j=0;

       while(j<t.length()){
           if(s.charAt(i)==t.charAt(j)){
               i++;

               if(i==s.length()) return true;
           }
           j++;
       }
       return false;
    }
}
