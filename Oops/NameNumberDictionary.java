// import java.util.Scanner;

// public class w {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();

//         // for(int i=1; i<=5; i++){
//         //     System.out.print(number+" x "+i+" = "+number*i+"\n");

//         //                                       //  5 x 1 = 5
//         //                                    //     5 x 2 = 10
//         //                                   //      5 x 3 = 15
//         //                                   //     5 x 4 = 20
//         //                                    //     5 x 5 = 25
        
                    
//         // }
//         // if(number%2==0){
//         //     System.out.println("even");
//         //     }
//         //     else{
//         //     System.out.println("odd");
//         //     }

//         for (int i = n; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// int k,m;
//         // Lower part of the pattern
//         for (int i = 2; i <= n; i++) {
//             if(n<i){
//                 break;
//             }
//             for (int j = 0; j < i; j++) {
//                 k=i;
                

//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }


//             }
//             }
            import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameNumberDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> dictionary = new HashMap<>();

        System.out.print("Enter the number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            dictionary.put(name, number);
        }

        System.out.println("Dictionary contents:");
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
        }

        sc.close();
    }
}