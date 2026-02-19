import java.util.HashMap;

public class TicketItinerary {
    public String getStart(HashMap<String,String> ticket){
        HashMap<String,String> rev = new HashMap<>();

        for(String key : ticket.keySet()){
            rev.put(ticket.get(key),key);
        }
        for(String key : ticket.keySet()){
            if(!rev.containsKey(key)){
                return  key;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();

        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");
        TicketItinerary t = new TicketItinerary();
        String start = t.getStart(ticket);
        System.out.print(start);

        for (String key : ticket.keySet()){
            System.out.print("->"+ticket.get(start));
            start = ticket.get(start);
        }
    }

}
