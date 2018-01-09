import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/21
 */
public class Practice02 {
    private static int[] a = {65, 37, 48, 92, 37, 54, 20, 65, 37, 81};
    private static int[] b = new int[10];
    private static int n = a.length;

    public static void main(String[] args) {
        ranking1(a, n, b);

        for (int i = 0; i < n; i++) {
            System.out.println("[" + i + "]: " + a[i] + "点 " + b[i] + "位");
        }
    }

    private static void ranking1(int[] a, int n, int[] b) {
        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    b[i] = b[i] + 1;
                } else {
                    b[j] = b[j] + 1;
                }
            }
        }
    }
}
