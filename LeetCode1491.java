import java.util.Arrays;

public class LeetCode1491 {
    public static void main(String[] args) {
        int[] salary={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        average(salary);
    }

    public static double average(int[] salary){
        Arrays.sort(salary);
        double sum =0, avg=0;
        for(int i=1;i<salary.length-1;i++){
            sum += salary[i];
        }
        avg = (double)sum/(salary.length-2);
        return avg;
    }
}
