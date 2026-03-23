import java.util.*;
// import java.util.ArrayList;
// public class Array_list {
//     public static void swap(ArrayList<Integer> list,int ind1 ,int ind2){
//     int temp=list.get(ind1);
//     list.set(ind1,list.get(ind2));
//     list.set(ind2,temp);
//     }
    
//     public static void main(String args[]){
// ArrayList<Integer> list1=new ArrayList<>();
// ArrayList<Integer> list2=new ArrayList<>();
// // list1.add(2);
// // list1.add(5);
// // list1.add(9);
// // list1.add(3);
// // list1.add(6);
// // System.out.print(list1);
// // System.out.println(list1.contains(11));
// // System.out.println(list1.contains(2));
// //ADD ELEMENT USING INDEX
// // list1.add(1,10);

// // System.out.println(list1);
// // //access element by for loop
// // for (int i=0;i<list1.size();i++){
// //     System.out .print(list1.get(i)+" ");
// // }

// // //REVERSE A ARRAYLIST
// // for(int i=list1.size()-1;i>=0;i--){
// //     System.out.print(list1.get(i)+" ");
// // }
// // System.out .println( "");
// // int m=list1.size()-1;

// // while(m>=0){
// //     System.out.print(list1.get(m)+" ");
// //     m--;
// //}

// //FIND THE LARGEST ELIMENT IN THE ARRAY LIST
// // int  max=Integer.MIN_VALUE;
// // for(int i=0;i<list1.size();i++){
// //     // if(list1.get(i)>max){
// //     //     max=list1.get(i);
// //     // }
// //     //BY FUNCTION 
// //     max=Math.max(max,list1.get(i));
// // }
// // System.out.println("Maximum element is="+max);

// // int a=list1.get(1);
// // int b=list1.get(3);
// // a=a^b;
// // b=a^b;
// // a=a^b;
// // list1.set(1,a);
// // list1.set(3,b);
// // //AFTER THE SWAPING THE LIST ELEMENT
// // System.out.println(list1);

// //SWAPPING BY THE FUNCTION
// Scanner sc=new Scanner(System.in);
// int arr[]=new int[5];
// System.out.print("Enter the five element in the array list:");
// for(int i=0;i<6;i++){
//     int n=sc.nextInt();
//     list2.add(i,n);
// }
// System.out.println(list2);
// Collections.sort(list2);   //BY DEFAULT ASCENDING ORDER
// System.out.println(list2);
// Collections.sort(list2,Collections.reverseOrder());  // IN DESCENDING ORDER


// //swap(list2, 1, 3);
// System.out.println(list2);


// }
    
// }


//MULTIDEIMENSIONAL ARRAYLIST

public class Array_list {
public static void main(String args[]){


    ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
    // ArrayList<Integer> list1= new ArrayList<>();
    // ArrayList<Integer> list2= new ArrayList<>();
    // list1.add(10);
    // list1.add(20);
    // list1.add(30);
    // list2.add(40);
    // list2.add(50);
    // list2.add(60);
    // mainlist.add(list1);
    // mainlist.add(list2);
    // for(int i=0; i<mainlist.size();i++){
    //     ArrayList<Integer> temp= mainlist.get(i);
        
    //     for(int j=0 ; j<temp.size();j++){
    //         System.out.println(temp.get(j)+" ");
    //     }
    //     System.out.println();

    //}
    ArrayList<Integer> list1= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    ArrayList<Integer> list3= new ArrayList<>();
    for(int i=1;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainlist.add(list1);
    mainlist.add(list2);
    mainlist.add(list3);
    for(int i=0; i<mainlist.size();i++){
            ArrayList<Integer> temp= mainlist.get(i);
            System.out.print("List"+i+": ");
            for(int j=0 ; j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
    
        }

    System.out.println(mainlist);
    
}
}