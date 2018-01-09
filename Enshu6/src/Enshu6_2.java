import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Enshu6_2 {
    public static void main(String[] args) {
        int[][] arrayTensu = {
                {95, 70, 85, 85},
                {90, 70, 80, 90},
                {90, 65, 80, 80}
        };
        double[] kamokuHeikin = new double[arrayTensu[0].length];
        int kamokuGokei;

        for (int i = 0; i < kamokuHeikin.length; i++) {
            kamokuGokei = 0;
            for (int[] tensu : arrayTensu) {
                kamokuGokei += tensu[i];
            }
            kamokuHeikin[i] = (double)kamokuGokei / arrayTensu.length;
        }
        Arrays.stream(kamokuHeikin).forEach(System.out::println);
    }
}
