public class Comandlinearg {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int i, fact;
        fact=1;
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+a+" is :"+fact);
  }
    
}
