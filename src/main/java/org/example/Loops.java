package org.example;

public class Loops {
    public static void main(String[] args) {

        /*

        - For loops
        - While loops
        - Do While loops
        - For - Each loops
         */

        // For loop:
        /*
        for (int i=0; i<3; i++){            // i is a counter or index
            System.out.println(i);          // i <3 is a condition
        }

        // While loop:

        int wl = 0;

        while (wl < 2){
            System.out.println("The initial value of wl is zero");
            // System.out.println(i);
            wl++;
        }
        */

        // For Each loop:

        String [] progLang = {"C++","Java","Python"};
        for (String prog : progLang) {
            System.out.println(prog);
        }

        // Do  While:

        int wl = 0;

        do {
            System.out.println("The initial value of wl is 0");
            wl++;
        } while (wl < 5);

    }
}
