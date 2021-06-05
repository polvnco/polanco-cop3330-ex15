/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;

import java.util.Scanner;

public class ex15
{
    public static void main( String[] args )
    {
        System.out.print( "What is the password? " );
        Scanner pw = new Scanner(System.in);
        String password = "abc$123";
        String masterPassword = pw.nextLine();

        if (!masterPassword.equals(password) ){
            System.out.println("I don't know you.");
        }
        else {
            System.out.println("Welcome!");
        }

    }
}
