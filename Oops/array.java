// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         float marks[]= new float[5];
//         System.out.println("Enter the five subject marks :");
//         for(int i=0; i<marks.length;i++){
//             float n= sc.nextFloat();

//             marks[i]=n;
//         }
//         System.out.println("\nThe five subject number are:");
//         float sum=0;
//         for(int i=0; i<marks.length;i++){
//             System.out.println(marks[i]);

//             sum+=marks[i];
//         }
//         System.out.println("Total marks obtained by student:"+sum+"and percentage is:"+(sum/5));



//     }
    
// }

//LINEAR SEARCH PROGRAMM

// import java.util.*;
// public class array {
//     public static int linear_search(int num[],int k){
//         for(int i=0 ;i<num.length;i++){
//             if(num[i]==k){
//                 return i;
//             }
            
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//                 Scanner sc=new Scanner(System.in);
//                 int num[]= new int[6];
//                 System.out.println("Enter the six number :");
//                 for(int i=0; i<num.length;i++){
//                     int n= sc.nextInt();
        
//                     num[i]=n;
//                 }
//                 System.out.println("Enter the key value:");
//                 int k=sc.nextInt();
//                 int index=linear_search(num, k);
//                 if(index==-1){
//                     System.out.println("Not found ");
//                 }
//                 else{
//                 System.out.println("The position of the key is:"+index);
//                 }
// }
// }

// import java.util.*;
// public class array {
//     public static int linear_search(String menu[],String  k){
//         for(int i=0 ;i<menu.length;i++){
//             if(menu[i].equals(k)){   //for comparing two strings we use .equals
//                 return i;
//             }
            
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//                 Scanner sc=new Scanner(System.in);
//                 String  menu[]= new String [6];
//                 System.out.println("Enter the six string :");
//                 for(int i=0; i<menu.length;i++){
//                     String  n= sc.nextLine();
        
//                     menu[i]=n;
//                 }
//                 System.out.println("Enter the key:");
//                 String  k=sc.nextLine();
//                 System.out.println(k);

//                 int index=linear_search(menu, k);
//                 if(index==-1){
//                     System.out.println("Not found ");
//                 }
//                 else{
//                 System.out.println("Found and The position of the key is:"+index);
//                 }
// }
// }



// //****************//BINARY SEARCH ////******** */

// import java.util.*;
// public class array {
//     public static int binary_search(int arr[],int k){
//         int start=0;
//         int end=arr.length-1;
//         while(start <= end){
//             int mid= (start+end)/2;
//             if(arr[mid]==k){
//                 return mid;
//             }
//             if(arr[mid]>k){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
        
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the "+n+ "number :");
//                 for(int i=0; i<arr.length;i++){
//                     int num= sc.nextInt();
        
//                     arr[i]=num;
//                 }
//                 System.out.println("Enter the key value:");
//                 int k=sc.nextInt();
//             int id=binary_search(arr,k);
//                 if(id==-1){
//                     System.out.println("Not found ");
//                 }        
//                 else{
//                     System.out.println("Searching is successful and the index of the element is:"+id);
//                 }
//     }
// }
// with sorting 
// import java.util.*;

// public class array {
//     public static int binary_search(int arr[], int k) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (arr[mid] == k) {
//                 return mid;
//             }
//             if (arr[mid] > k) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1; // Fixed: should move the start pointer forward
//             }
//         }
//         return -1; // Element not found
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the " + n + " numbers for the array:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Sort the array for binary search
//         Arrays.sort(arr);
//         System.out.println("The sorted array is: " + Arrays.toString(arr));

//         System.out.println("Enter the key value to search:");
//         int k = sc.nextInt();

//         int id = binary_search(arr, k);
//         if (id == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Search successful! The index of the element is: " + id);
//         }
//     }
// }

// CODE FOR INTERVIEW  QUESTION BUYAND SELLPRODUCT
// import java.util.*;
// public class array{
//     public static int buyandsell(int prices[]){
//         int buyprice= Integer.MAX_VALUE;
//         int i;
//         int maxprofit=0;
//         for(i=0; i<prices.length ;i++){
//             if(buyprice<prices[i]){
//                 int profit= prices[i]- buyprice;
//                 maxprofit=Math.max(maxprofit,profit);
//             }
//             else{
//                 buyprice=prices[i];
//             }
//         }
//         return maxprofit;

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of the selling prices:");
//         int p=sc.nextInt();
//         int prices[]=new int[p];
//         System.out.println("Enter the all selling prices:");
//         for (int i=0;i<p;i++){
//             int n =sc.nextInt();
//             prices[i]=n;

//         }
//         System.out.println("Maximum profit of the selling prices:"+buyandsell(prices));

//     }
// }

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum;
        sum = num1 + num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Sum of the numbers is"+sum);


        
    }
}