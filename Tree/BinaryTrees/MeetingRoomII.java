import java.util.TreeMap;

public class MeetingRoomII {
    public int meetingRCodeII(int[][] arr){
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        int count = 0,ans = 0;
        for(int []i : arr){
           int start = i[0];
            int end = i[1];
            tmap.put(start, tmap.getOrDefault(start, 0)+1);
            tmap.put(end , tmap.getOrDefault(end , 0) - 1);
        }
        for(int k : tmap.keySet()){
            count += tmap.get(k);
            ans = Math.max(count , ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        MeetingRoomII m = new MeetingRoomII();
        int[][] arr = new int[3][2];
        arr[0][0] = 0;
        arr[0][1] = 30;
        arr[1][0] = 5;
        arr[1][1] = 10;
        arr[2][0] = 15;
        arr[2][1] = 20;

        System.out.println(m.meetingRCodeII(arr));
    }
}
