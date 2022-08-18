 import java.util.Scanner;

public class Main{

  public static void main(String[] args){

Scanner sc = new Scanner (System.in);

// Write a java program to input month number and print number of days in that month.
    System.out.println("Enter month number please :");
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
    }
}}
