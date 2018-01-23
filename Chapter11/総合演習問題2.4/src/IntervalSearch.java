/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class IntervalSearch {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] arrayWeight = { 50,  75, 100, 150, 200, 250, 500, 750, 1000, 2000, 3000, 4000};
        int[] arrayValue  = {120, 140, 160, 200, 240, 270, 390, 580,  700,  950, 1150, 1350};
        int i;
        int weight;

        /* 処理部 */
        weight = ki.readInt("重量:");

        if (arrayWeight[arrayWeight.length - 1] < weight) {
            System.err.println("取り扱いできません");
            System.exit(1);
        } else {
            i = 0;
            while (true)
            if (weight <= arrayWeight[i]) {
                break;
            } else {
                i++;
            }
            System.out.println(arrayValue[i] + "円");
        }
    }
}
