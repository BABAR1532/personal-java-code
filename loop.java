import java.util.Scanner;

public class loop{
   
   public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);

    
// Write a program to print numbers from 1 to 10.

  /*   int num = 1;

     while ( num <= 10){

     	System.out.println(num);

     	num++;
     } */

// Write a program to calculate the sum of first 10 natural number.     
     
   /*  int number = 1;
      int sum = 0;

     while(number <= 10){

      sum += number;

      number ++; }

     System.out.println("Sum of first 10 natural number is " + sum); */


// Write a program that prompts the user to input a positive integer.It should then print the multiplication table of that number.

    /*  System.out.println("Enter your (+) number for multiplication table:");

      int num1 = sc.nextInt();      

      int product;

      for (int noutum2 = 1; num2 <= 10; num2++){

          product = num1 * num2;

          System.out.println(num1 + " X " + num2 + " = " + product);

      } */

// Write a program to find the factorial value of any number entered through the keyboard.



 /* System.out.println("Enter the number:");
   int number = sc.nextInt();
   int factorial = 1;
    for (int i = 1 ; i <= number; i++){

     factorial *= i; }

   System.out.println("Factorial of " + number + " is "+ factorial);
                                                                      */
    
// If input 32 approx it will give your garbage value because data type int can't store that.


/* Two numbers are entered through the keyboard. 
  Write a program to find the value of one number raised to the power of another. 
   (Do not use Java built-in method) */

/*
   System.out.println("Enter the base no:");
   int base = sc.nextInt();

   System.out.println("Enter the power no:");

   int power = sc.nextInt();

   int ans = 1 ;

 for(int i = 1 ; i <= power; i++ ){


    ans *= base ; } 

 System.out.println("The value value of one number raised to the power of another is " + ans); */
                                                                                               
/*  Write a program that prompts the user to input an integer and then outputs the number with
   the digits reversed. For example, if the input is 12345, the output should be 54321 */

/*
   System.out.println("Enter your favourite number:");
    int number = sc.nextInt();
     int ans = 0;

   while (number > 0){

     int remainder = number % 10;
        
       number /= 10;

     ans =  ans * 10 + remainder;    
                                     // very very important question.
   }
   

   System.out.println("Your favourite number reverse is " + ans); */

// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 /*        
     int number;
     int odd = 0;
     int even = 0;
     char option;

     do
     {
        System.out.println("Enter you number please!");
         number = sc.nextInt();

         if(number % 2 == 0){

             even += number; 
                            } 
         else {

           odd += number;
                           } 
                                  
           System.out.println("Do you want to continue(y or Y)?");
            option = sc.next().charAt(0);                           }

      while(option == 'y' || option == 'Y');

   System.out.println("Sum of even is " + even);
   System.out.println("Sum of odd is " + odd);   */

  
/* Write a program that prompts the user to input a positive integer. It should then output a
    message indicating whether the number is a prime number.  */  

  /* System.out.println("Enter a positive Integer");

     int number = sc.nextInt();
     boolean flag = true;

     for(int i = 2; i < number; i++)
     {

        if(number % i == 0) 
         {
            flag = false;
         }         
     } 

     if(flag && number > 1)
     {
        System.out.println("Yes baby its prime!");
     }

     else
     {
        System.out.println("No baby its not prime!");
     }                                                  */

// Find the HCF of a number

 /*   int divisor,divident,remainder;
   int hcf = 0;

   System.out.println("Enter the divisor:");
    divisor = sc.nextInt();

   System.out.println("Enter the divident:"); 
    divident = sc.nextInt();


   do
   {
       remainder = divident % divisor;
  
       if(remainder == 0)
       {
         
         hcf = divisor;

       }

       else
       {

         divident = divisor;
         divisor  = remainder;
        
       }
    }

    while(remainder != 0);    
   

   System.out.println("HCF of given number is " + hcf); */

 /* Write a do-while loop that asks the user to enter two numbers. The numbers should be
   added and the sum displayed. The loop should ask the user whether he or she wishes to
   perform the operation again. If so, the loop should repeat; otherwise it should terminate. */

 /*
    int num1,num2,sum;
    char choice;

    do
    {     
          System.out.println("Enter the First number: ");
           num1 = sc.nextInt();
          System.out.println("Enter the second number:");
           num2 = sc.nextInt(); 

          sum = num1 + num2;
          System.out.println("Sum of number is " + sum);

       System.out.println("Do you want to continue(Y/y):");
        choice = sc.next().charAt(0);    
    }

    while(choice == 'y' || choice == 'Y');   */


 /* Write a program to enter the numbers till the user wants and at the end it should display the
    count of positive, negative and zeros entered. */

  /*   int number;
     int positive = 0;
     int negative = 0;
     int zero = 0;
     char choice;

     do
     {
         System.out.println("Enter you number:");
          number = sc.nextInt();

         if(number > 0)
         {
            positive++;
         }

         else if (number < 0) 
          {
            negative++;
          }     
          
         else
         {
            zero++;
         }
      
         System.out.println("Do you want to continue(y/Y):");
          choice = sc.next().charAt(0);

     }while(choice == 'y'|| choice == 'Y'); 

    System.out.println("Number of positive value is: "+ positive);
    System.out.println("Number of negative value is: " + negative);
    System.out.println("Number of zeroes value is: " + zero);            */
                                                                         

    

    







    


  }

}