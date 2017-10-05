package one.kii.codec.base16;

public class Decoder {


    public static long decode(char digit) {
        switch (digit) {
            case 'A':
            case 'a':
                return 0;

            case 'C':
            case 'c':
                return 1;

            case 'E':
            case 'e':
                return 2;

            case 'F':
            case 'f':
                return 3;

            case 'G':
            case 'g':
                return 4;

            case 'H':
            case 'h':
                return 5;

            case 'J':
            case 'j':
                return 6;

            case 'K':
            case 'k':
                return 7;

            case 'P':
            case 'p':
                return 8;


            case 'R':
            case 'r':
                return 9;

            case 'S':
            case 's':
                return 10;

            case 'T':
            case 't':
                return 11;

            case 'W':
            case 'w':
                return 12;

            case 'X':
            case 'x':
                return 13;

            case 'Y':
            case 'y':
                return 14;

            case 'Z':
            case 'z':
                return 15;

            default:
                return -1;
        }
    }
}
