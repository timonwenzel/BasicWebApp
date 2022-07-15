package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.Locale;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "timon";
        } else if (query.contains("plus")) {
            String numbersOnly = query.replaceAll("[^\\d]", " ");
            numbersOnly = numbersOnly.trim();
            numbersOnly = numbersOnly.replaceAll(" +", " ");

            String[] numbersStr = numbersOnly.split(" ");
            int[] numbersInt = new int[2];
            int counter = 0;

            for (String number : numbersStr) {
                numbersInt[counter] = Integer.parseInt(number);
                counter++;
            }

            int result = 0;

            for (int number : numbersInt) {
                result = +number;
            }

            return String.valueOf(result);
        } else if (query.contains("largest")){
            String numbersOnly = query.replaceAll("[^\\d]", " ");
            numbersOnly = numbersOnly.trim();
            numbersOnly = numbersOnly.replaceAll(" +", " ");

            String[] numbersStr = numbersOnly.split(" ");
            int[] numbersInt = new int[2];
            int counter = 0;

            for (String number : numbersStr) {
                numbersInt[counter] = Integer.parseInt(number);
                counter++;
            }

            int result = 0;

            for (int number : numbersInt) {
                if (result < number) {
                    result = number;
                }
            }

            return String.valueOf(result);
        } else if (query.contains("multiplied")){
            String numbersOnly = query.replaceAll("[^\\d]", " ");
            numbersOnly = numbersOnly.trim();
            numbersOnly = numbersOnly.replaceAll(" +", " ");

            String[] numbersStr = numbersOnly.split(" ");
            int[] numbersInt = new int[2];
            int counter = 0;

            for (String number : numbersStr) {
                numbersInt[counter] = Integer.parseInt(number);
                counter++;
            }

            int result = 0;

            for (int number : numbersInt) {
                if (result == 0) {
                    result = number;
                } else {
                    result = result * number;
                }
            }

            return String.valueOf(result);
        } else { // TODO extend the programm here
            return "";
        }
    }
}
