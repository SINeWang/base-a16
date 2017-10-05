package one.kii.codec.base16;


public class Encoder {


    private static final char[] CHARACTERS = {
            'A', 'C', 'E', 'F', 'G', 'H', 'J', 'K', 'P', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'
    };


    public static String encode(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number parameter can not be negative.");
        }

        StringBuilder buffer = new StringBuilder();
        do {
            int remainder = (int) (number % 16);
            buffer.insert(0, CHARACTERS[remainder]);
            number = number >> 5;
        } while (number > 0);

        return buffer.toString();
    }



}
