/**
 * @author : akira.shinohara
 * @since : 17/11/21
 */
public class Toi7_7_1 {
    public static void main(String[] args) {
        final int STOPPER = -1;
        int[] arrayScore1 = {
                256, 164, 205, 126, 187, -1, 82, 108, -1, 175
        };
        int[] arrayScore2 = new int[arrayScore1.length];
        int i = 0;

        do {
            arrayScore2[i] = arrayScore1[i];
        } while (arrayScore1[i++] != STOPPER);

        i = 0;
        do {
            System.out.print(arrayScore2[i] + " ");
        } while (arrayScore2[i++] != STOPPER);
        System.out.println();
    }
}
