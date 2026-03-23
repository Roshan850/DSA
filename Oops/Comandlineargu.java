// public class Comandlineargu {
//     public static void main(String args[]){
//         int a = Integer.parseInt(args[0]);
//         int i;
//          long fact=1;
//         for (i = 1; i <= a; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial of "+a+" is :"+fact);
//   }
    
// }

public class Comandlineargu{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int i,r, sum,p;
        for (i = a; i <= b; i++) {
            sum=0;
            p=i;
            while (i > 0) {
                r = i % 10;
                sum = sum * 10 + r;
                i = i / 10;

            }
            if(p==sum){
                System.out.println(p);
            }
        }

    }
}


