// import java.util.*;

// public class if_st {
//     public static void main(String attrs[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the marks =");
//         float m =sc. nextFloat();
//         if(m>=80){
//             System.out.print("");
//         }
//         else if(m>=60){
//             System.out.println("Second devision");
//         }
//         else if(m>=40){
//             System.out.println("Third devision");
//         }
//         else{
//             System.out.println("Fail");
//         }

//     }
    
    
// }


// import java.util.*;

// public class if_st {
//     public static void main(String attrs[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the income=");
//         float income =sc. nextFloat();
//         int tax;
//         if(income<500000){
//             System.out.println("Tax is:0");
//         }
//          else if(income>=500000 && income<=1000000){
//             tax=(int)(income*0.2);
//             System.out.println("Tax is:"+tax);
//         }
//              else{

//                 tax=(int)(income*0.3);
//              System.out.println("Tax is:"+tax);
//              } 
        
//     }
// }

// import java.util.*;

// public class if_st {
//     public static void main(String attrs[]){
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the three number=");
//         int a =sc. nextInt();
//         int b =sc. nextInt();
//         int c =sc. nextInt();
//         if(a>=b &&  a>=c){
//             System.out.println("First number is greater ");
//         }
//          else if(b>=c){
          
//             System.out.println("second numbetr is greater");
//         }
//              else{

         
//              System.out.println("Third is greater");
//              } 
        
//     }
// }
// import java.util.*;

// public class if_st {
//     public static void main(String attrs[]){
//         Scanner sc = new Scanner(System.in);
        
//          System.out.print("Enter the marks =");
//          float m=sc. nextFloat();
//          String r;
//          r=m>33? "Pass":"Fail";
//          System.out.print(r);
//     }
// }

// import java.util.*;
// public class if_st {
// public static void main(String attrs[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number=");
//     long n=sc.nextLong();
//     long i=1;
//     long f=0;
//     while(i<=n){
//         f=f+i;
//         // System.out.println(f);
//         i+=1;
//     }
//     // System.out.println("factorial of"+n+"="+f);
//     System.out.println("Sum of"+n+"="+f);

// }
    
// }

// import java.util.*;
// public class if_st {
// public static void main(String attrs[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number for table printing =");
//     int n=sc.nextInt();
//     int i=1;
//     double f=1;
//     for(i=1;i<=10;i++){
//         System.out.println(n+"*"+i+"="+n*i);

//     }
    

// }
    
// }
//SUM OF DIGITE OF A NUMBER
// import java.util.*;
// public class if_st{
// public static void main(String attrs[]){
// Scanner sc= new Scanner(System.in);
// long n=sc.nextLong();
// long r=0;
// long s=0;
// while (n>0) {
//     r=n%10;
//     s+=r;
//     n=n/10;
// }
// System.out.print("Reverse of number is="+s);
// }
// }

// import java.util.*;
// public class if_st{
// public static void main(String attrs[]){
// Scanner sc= new Scanner(System.in);
// long n=sc.nextLong();
// long r=0;
// long s=0;
// while (n>0) {
//     r=n%10;
//     s=s*10+r;
//     n=n/10;
// }
// System.out.print("Reverse of number is="+s);
// }
// }

//EXAMPLE OF SCOPE OF VARIABLE
// public class if_st
// {
//     public static void main(String args[]) {
        
//         for(int i=0;i<=5;i++ ) {
//             System.out.println("i = "+i);
//     }
    
// System.out.println("i after the loop = "+ i );
//     }
// }
// import java.util.*;
// public class if_st{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("how many numbers you want to  enter =");
//     int n = sc.nextInt();
//     int i;

//     for(i=0;i<=100;i++){
//         int m=sc.nextInt();
//         if (m%10==0){
//             break;
//         }
        
//     //   System.out.println(m);        

//     }
//     System.out.print("You have entered the wrong number");
//     }
// }


//SWAPE THE VALUE USING XOR OPERATION  
// import java.util.*;
// public class if_st{
//     public static void swap(int a,int b){
//         System.out .println("Value before swapping a= "+a+" and b="+b);
//         a=a^b;
//         b=a^b;
//         a= a^b;
//         System.out .println("Value after swapping in function  a="+a+" and b="+b);
//     }
//     public static void main (String agrs[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the two vale=");
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         swap(a,b);
//         System.out .println("Value after swapping actual value a="+a+" and b="+b);

        

//     }
// }

// import java.util.*;
// public class if_st{
//     public static void bino(double n,double r,double m){

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System .in);
//         System.out.print("Enter the value of n and r respectivly=");
//         double n=sc.nextDouble();
//         double r= sc.nextDouble();
//         double m;
//         m=n-r;
//         bino(n,r,m);
//     }

// }
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        double d=scanner.nextDouble();
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        
        
        

        
        System.out.println("String: " + inputLine);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
     }
}