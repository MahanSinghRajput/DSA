package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 534.12345f;
        float b = 534.12745f;
        System.out.printf("%.2f",a);
        System.out.println();
        System.out.printf("%.2f",b); // it rounds off the data
        /*
            There are many format specifiers (Placeholders) we can use. Here are some common ones:

            %c - Character
            %d - Decimal number (base 10)
            %e - Exponential floating-point number
            %f - Floating-point number
            %i - Integer (base 10)
            %o - Octal number (base 8)
            %s - String
            %u - Unsigned decimal (integer) number
            %x - Hexadecimal number (base 16)
            %t - Date/time
            %n - Newline
         */
    }
}
