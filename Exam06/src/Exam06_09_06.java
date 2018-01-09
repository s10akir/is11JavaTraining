import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/21
 */
public class Exam06_09_06 {
    public static void main(String[] args) {
        int[] a = {56, 9, 62, 37, 25, 68, 43};

        a = selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }


    private static int[] selectionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1;j++) {
                if (a[i] > a[j]) {
                    int work = a[i];
                    a[i] = a[j];
                    a[j] = work;
                }
            }
        }

        return a;
    }
}
