/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Toi6_7_1 {
    public static void main(String[] args) {
        int[] arrayTensu = {80, 75, 85, 95, 90};
        int[] arrayKokugo;

        arrayKokugo = arrayTensu;
        arrayTensu[0] -= arrayKokugo[0];
        arrayKokugo[1] += 25;
        arrayTensu[2] = 100;
        arrayKokugo[3] = 100;
        arrayKokugo[4]++;

        for (int i = 0; i < arrayKokugo.length; i++) {
            System.out.println(i + "\t" + arrayTensu[i]);
        }
    }
}
