


public class D {
    public static void main(String[] args) {
        
        car st1;
        st1 = new car();

        st1.name = "Thar";
        st1.color = "black";
        st1.price = 200000;

        car st2 = new car();
        st2.name = "BMW";
        st2.color = "Blue";
        st2.price = 5000000;
        st1.Present();
        st1.Details();
        System.out.println();
        st2.Present();
        st2.Details();

        
    }

}
