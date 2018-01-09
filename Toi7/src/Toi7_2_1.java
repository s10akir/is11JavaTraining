/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Toi7_2_1 {
    public static void main(String[] args) {
        final int STOPPER = -1;
        int[] arrayScore1 = {256, 164, 205, 126, 187, -1, 82, 108, -1, 175};
        int[] arrayScore2 = new int[arrayScore1.length];

        for (int i = 0; i < arrayScore1.length; i++) {
            arrayScore2[i] = arrayScore1[i];
            if (arrayScore2[i] == STOPPER) { break; }
        }

        for (int i = 0; i < arrayScore2.length; i++) {
            System.out.print(arrayScore2[i] + " ");
            if (arrayScore2[i] == STOPPER) { break; }
        }
        System.out.println();
    }
}
