package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {
    static Logger logger = Logger.getLogger("");
    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        while (words.hasNext()) {
            String next = words.next();
            try {

                int number = Integer.parseInt(next);
                sum = sum + number;

            } catch (NumberFormatException formatException) {
                justWords = String.format("%s" + " " + "%s",justWords, next);
                logger.log(Level.INFO, formatException.toString());
            }

            if (logger.isLoggable(logger.getLevel())) {
                logger.log(Level.INFO, String.format("Sum is " + "%s", sum));
                logger.log(Level.INFO, String.format("Just words: " + "%s", justWords));
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words:" + justWords);
    }
}

