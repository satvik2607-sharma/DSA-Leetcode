import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode349 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[]ans=intersection(nums1, nums2);
        System.out.println(ans);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        List<Integer> arr = new ArrayList<>();

        for(int i:nums1){
            set.add(i);
        }

        for(int i:nums2){
            if(set.contains(i)){
                arr.add(i);
                set.remove(i);
            }
        }

        int[] resultArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            resultArray[i] = arr.get(i);
        }

        return resultArray;
    }
}
