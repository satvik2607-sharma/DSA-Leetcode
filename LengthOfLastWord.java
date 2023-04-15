public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int n=s.length();
        int result=0;
        while(n>0){
            if(s.charAt(--n) != ' '){
                result++;
            }
            else if(result > 0){
                return result;
            }
        }
        return result;
    }
}
