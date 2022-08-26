import java.util.Scanner;
 
public class pattern{

	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

/* 1. Square pattern in java.

      ******                // summary: Easy question, the funda is you have to run inner loop and  
      ******                            outer loop according to  no of rows because,no of ro- 
      ******                            ws and column is same and just print star in inner loop.
      ******
      ****** */

 /* int number;
    System.out.println("Enter no of line you want in square pattern:");
    number = sc.nextInt();
   
    for(int i = 1; i <= number; i++)
    {
    	for(int col = 1; col <= number;col++)           
        {                                              
        	System.out.print("* ");
        }

      System.out.println(); 

    }  */                       

/* Print this pattern question.
      1 1 1
      2 2 2                       //summary: Same as pervious question,just change the star and
      3 3 3                                  with row no i.e print the value of i in inner loop.
      4 4 4   */

 
/*  int number;
    System.out.println("Enter the no of rows your want for number square.");
    number = sc.nextInt();
  
   for(int i = 1; i <= number; i++)
   {
       for(int col = 1; col<= number; col++)
       {
           System.out.print(i + " ");
       }

     System.out.println();

   } */  

/* Print this pattern question
    1 2 3 4
    1 2 3 4                      //summary: same as pervious just print column no in inner loop.
    1 2 3 4
    1 2 3 4   */


 /* int number;
    System.out.println("Enter the no of rows you want in square pattern.");
     number = sc.nextInt();

    for(int i = 1;i <= number;i++) 
    {
        for(int col = 1;col <= number;col++)
        {
            System.out.print(col + " ");
        }  

       System.out.println();

    } */

/* Print the following pattern
     1 2 3
     4 5 6                          // Summary: just print counting number and increment in loop.
     7 8 9  */

  /*   int number;
     System.out.println("Enter no of rows you want to print square number.");
      number = sc.nextInt();
     int count = 1;
     
     for(int i = 1; i <= number; i++)  
     {
        for(int col = 1; col <= number; col++)          
        {
            System.out.print(count + " ");
             count ++;
        }

       System.out.println();     
     } */








	}
}

