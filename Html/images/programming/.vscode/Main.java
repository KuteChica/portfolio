
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*java math */

/*System.out.println(Math.PI);
System.out.println(Math.E);*/


/* 
    double result;
    result= Math.pow(2,5);
    result=Math.abs(-5);
    result=Math.sqrt(9);
    System.out.println(result);*/


    //HYPATENUS c = Math.sqrt( a²+b²)
    /*
 Scanner scanner=new Scanner (System.in);
 double a;
 double b;
 double c;
 
 System.out.println("enter the length of side A:");
 a = scanner.nextDouble();

  System.out.println("enter the length of side B:");
 b = scanner.nextDouble();
System.out.println(a);
System.out.println(b);
c= Math.sqrt(Math.pow(a,2 )+Math.pow(b,2));
System.out.println("the hypotenuse (side c) is : " + c);
 scanner.close();

 

 Scanner scanner=new Scanner (System.in);
scanner.close();



        /*   Random random=new Random();
    boolean isheads;
    isheads = random.nextBoolean();
    System.out.println(isheads);
           */
     
        

        

        // SHOPPING CART PROGRAM
      /* 
        
        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.println("what item will you like to buy");
        item = scanner.nextLine();

        System.out.println("what is the price for each");
        price=scanner.nextDouble();
       System.out.println("how many would you like");
       quantity=scanner.nextInt();
      total =price*quantity;
      System.out.println("\n you have bought " + quantity + "" + item + "/s");
      System.out.println("your total is " + currency+total);
 */ 



 Scanner scanner=new Scanner (System.in);
System.out.print("entyer the radius");
double radius;
 double area;
 double volume;
 double circumference;
radius=scanner.nextDouble();
circumference= 2* Math.PI * radius;
area=Math.PI * Math.pow(radius,2);
volume = (4.0 / 3.0 ) *Math.PI * Math.pow(radius ,3);
System.out.printf("the circumference is: %f.1cm" , circumference + "5cm");
System.out.printf("the area is : %f.1cm²" + area  );
System.out.printf("the volume is : %f.1cm³" , volume );



scanner.close();
  

     
    
    }
    
}
