/**
 *  Java program to show time of execution a program.
 */

package com.mytime;

import java.io.IOException;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) throws IOException {

        // Creating starting time variable.
        long startTime = System.nanoTime();

        // Printing statements to console.
        System.out.println("Hello print.");
        System.err.println("Hello error.");
        char c = (char) System.in.read();
        System.out.println(c);

        // Creating end of time of a program.
        long endTime = System.nanoTime();

        // Printing taken time in ms.
        System.out.println("Taken time in ms: " + (endTime = startTime));

    }
}