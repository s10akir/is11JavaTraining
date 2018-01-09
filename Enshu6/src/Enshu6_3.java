import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Enshu6_3 {
    public static void main(String[] args) {
        int[] arrayNyujo = {856, 861, 862, 854, 864, 846, 848};

        int min = 10000;
        for (int i = 1; i < arrayNyujo.length; i++) {
            if (arrayNyujo[i] < min) {
                min = arrayNyujo[i];
            }
        }
        System.out.println("最小=" + min);
    }
}
