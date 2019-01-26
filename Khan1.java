/**************************************************************************
*                                                                         *
*     Program Filename:  Khan1.java                                       *
*     Author          :  Sarim Khan                                       *
*     Date Written    :  January 31, 2017                                 *
*     Purpose         :  To check sudoku board solution                   *
*     Input from      :  None                                             *
*     Output to       :  Screen                                           *
*                                                                         *
**************************************************************************/
import java.util.Scanner;
import java.io.*;
public class Khan1 
{
	public static void main(String[] args) throws IOException
	{
		int[][] Board = new int[9][9]; 
      int Counter = 0; 
     
      InitializeBoard(Board);   
      
      for (int i=0; i<9; i++)
      {
      RowIsCorrect(Board, i); 
      if (RowIsCorrect(Board, i))
         Counter++;
      } 
      
      for (int i=0; i<9; i++)
      {
      ColumnIsCorrect(Board, i);
      if (ColumnIsCorrect(Board, i))
         Counter++;
      }
      
      SectionIsCorrect(Board);  
      
      if (SectionIsCorrect(Board)) 
         Counter++;
         
      if (Counter == 19)
      System.out.println("This IS a Sudoku board solution");    
      else 
      System.out.println("This IS not a Sudoku board solution");        

   }   
   public static void InitializeBoard(int Board[][]) throws IOException
   {
      String FileName; 
		Scanner Keyboard = new Scanner(System.in);
		Scanner InFile;
		int i, j;
		
		System.out.print("Please enter the name of the input files: ");
		FileName = Keyboard.nextLine(); 
		InFile = new Scanner(new File(FileName));
		
		for (i = 0; i<=8; i++)
			for (j=0; j <=8; j++)
				Board[i][j] = InFile.nextInt();
            
      for (i=0; i<=8; i++)
      {
         for (j=0; j<=8; j++)
            System.out.print(Board[i][j] + " "); 
         System.out.println();   
      }      
      return; 
   }   
//end InitializeBoard   
   
   public static boolean RowIsCorrect (int Board[][], int r)
	{
      int sum = 0;
		int j; 
		int i;
		int [] CheckArray = new int[9];
		
		for (j=0; j<9; j++)
		{
			CheckArray[Board[r][j]-1] = 1;
			
		}
         
      for (i = 0; i<9; i++)
			{
					sum = sum + CheckArray[i];		
			}
		
      if (sum == 9)
   		{ 
         return true;
   		}
		else
   		{
         return false;
   		}
 
	} 
//end RowIsCorrect   
   
   public static boolean ColumnIsCorrect (int Board[][], int r)
	{
		int sum = 0;
		int j; 
		int i;
		int [] CheckArray = new int[9];
		
			for (j=0; j<9; j++)
			{
				CheckArray[Board[j][r]-1] = 1;	
			}
         
         for (i = 0; i<9; i++)
			{
					sum = sum + CheckArray[i];		
			}   

     if (sum == 9)
   	{
   	   return true;
   	}
   	else
   	{
   	   return false;
   	}
	} 
//end ColumnIsCorrect   
   
   public static boolean SectionIsCorrect (int Board[][])
   {
      int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0;
      int i;
      int j;
      int[] CheckArray = new int[9];
      
      for (i = 0; i<=2; i++)
      {
         for (j = 0; j<=2; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum1 = sum1 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0; 
      
      //Check section one, store values in sum1, and clear CheckArray
      
      for (i = 0; i<=2; i++)
      {
         for (j = 3; j<=5; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum2 = sum2 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section two, store values in sum2, and clear CheckArray

      for (i = 0; i<=2; i++)
      {
         for (j = 6; j<=8; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum3 = sum3 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section three, store values in sum3, and clear CheckArray

      for (i = 3; i<=5; i++)
      {
         for (j = 0; j<=2; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum4 = sum4 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section four, store values in sum4, and clear CheckArray

      for (i = 3; i<=5; i++)
      {
         for (j = 3; j<=5; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum5 = sum5 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section five, store values in sum5, and clear CheckArray
      
      for (i = 3; i<=5; i++)
      {
         for (j = 6; j<=8; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum6 = sum6 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section six, store values in sum6, and clear CheckArray
      
      for (i = 6; i<=8; i++)
      {
         for (j = 0; j<=2; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum7 = sum7 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section seven, store values in sum7, and clear CheckArray
      
      for (i = 6; i<=8; i++)
      {
         for (j = 3; j<=5; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum8 = sum8 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;
      
      //Check section eight, store values in sum8, and clear CheckArray
      
      for (i = 6; i<=8; i++)
      {
         for (j = 6; j<=8; j++)
         CheckArray[Board[i][j]-1] = 1;
      }
         for (i = 0; i<9; i++)
				{
						sum9 = sum9 + CheckArray[i];		
				}   
      
      for (i = 0; i<9; i++)
      CheckArray[i]=0;     
      
      //Check section nine, store values in sum9, and clear CheckArray                                            
         
      if (sum1 == 9 && sum2 == 9 && sum3 == 9 && sum4 == 9 && sum5 == 9 && sum6 == 9 && sum7 == 9 && sum8 == 9 && sum9 == 9)
      {
         return true;
      }
      else
      {
         return false; 
      }    
   }
// end SectionIsCorrect   

}