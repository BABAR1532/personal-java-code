 import java.util.Scanner;

public class Main{

  public static void main(String[] args){

Scanner sc = new Scanner (System.in);

// Write a java program to input month number and print number of days in that month.
    /* System.out.println("Enter month number please :");
    int month = sc.nextInt();

    if (month == 1){

      System.out.println("No of days in january is 31.");
    }

    else if (month == 2){
      System.out.println("No of days in february is 28.");
    }

    else if (month == 3){
      System.out.println("No of days in  march is 31.");
    }

    else if (month == 4){
      System.out.println("No of days in april is 30.");
    }

    else if (month == 5){

      System.out.println("No of days in may is 31.");
    }
    
    else if(month == 6){

    System.out.println("No of days in june is 30.");
    }

    else if(month == 7){

      System.out.println("No of days in july is 31.");
    }
  
    else if (month == 8){

      System.out.println("No of days in august is 31.");
    }

    else if(month == 9){

      System.out.println("No of days in september is 30.");
    }
    
    else if (month == 10){

      System.out.println("No of days in october is 31.");
    }

    else if (month == 11){

      System.out.println("No of days in november is 30.");
    }

    else if (month == 12){

      System.out.println("No of days in december is 31.");
    }  */

    // Greedy alogorithm problem
 // java program to count total number of notes in given amount

  /*  System.out.println("Enter the amount please!");    // ### very good question
    
    int amount = sc.nextInt();

    if(amount >= 500){

      int note500 = amount/500;

      System.out.println("Note of 500 is " + note500 + ".");

      amount -= note500 * 500;

    }
    
    if(amount >= 100){

      int note100 = amount/100;

      System.out.println("Note of 100 is " + note100 + ".");

      amount -= note100 * 100;
    }

    if (amount >= 50){

      int note50 = amount/50;

      System.out.println("Note of 50 is " + note50 + ".");
    

      amount -= note50 * 50;
    }

    if (amount >= 20){
      
      int note20 = amount/20;

      System.out.println("Note of 20 is " + note20 + ".");

      amount -= note20 * 20;
    }

    if (amount >= 10){

      int note10 = amount/10;

      System.out.println("Note of 10 is " + note10 + ".");

      amount -= note10 *10;
    }

    if (amount >= 1){

      int note1 = amount/1;

      System.out.println("Note of 1 is " + note1 + ".");


    }

    System.out.println("Thank you!"); */

 // Write a java program to input angles of a triangle and check whether triangle is valid or not.
 
 /* System.out.println("Enter the angle of triangle");
  int angle1 = sc.nextInt();
  int angle2 = sc.nextInt();
  int angle3 = sc.nextInt();

  if (angle1 + angle2 + angle3 == 180){
    System.out.println("Triangle is valid.");
  }   

  else{
    System.out.println("Triangle is not valid!");
  } 

  */

 // Write a java program to check whether the triangle is equilateral, isosceles or scalene triangle.
   
  /* System.out.println("Enter the side of triangle:");
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();


   if ( a == b && a == c){

    System.out.println("Triangle is equilateral.");
   }

   else if ((a != b) && (b != c) && (a != c)){

    System.out.println("Triangle is scalene.");
   }

   else if ( a == b || b == c || c == a){

    System.out.println("Triangle is isosceles.");

   } */

   // Write a java program to find all roots of a quadratic equation.

   /* System.out.println("Enter the value of a,b and c");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble(); 
     double deter = b * b - 4 * a * c;
     double root1;
     double root2;

     if (deter > 0){

      root1 = (-b + Math.sqrt(deter)) / 2 * a;
      root2 = (-b - Math.sqrt(deter)) / 2 * a;

      System.out.println("Root(+)=" + root1);
      System.out.println("Root(+)=" + root2);



     }

     if (deter == 0){

      root2 = -b / (2 * a);

      System.out.println("Root(+ and -)=" + root2);
     } */
 
 // Write a  java program to calculate profit or loss. 

    /* System.out.println("Enter your investment please!");
     int invest = sc.nextInt();

     System.out.println("Enter your return of investment please!");

     int retur = sc.nextInt();

     int profit;
     int loss;

     if(invest < retur){
      
      profit = retur - invest;

      System.out.println("congratulation you have profit of " + "Rs" + profit + ".");

     }

     else if( invest > retur){

      loss = invest - retur;

      System.out.println("Really sorry you have loss of " + "Rs" + loss + ".");
     }

     else{

      System.out.println("Nor loss nor profit or invalid input.");
     } 
       */

     /* Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and
       Computer. Calculate percentage and grade according to following:
           Percentage >= 90% : Grade A
           Percentage >= 80% : Grade B
           Percentage >= 70% : Grade C
           Percentage >= 60% : Grade D
           Percentage >= 40% : Grade E
           Percentage < 40% : Grade F     */
      
    /*   System.out.println("Hi! Enter your number in-");

       System.out.print("Physics:");

        float physics = sc.nextFloat();

       System.out.print("Chemistry:");

        float chemistry = sc.nextFloat();

       System.out.print("Biology:");

        float biology = sc.nextFloat();
     
       System.out.print("Math:");

        float math = sc.nextFloat();

       System.out.print("Computer:");

        float computer = sc.nextFloat();

      float totalmarks = physics + chemistry + biology + math + computer;

      float percentage = (totalmarks / 500 ) * 100;

      if (percentage >= 90){

       System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade A." );

      }

      else if (percentage >= 80){

        System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade B." );
      }

      else if(percentage >= 70){

        System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade C." );
      }

      else if(percentage >= 60){

        System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade D." );
      }

      else if(percentage >= 40){

        System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade E." );


      }

      else if(percentage < 40 ){
           
        System.out.println("Congrats you achieved " + percentage + "%.\n" + "You get a grade F." );
      }

      else{

        System.out.println("invalid input!");
      }
        */

   /* Write a java program to input basic salary of an employee and calculate its Gross salary according to following:
      Basic Salary <= 10000 : HRA = 20%, DA = 80%
      Basic Salary <= 20000 : HRA = 25%, DA = 90%
      Basic Salary > 20000 : HRA = 30%, DA = 95%  */ 

    /*   System.out.println("Enter your Basic salary:");

      double basic = sc.nextDouble();
        
       double gross;
      double da = 0;
      double hra = 0;
      

      if (basic <= 10000){
 
         da = basic * 0.80;
         hra = basic * 0.20;
      
      } 

      else if(basic <= 20000){


         da = basic * 0.90;
         hra = basic * 0.25; 

        
      }

      else if(basic > 20000){

           da = basic * 0.95;
           hra = basic * 0.30;

        
      }   

      else{

        System.out.println("Invalid input!");
      } 


      gross = basic + hra + da ;

      System.out.println("Your gross salary is " + gross); */ 



 /* Write a java program to input electricity unit charges and calculate total electricity bill according to the
     given condition:
   for first 50 units Rs. 0.50/unit
   for next 100 units Rs. 0.75/unit
   for next 100 units Rs. 1.20/unit
   for unit above 250 Rs. 1.50/unit
  An additional surcharge of 20% is added to the bill */


 /* System.out.println("Enter the eletricity bill unit: ");

   int unit = sc.nextInt();
   double bill = 0;
   double extra;

   if(unit <= 50){

    bill = unit * 0.50 ;
   } 

   else if(unit <= 150){

    bill = 25 + ((unit - 50) * 0.75);

   } 

   else if(unit <= 250){

    bill = 100 + ((unit - 150) * 1.20);
   }

   else if(unit > 250){

     bill = 300 + ((unit - 250) * 1.50);
     
   }
  
   extra = bill * 0.20;
   bill += extra; 
  
  System.out.println("Total eletricity bill is Rs " + bill);
                                                             */

}
}



