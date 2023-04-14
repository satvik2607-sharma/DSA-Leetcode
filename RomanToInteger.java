import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java .util.*;

public class RomanToInteger {
    public static void main(String[] args) {
       HashMap<Character, Integer> map=new HashMap<>();
       map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);

        System.out.println(map);
    }
//    public static int romanToInt( String b){
//        Map<Character, Integer> map=new HashMap<>();
//            map.put('I',1);
//            map.put('V',5);
//            map.put('X',10);
//            map.put('L',50);
//            map.put('C',100);
//            map.put('D',500);
//            map.put('M',1000);
//
////            int result=map.get(s.charAt(s.length()-1));
////
////        for (int i = s.length()-2; i >=0 ; i--) {
////            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
////                result-=map.get(s.charAt(i));
////
////            }
////            else{
////                result+= map.get(s.charAt(i));
////            }
////        }
//        if(map.containsKey(b)){
//            return 1;
//        }
//        else return 0;
//
//    }
}
