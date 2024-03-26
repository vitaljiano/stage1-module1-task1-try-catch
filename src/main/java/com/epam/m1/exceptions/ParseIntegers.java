package com.epam.m1.exceptions;

import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.nio.charset.StandardCharsets.*;

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
                justWords = String.format("%s" + " " + "%s",justWords, next);
                int number = Integer.parseInt(next);
                sum = sum + number;

            } catch (NumberFormatException formatException) {
                System.out.println(formatException.toString());
            }
            logger.log(Level.INFO, String.format("Sum is " + "%s",sum));
            logger.log(Level.INFO, String.format("Just words:" + "%s", justWords));
        }
    }
}

