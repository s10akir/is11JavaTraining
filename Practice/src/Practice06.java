import java.util.Random;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice06 {
    public static void main(String[] args) {
        Random rnd = new Random();


        int result = rnd.nextInt(10000);
        while (result < 1000) { // 整形
            result *= 10;
        }

        System.out.println(result);
    }
}
