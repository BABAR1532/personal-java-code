import java.util.Scanner;

public class Switch{

 public static void main(String[] args){

Scanner sc = new Scanner(System.in);

// Write a java program to print day of week name using switch case.

/* System.out.println("Enter the day number:");

 int day = sc.nextInt();

switch(day){

 case 1 :
           System.out.println("Its sunday!");
            break;
 case 2 :
           System.out.println("Its monday!");
           break;
 case 3 :
           System.out.println("Its tuesday!");
           break;
 case 4 :
           System.out.println("Its wednesday!");
           break;
 case 5 :
           System.out.println("Its thrusday!");
           break;
 case 6 :
           System.out.println("Its friday!");
           break;
 case 7 :
           System.out.println("Its saturday!");
           break;
 default:
           System.out.println("Please enter valid input!");}
                                                                  */
// Write a java program print total number of days in a month using switch case.

   System.out.println("Enter the month number please!");

   int month = sc.nextInt();

   switch(month){

  case 1 :
           System.out.println("Its january with 31 days.");
            break;
  case 2 :
           System.out.println("Its february with 28 days.");
             break;
  case 3 :
           System.out.println("Its march with 31 days.");
           break;        
  case 4 :
           System.out.println("Its april with 30 days.");
            break;                    
  case 5 :
           System.out.println("Its may with 31 days.");
             break;
  case 6 :
           System.out.println("Its june with 30 days.");
             break;
  case 7 :
           System.out.println("Its july with 31 days.");
             break;
  case 8 :
           System.out.println("Its august with 31 days.");
            break;
  case 9 :
           System.out.println("Its september with 30 days.");
            break;
  case 10 :
           System.out.println("Its october with 31 days.");
             break;
  case 11 :
            System.out.println("Its november with 30 days.");
             break;
  case 12 :
            System.out.println("Its last month of year with 31 days.");
              break; 
  default :
            System.out.println("Enter valid input!");                                                      
  
   }











}

}
