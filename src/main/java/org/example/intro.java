package org.example;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ?");

        String name = input.nextLine();
        System.out.println("Welcome to the Java course, " + name);

        // Output Text:
        /*
        Multiple tine comment
         */

        System.out.println("Text with a \"quote\"");
        System.out.println("The project is in C:\\Users");
        System.out.println("Text with blank space:         And other text after");
        System.out.println("This is text \n on \n multiple \n lines");
    }
}
