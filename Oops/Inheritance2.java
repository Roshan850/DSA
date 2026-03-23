public class Inheritance2 {
    public static void main(String args[]) {
        // Vehicle v1=new Car();
        // v1.print();
        // Vehicle v2 = new Vehicle();
        // v2.print();
        
        // Vehicle v1=new Car();
        // v1.print1();

        Vehicle v2 = new Vehicle();
        v2.print(98);
        System.out.println(Vehicle.count);
        System.out.println(20+10);


    
        
        
        
    }
    
}

class Vehicle {
    static int count;
        void print(int count) {
            this.count = count;
                
            }
        }

// class Car extends Vehicle {
//     // void print()
//     // {
//     //     super.print();
//     //     System.out.println("Car is called");
//     // }

//     void print1()
//     {
        
//         System.out.println("Car is called");
//     }}
