/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Search {
    public int minimum(int[] arrayData) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] < minValue) {
                minValue = arrayData[i];
            }
        }
        return minValue;
    }

    public int maxinum(int[] arrayData) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arrayData.length; i++) {
            if (maxValue < arrayData[i]) {
                maxValue = arrayData[i];
            }
        }
        return maxValue;
    }
}
