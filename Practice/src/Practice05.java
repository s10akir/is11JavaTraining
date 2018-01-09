import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice05 {
    public static void main(String[] args) {
        List<Integer> tribo = new ArrayList<>();


        Collections.addAll(tribo, 0, 0, 1);
        while (true) {
            int tmp;
            int len = tribo.size() - 1;
            tmp = tribo.get(len) + tribo.get(len - 1) + tribo.get(len - 2);

            if (tmp < 1000) {
                tribo.add(tmp);
            } else {
                break;
            }
        }


        for (int i = 0; i < tribo.size(); i++) {
            System.out.print(tribo.get(i));
            if (i < tribo.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
