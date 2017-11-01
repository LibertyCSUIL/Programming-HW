/* 
Programming Homework 2: Input
Objective:
Write a program that takes two numbers from user input
then outputs the product of both numbers.
*/

import java.util.Scanner;

public class Input {
   public static void main (String[] args) {
       System.out.println("gimme number");
       Scanner num1 = new Scanner(System.in);
       double first = num1.nextDouble(); 
       System.out.println("next number");
       Scanner num2 = new Scanner(System.in);
       double second = num2.nextDouble();
       System.out.print (first*second); 
   
   
   }
}