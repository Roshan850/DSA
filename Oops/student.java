import java.util.Scanner;


// public class D {
//     public static void main(String[] args) {
        
//         car st1;
//         st1 = new car();

//         st1.name = "Thar";
//         st1.color = "black";
//         st1.price = 200000;

//         car st2 = new car();
//         st2.name = "BMW";
//         st2.color = "Blue";
//         st2.price = 5000000;
//         st1.Present();
//         st1.Details();
//         System.out.println();
//         st2.Present();
//         st2.Details();

        
//     }

// }

public class student {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        String address;

        System.out.println("Enter n,a,r:");
        StudentClass st1 = new StudentClass();
        st1.name = "ram";
        st1.roll = 124578;
        
        // StudentClass st2 = new StudentClass();
        
    
            // st1.name = sc.nextLine();
            // st1.roll = sc.nextInt();
            // st1.address = sc.nextLine();
            // st1.showdet();
            Dog d1 = new Dog();
            d1.eating();
            System.out.print(d1.color);
        

        
    }
}

class Dog extends Animal {
    
}