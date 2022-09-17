package com.Day2PracticeProblems.mahant;
//Write a Program to reverse the integer number
public class ReverseNumberFor   
{  
public static void main(String[] args)   
{  
int number = 123456, reverse = 0;  
//we have not mentioned the initialization part of the for loop  
for( ;number != 0; number=number/10)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  