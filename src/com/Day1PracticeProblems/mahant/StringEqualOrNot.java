package com.Day1PracticeProblems.mahant;

//Write a program to check two strings are equal or not. 

import java.util.Scanner;

public class StringEqualOrNot {
  public static void main(String args[]) 
  {
      String str1, str2;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter first String");
      str1 = scanner.nextLine();

      System.out.println("Enter second String");
      str2 = scanner.nextLine();
      // Comparing two input string
      if (str1.equals(str2))
          System.out.print("Equal Strings");
      else
          System.out.print("UnEqual Strings");
  }
}