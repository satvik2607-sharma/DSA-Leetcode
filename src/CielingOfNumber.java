public class CielingOfNumber {
    public static void main(String[] args) {
        /*cieling means smallest number which is greater than or equal to target
        eg:= arr={2,3,5,9,14,16,18}
        cieling(arr,15)=16 (16 is the next smallest number which is greater than 15 )
        */
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=cieling(arr, target);
        System.out.println(ans);
    }

    public static int cieling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(start<=end){
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return start;
    }
}
