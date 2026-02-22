import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] wt = {10,20,30};
        int[] val ={ 60,100, 120};
        int w = 50;



        double[][] ratio = new double[val.length][2];
        // 0th co; => idx ; 1st col => ratio
        for(int i = 0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }

        Arrays.sort(ratio, Comparator.<double[]>comparingDouble(o -> o[1]));

        int capacity = w;
        int Fvalue = 0 ;
        for(int i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){ // include full item
                Fvalue+= val[idx];
                capacity-= wt[idx];
            }
            else {
                //include fractional item
                Fvalue+=  (ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }

        System.out.println("Final value = "+ Fvalue);
    }
}
