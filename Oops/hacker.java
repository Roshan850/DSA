// import java.util.Scanner;

// public class hacker {
//     public static void main (String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         if (n%2 !=0){
//             System.out.println("Weird");
//         }
//         else if(n%2==0 && n>=2 && n<=5){
//             System.out.println("Not Weird");
//         }
//         else if(n%2==0 && n>=6 && n<=20){
//             System.out.println("Weird");
//         }
//         else if(n%2==0 && n>20 ){
//             System.out.println("Not Weird");
//         }
//     }
// }

// import java.util.Scanner;

// public class hacker {

//     public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             System.out.println("================================");
//             for(int i=0;i<3;i++){
//                 String s1=sc.next();
//                 int x=sc.nextInt();
//                 if (x>=100){
//                     System.out.println(s1+"           "+x );
//                 }
//                 else{
//                     System.out.println(s1+"           "+"0"+x );
//                 }
//                 //Complete this line
//             }

//             System.out.println("================================");

//     }
// }

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class hacker {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String arr[]=new String[4];
//         int i;
//         for(i=1; i<4;i++){
//             String s=sc.nextLine();
//             arr[i]=s;
//             //System.out.println(i+" "+s);
//         }
//         for(i=1; i<4;i++){
            
            
//             System.out.println(i+" "+arr[i]);
//         }

        
// }
// }

// import java.util.*;
// public class hacker{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s= sc.nextLine(); 
//         String reversed = new StringBuilder(s).reverse().toString();
//        if(reversed.equals(s)){
//         System.out.println("Yes");
//        }
//        else{
//         System.out.println("No");
//        }

//     }
// }

import java.util.*;
public class hacker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int br=sc.nextInt();
        int hg=sc.nextInt();
        int area;
        if(br>0 && hg>0){
            area=br*hg;
            System.out.println(area);
        }
        else{
            System.out.println("The area does not in negative form");
        }

    }
}


