public class Leetcode774 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='a';
        char ans=smallestLetter(letters, target);
        System.out.println(ans);
    }
    public static char smallestLetter(char[] letter, char target){
        int start=0;
        int end=letter.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(target<letter[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letter[start % letter.length];
    }
}
