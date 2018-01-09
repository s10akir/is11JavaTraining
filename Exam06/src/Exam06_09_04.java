/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Exam06_09_04 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] h = {12, 13, 17, 19, 21, 25, 33, 34, 36};
        int lo = 0;
        int hi = h.length - 1;
        int found = -1;

        int tk = ki.readInt("探索する値を入力してください");
        while (lo <= hi && found == -1) { // breakするので右の式は不要だがフローチャートに乗っ取り残す
            int i = (lo + hi) / 2;
            if (h[i] < tk) {
                lo = i + 1;
            } else if (h[i] == tk) {
                found = 1;
                break; // 見つかり次第breakしたほうが早い
            } else {
                hi = i - 1;
            }
        }

        String result = 0 <= found ? "あり" : "なし";
        System.out.println(result);
    }
}
