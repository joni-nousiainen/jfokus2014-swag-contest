package info.joninousiainen.examples;

import java.util.LinkedList;
import java.util.List;

public class Jfokus2014SwagContest {
    public List<Integer> removeOddNumbersAndNumberEight(final List<Integer> numbers) {
        final List<Integer> result = new LinkedList<Integer>();

        // As a for loop it might look something like this

        for (Integer number : numbers) {
            if (number.equals(8)) {
                // Skip
            }
            else if (number % 2 != 0) {
                // Skip
            }
            else {
                result.add(number);
            }
        }

        // YOUR TASK: Remove the above for loop and do the same with Stream API
        // & lambdas.

        return result;
    }

    public static interface Encryption {
        String applyEncryptionTo(String input);
    }

    public Encryption getReverseEncryption() {
        // As an anonymous inner class it might look something like this

        return new Encryption() {
            @Override
            public String applyEncryptionTo(String input) {
                return new StringBuilder(input).reverse().toString();
            }
        };

        // YOUR TASK: Remove the inner class and replace it with a lambda
        // expression.
    }
}
