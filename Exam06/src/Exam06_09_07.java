/**
 * @author : akira.shinohara
 * @since : 17/11/21
 */
public class Exam06_09_07 {
    public static void main(String[] args) {
        char[] a = {'2', '7', '4'};

        System.out.println(numChange(a));
    }


    private static int numChange(char[] a) {
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int num = 0;
        for (int i = 0; i < 3; i++) {
            int j = 0;
            while (a[i] > c[j]) {
                j++;
            }
            num = num * 10 + j;
        }

        return num;
    }

}
