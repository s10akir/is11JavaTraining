/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Toi6_6_5 {
    public static void main(String[] args) {
        String[] arrayHyoka = {"優", "良", "可", "不可"};
        int[] arrayNinzu = {23, 10, 5, 2};
        double[] arrayWariai = new double[4];
        int gokei = 0;

        for (int idx = 0; idx < arrayHyoka.length; idx++) {
            gokei += arrayNinzu[idx];
        }
        for (int idx =0; idx < arrayHyoka.length;idx++) {
            arrayWariai[idx] = arrayNinzu[idx] * 100.0 / gokei;
        }
        for (int idx = 0; idx < arrayHyoka.length; idx++) {
            System.out.print(arrayHyoka[idx] + "\t");
            System.out.println(arrayWariai[idx] + "%");
        }
    }
}
