public class Leetcode1108 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        String ans=defangIPaddr(address);
        System.out.println(ans);
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder("");
        for(char ch: address.toCharArray()){
            if(ch=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
