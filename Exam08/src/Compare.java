/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Compare {
    public int max(int[] arrayInt) {
        int minInt = Integer.MIN_VALUE;

        for (int ai :arrayInt) {
            if (minInt < ai) {
                minInt = ai;
            }
        }

        return minInt;
    }
}
