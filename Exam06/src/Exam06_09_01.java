/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Exam06_09_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] h = {4, 1, 6, 8, 3, 2, 9, 7, 5};
        int i = 0;
        String result = "なし";

        int tk = ki.readInt("探索する値を入力してください");
        while (i < 9 && result.equals("なし")) { // breakしているので右の式は不要だがフローチャートに乗っ取り残す
            if (h[i] == tk) {
                result = "あり";
                break; // 見つかり次第breakしたほうが早い
            } else {
                i += 1;
            }
        }

        System.out.println(result);
    }
}
