/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class Euclid {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int a, b;
        int div;
        int rem;
        int gcd;
        int lcm;

        a = ki.readInt("a:");
        b = ki.readInt("b:");
        gcd = a;
        div = b;

        while (0 < div) {
            rem = gcd % div;
            gcd = div;
            div = rem;
        }

        lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
