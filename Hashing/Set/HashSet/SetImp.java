import java.security.cert.CertPath;
import java.util.HashSet;

public class SetImp {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(8);
//        set.add(1);
//        set.add(8);
//        set.add(2);
//        System.out.println(set);
//        set.remove(5);
//        set.remove(1);
//        System.out.println(set);
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set.size());


        int[] arr = {1,2,6,5,5,4,6,7,3,4,1};
        int[] arr2 = {3,9,7};
//        CountDistinctElement c = new CountDistinctElement();
//        System.out.println(c.countD(arr));
        Union_Intersection u= new Union_Intersection();
        u.intersectionCode(arr,arr2);

    }
}
