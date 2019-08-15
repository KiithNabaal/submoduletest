package jsubmodule;

public class Library {
    /**
     * Prints the string to standard out
     * @param stringToPrint - The string to log to standard out
     */
    public void print(final String stringToPrint) {
        System.out.println(stringToPrint);
    }

    /**
     * Converts the number to a string
     * @param number - The number to convert to a string
     * @return The number as a string
     */
    public String numberToString(final int number) {
        return String.valueOf(number);
    }

    /**
     * Attempts to convert a given string to its int form. If it cannot
     * convert (the input is a letter), then it throws an Exception.
     *
     * @param number - The string to convert to an int
     * @return The string as an int
     */
    public int stringToNumber(final String number) throws Exception {
        return Integer.parseInt(number);
    }
}