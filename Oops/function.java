import java.util.Scanner;
// public static  double fact(double n);
// public static  double fact(double n){
//     int i;
//     double f=1;
// for(i=1;i<=n;i++){
// f=f*i;
// }
// return (f);
// }
// public class function {
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     double x=sc.nextDouble();
//     double r ;
//     r=fact(x);

//     System.out.println(r);
//     }
// }

// public static  double fact(double n){
//     int i;
//     double f=1;
// for(i=1;i<=n;i++){
// f=f*i;
// }
// return (f);
// }
// public class function {
//     public static  long fact(long n){
//         int i;
//         long f=1;
//     for(i=1;i<=n;i++){
//     f=f*i;
//     }
//     return (f);
//     }
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the number for factorial=");
//     long x=sc.nextLong();
//     long r ;
//     int i;
//     for(i=1;i<=x;i++){
//     r=fact(i);
//     System.out.println(r);
//     }
//     System.out.println("Enter the number for factorial=");
// long c=sc.nextLong();
//     System.out.println(fact(c));
//     }
// }

//CALCULATIG THE BINOMIAL EXPANSION

// import java.util.*;
// public class function{
//     public static long bino(long n){
//         int i;
//                 long f=1;
//             for(i=1;i<=n;i++){
//             f=f*i;
//             }
//          return f;
            
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System .in);
//         System.out.print("Enter the value of n and r respectivly=");
//         long n=sc.nextLong();
//         long r= sc.nextLong();
//         long m;
//         m=bino(n);
//         long z=bino(r);
//         long y=bino(n-r);
//         double ans;
//             ans=m;
//             ans=ans/(z*y);
//             System.out.println("Binomial of "+n+"C"+r+" is = "+ans);
//     }

// }
// public class function{
// public static void main(String args[]){
//             Scanner sc=new Scanner(System .in);
//             System.out.print("Enter the value of n and r respectivly=");
//             long n=sc.nextLong();
//             System.out.println(0n)
// }
// }

//CHECK ANUMBER IS PRIME OR NOT

//public class function {

    // public static boolean isprime(int n){
    //    if(n==2)
    //     return true;
    
    //     for(int i=2 ; i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
//     public static boolean isprime(int n){
//         if (n==2){
//         return true;
//     }
//         for (int i=2; i<=Math.sqrt(n); i++){
//             if (n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
   
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the range of the prime number=");
//         int n=sc.nextInt();
//         System.out .print(isprime(n));
//     }
// }

//PRINT ALL PRIME NUMBERS IN RANGE 
// public class function {
// public static boolean isprime(int n){
//     if (n==2){
//     return true;
// }
//     for (int i=2; i<=Math.sqrt(n); i++){
//         if (n%i==0){
//             return false;
//         }
//     }
//     return true;
// }

// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the range of the prime number=");
//     int i;
//     int n=sc.nextInt();
//     for (i=2; i<= n;i++){
//         if(isprime(i)==true){
//             System.out.println(i);
//         }
//     }
    
// }
// } 

// CONVERT A BINARY NUMBER TO DECIMAL NUMBER 

// public class function {

//     public static long dec(long n){
//         int i;
//         long r,dec;
//         dec=0;
//         i=0;
//         while (n>0) {
            
//             r=n%10;
         
//             dec=dec+(r*(long)Math.pow(2,i));
           
//             n=n/10;
//             i++;


//         }
//         return dec;
//     }
//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the binary number =");
//         long n= sc.nextLong();
//         System.out.println("Binary to decimal conversion is :"+dec(n));


//     }
// }


//CONVERSION OF BINARY NUMBER TO DECIMAL 

// import java.util.*;
// public class function{
//     public static void bin(int n){
//         int i=0;
//         int r;
//         int Bin=0;
//         while(n>0){
//               r=n%2;
//               Bin=Bin+(r*(int)Math.pow(10,i));
//               n=n/2;
//               i++;
              
//         }
//         System.out .print("Binary to decimal is :"+Bin);

//     }
//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the binary number :");
//         int n=sc.nextInt();
//         bin(n);
//     }
// }

// BOTH PROGRAM ADD IN ONE
import java.util.*;
public class function{
    public static void dec_to_bin(int n){
        int i=0;
        int r;
        int Bin=0;
        while(n>0){
              r=n%2;
              Bin=Bin+(r*(int)Math.pow(10,i));
              n=n/2;
              i++;
              
        }
        System.out .print("decimal  to binary is :"+Bin);

    }
        public static void bin_to_dec(int n){
        int i;
        int r,dec;
        dec=0;
        i=0;
        while (n>0) {
            
            r=n%10;
         
            dec=dec+(r*(int)Math.pow(2,i));
           
            n=n/10;
            i++;


        }
        System.out .print(" Binary to decimal is :"+dec);
 
    }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("\n\nSELECT THE OPERATION \n1.BINARY TO DECIMAL \n2.DECIMAL TO BINARY\n3.EXIT  ");
        int ch=sc.nextInt();
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        if(ch==1){
            bin_to_dec(n);
        }
        else if(ch==2){
            dec_to_bin(n);
        }
        else{
            break;
        }
    }
        
    }
}