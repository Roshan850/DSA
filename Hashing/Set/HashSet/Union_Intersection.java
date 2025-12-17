import java.util.HashSet;

public class Union_Intersection {
    public void intersectionCode(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count =0;
        for(int i =0;i< arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }

        }
        System.out.println("Intersection = "+count);
    }
}
