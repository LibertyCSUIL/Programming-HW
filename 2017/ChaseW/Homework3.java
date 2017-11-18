/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg3;

import java.util.Scanner;
public class Homework3 {

    public static void main(String[] args) {
        System.out.println("the password is 'Lennies mouse' ");
        System.out.println("whats the password?");
        System.out.print(":$ ");
        Scanner pass = new Scanner(System.in);
        String pass0 = pass.nextLine();
        if(pass0.equals("Lennies mouse")) {
            System.out.println("Correct password!");    
        } else {
            System.out.println("Invalid password!");
        }
    }
    
}
