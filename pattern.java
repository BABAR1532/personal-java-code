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

/* same question like above,just number are altered.

   3 2 1                          // Summary- just use formula number - col + 1 we get reverse        
   3 2 1                            number column.
   3 2 1 */

 
 /* System.out.println("Enter the no of rows you want in reverse square pattern.");
   int number = sc.nextInt();

   for(int i = 1; i <= number; i++) 
   {
     for(int col = 1 ; col <= number; col++)
     {
        System.out.print((number-col+1) + " " );
     }

    System.out.println();
        
  }  

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

/* Solve left triangle pattern questions
     *
     * *                            // Summary: just we have to print row = no of *.     
     * * *
     * * * *    */

 /*  int number;
   System.out.println("Enter the no rows you want to print in triangle:");
   number = sc.nextInt();

   for(int i = 1; i <= number; i++) 
   {
     for (int col = 1; col <= i; col++)
     {
        System.out.print("*" + " ");
     }
    
    System.out.println();

   } */     

/* solve this right triangle pattern question
     1
     2 2
     3 3 3                     // summary: just do as pevious question and replace * with i. 
     4 4 4 4                              
     5 5 5 5 5 */

 
 /*   int  number;
    System.out.println("Enter the no of rows you want in triangle:");
    number = sc.nextInt();

    for(int i = 1; i <= number;i++)
    {
        for(int col = 1 ; col <= i; col++)
        {
            System.out.print(i + " ");
        }

       System.out.println();

    }*/  

/* solve this printing question
    1 
    2 3                           // Summary: same question as previous just print 
    4 5 6                             counting number in place of i.
    7 8 9 10  */ 

/*
    int number;
    int count = 1;
    System.out.println("Enter the number of rows you want to print in triangle:");
    number = sc.nextInt();

    for(int i = 1; i<= number; i++)
    {
        for(int col = 1; col <= i; col++)
        {
            System.out.print(count + " ");
             count ++;
        } 

       System.out.println();  
          
    } */

/* solve this priting problem.
     1
     2 3                         // Summary: just print counting starting form the row number.
     3 4 5
     4 5 6 7
     8 9 10 11  */

 /*  int number;
   System.out.println("Enter the number of rows you want to print in triangle:");
   number = sc.nextInt();

   for(int i = 1; i <= number; i++)     
   { 

     int count = i;                 // Main key of this question

      for(int col = 1; col <= i; col++ )
      {
          System.out.print(count + " " );
           count++;    
      }

     System.out.println();
    
    } */

/* solve this pattern question.
     1
     2 1                           /* summary: use this formula to print decreasing 
     3 2 1                            counting number starting form row number (number-col+1)
     4 3 2 1  */                               

   /* int number;
    System.out.println("Enter the no of rows you want to print in pattern:");
    number = sc.nextInt(); 
   

   for(int i = 1; i <= number; i++)
   {
      for(int col = 1 ; col <= i ; col++ )
      {
        System.out.print(i-col+1 + " ");

      }
      
    System.out.println(); 
   
   }

/* Solve this pattern question
     A A A
     B B B
     C C C                              Summary: easy question just we have to print alphabet
     D D D                               using this formula (alpha + number - 1) and so on.
                                         main highlight of question is conveting int to char. */


   /*  int number;
     int alpha = 65;
     System.out.println("Enter the no of rows you want in alphabet square:");
     number = sc.nextInt();

    for(int i = 1; i <= number; i++)
    {   
        
        for(int col = 1; col <= number; col++)
        {
            System.out.print((char)(alpha + i -1) + " " );
        }

       System.out.println();

    }  */

/* solve this pattern question.
    A B C
    A B C                         // Summary: Same question just increase the value of alpha
    A B C                                      in inner loop.  
    A B C  */

 /*   int number;
    System.out.println("Enter the number of rows you want to print in alpha pattern:");
    number = sc.nextInt();

    for(int i = 1; i <= number; i++)
    {    
         int alpha = 65;

         for(int col = 1; col <= number; col++)
         {
            System.out.print((char) alpha + " ");
              alpha++;
         }

       System.out.println(); 

    }*/  


  











	}
}

