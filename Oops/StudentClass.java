// class car {
//     int price;
//     String color;
//     String name;

//     public  void Present() {
//         System.out.println("The car name is " + name);
//     }

//     public  void Details() {
//         System.out.println("The color is " + color);
//         System.out.println("The price is " + price);
//     }
// }

class StudentClass{
    String name;
    int roll;
    String pass;

    StudentClass(int marks){

    }

    // public void showdet() {
    //     System.out.println("The student name is: "+name);
    //     System.out.println("Roll no is :"+roll);
    //     System.out.println("Address of the student is :"+address);


    // }
           //non parameterised constructure
    StudentClass(){
        System.out.println("The constructor is called...");
    }

    StudentClass(String name) {
            System.out.println(name);

    }


}