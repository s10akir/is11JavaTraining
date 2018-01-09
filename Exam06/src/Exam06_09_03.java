/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Exam06_09_03 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] h = {4, 1, 6, 8, 3, 2, 9, 7, 5, 0};
        int i = 0;
        String result = "なし";

        int tk = ki.readInt("探索する値を入力してください");
        h[9] = tk;
        while (true) {
            if (h[i] != tk) {
                i += 1;
            } else {
                break;
            }
        }

        if (i < 9) result = "あり";
        System.out.println(result);
    }
}