import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice04 {
    public static void main(String[] args) {
        List<Integer> fibo = new ArrayList<>();


        Collections.addAll(fibo, 0, 1);
        while (true) {
            int tmp;
            int len = fibo.size() - 1;
            tmp = fibo.get(len) + fibo.get(len - 1);

            if (tmp < 1000) {
                fibo.add(tmp);
            } else {
                break;
            }
        }


        for (int i = 0; i < fibo.size(); i++) {
            System.out.print(fibo.get(i));
            if (i < fibo.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
