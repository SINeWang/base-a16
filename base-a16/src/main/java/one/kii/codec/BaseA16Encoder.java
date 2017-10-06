package one.kii.codec;


public class BaseA16Encoder {


    private static final char[] CHARACTERS = {
            'A', 'C', 'E', 'F', 'H', 'J', 'K', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'
    };


    public static String encode(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number parameter can not be negative.");
        }

        StringBuilder buffer = new StringBuilder();
        do {
            int remainder = (int) (number % 16);
            buffer.insert(0, CHARACTERS[remainder]);
            number = number >> 4;
        } while (number > 0);

        return buffer.toString();
    }


}
