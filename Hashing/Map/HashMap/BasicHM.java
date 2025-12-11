import java.util.HashMap;

public class BasicHM {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",130);
        hm.put("America",50);
        hm.put("US",100);
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("US"));
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);
    }
}
