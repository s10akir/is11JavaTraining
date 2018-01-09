/**
 * @author : akira.shinohara
 * @since : 17/12/19
 * 教科書 p235
 */
public class Toi8_4 {
    public static void main(String[] args) {
        int gokei;
        int a1, a2;

        Calc cl = new Calc();

        a1 = Integer.parseInt(args[0]);
        a2 = Integer.parseInt(args[1]);

        gokei = cl.add(a1, a2);
        System.out.println(a1 + " + " + a2 + " = " + gokei);

        gokei = cl.sub(a1, a2);
        System.out.println(a1 + " - " + a2 + " = " + gokei);
    }
}
