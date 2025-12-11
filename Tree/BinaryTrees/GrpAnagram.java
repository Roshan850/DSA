import java.util.*;

public class GrpAnagram {
    public List<List<String>> grpAnagramCode(String [] strs){

        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);

            if (map.get(s) != null) {
                List<String> a = map.get(s);
                a.add(str);
                map.put(s, a);
            } else {
                List<String> a = new ArrayList<>();
                a.add(str);
                map.put(s, a);
            }
        }

        for (Map.Entry<String, List<String>> x : map.entrySet()) {
            ans.add(x.getValue());
        }

        return ans;
    }

    public static void main(String[] args) {
        GrpAnagram s = new GrpAnagram();
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> res = s.grpAnagramCode(words);
        System.out.println(res);
    }
}
