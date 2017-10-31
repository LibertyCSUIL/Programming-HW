/* 
Programming Homework 2: Input

Objective:
Write a program that takes two numbers from user input
then outputs the product of both numbers.

*/

import java.util.Scanner;

public class Input
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int In = sc.nextInt();
      int In2 = sc.nextInt();
      System.out.println(In*In2);
   }
}
