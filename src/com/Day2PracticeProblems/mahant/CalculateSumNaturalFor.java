package com.Day2PracticeProblems.mahant;
//Java Program to calculate the sum of natural numbers using for loop
import java.util.Scanner;

public class CalculateSumNaturalFor
{
     
  // Driver method
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      int num; //Declare the number
      System.out.println("Enter the number");
      num=sc.nextInt();    //Initialize the number
      
      int sum=0;   //Variable to calculate the sum
      for(int i=1; i<=num;i++)
      {
          sum=sum+i;
      }
      System.out.println("The sum of natural numbers is "+sum);
   }
}