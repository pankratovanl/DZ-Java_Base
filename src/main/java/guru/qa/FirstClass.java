package guru.qa;

public class FirstClass {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30, d = 35;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);

        System.out.println(d % c);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(c--);
        System.out.println(--c);

        System.out.println(b > c);
        System.out.println(a < c);
        System.out.println(a + b >= d);
        System.out.println(d - a <= c);
        System.out.println((a + b) == c);
        System.out.println(a != b);

        System.out.println(a += b);
        System.out.println(c -= a);

        System.out.println(false & true | true);
        System.out.println(true | false);
        System.out.println(c | b);
        System.out.println(a & d);

        byte iByte = 120;
        short iShort = -32_768;
        long iLong = 100L;
        float iFloat = 3.12F;
        double iDouble = 17.25D;
        char iChar = '!';
        String iString = "Logitech's keyboard";

        System.out.println(a + iByte);
        System.out.println(iShort - b);
        System.out.println(iString + " " + "is the best" + '!');
    }
}