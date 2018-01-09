import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Exam06_09_05 {
    public static void main(String[] args) {
        int[] a = {5, 2, 7, 1, 4};
        int n = a.length;

        System.out.println("ソート前> " + Arrays.toString(a));

        while (1 < n) {
            int i = 0;
            while (i < n -1) {
                if (a[i + 1] < a[i]) {
                    int tmp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = tmp;
                }
                i++;
            }
            n--;
        }

        System.out.println("ソート後> " + Arrays.toString(a));
    }
}
