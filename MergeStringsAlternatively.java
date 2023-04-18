public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqrs";
        System.out.println(mergeAlternatively(s1, s2));
    }
    public static String mergeAlternatively(String wrd1, String wrd2){
        int n1=wrd1.length();
        int n2=wrd2.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n1 && i<n2){
            sb.append(wrd1.charAt(i));
            sb.append(wrd2.charAt(i));
            i++;
        }
        while(i<n1){
            sb.append(wrd1.charAt(i));
            i++;
        }
        while(i<n2){
            sb.append(wrd2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
