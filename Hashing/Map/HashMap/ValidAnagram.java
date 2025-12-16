import java.util.TreeMap;

class ValidAnagram {
    public boolean isvalid(String s,String t){
        if(s.length() != t.length()){
            return false;
        }


        int len = s.length();
        TreeMap<Character,Integer> map1 = new TreeMap<>();

        for(int i = 0;i< len;i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i =0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(map1.get(ch) != null){
                if(map1.get(ch) == 1){
                    map1.remove(ch);
                }else {
                    map1.put(ch,map1.get(ch) - 1);
                }
            }else {
                return false;

            }
        }
       return map1.isEmpty();


    }
}
