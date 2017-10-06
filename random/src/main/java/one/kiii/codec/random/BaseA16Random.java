package one.kiii.codec.random;

import one.kii.codec.BaseA16Encoder;

import java.util.Random;

public class BaseA16Random {


    private static String[] PADDING = {"A", "AA", "AAA", "AAAA", "AAAAA", "AAAAAA", "AAAAAAA"};
    private static int LENGTH_4 = 4;
    private Random random = new Random();

    public static void main(String[] args) {
        System.out.println(new BaseA16Random().next4());
    }

    private static String padding(int length, String random) {
        if (random.length() == length) {
            return random;
        }
        int delta = length - random.length();
        return PADDING[delta - 1] + random;
    }

    private static int bound(int length) {
        return 1 << (1 << length);
    }

    public String next4() {
        int v = random.nextInt(bound(LENGTH_4));
        return padding(LENGTH_4, BaseA16Encoder.encode(v));
    }

}
