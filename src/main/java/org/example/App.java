package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is the quote? " );
        String quote = sc.nextLine();
        System.out.print("Who said it? ");
        String speaker = sc.nextLine();
        System.out.println(speaker + " says, \"" + quote + "\"" );
    }
}
