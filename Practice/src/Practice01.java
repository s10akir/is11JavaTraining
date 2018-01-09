import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/21
 */
public class Practice01 {
    public static void main(String[] args) {
        int[] s ={4, 8, 5, 1, 7};
        int c = 0;

        System.out.println("ソート前 > " + Arrays.toString(s));

        while (c < s.length - 1) {
            int tmp = s[c + 1]; // 次に挿入する要素
            int p = 0;

            // 挿入位置を探しに行く
            for (int i = 0; i <= c; i++) {
                if (s[i] < tmp) {
                    p++;
                }
            }

            // 挿入位置〜挿入する要素の位置 - 1 の要素を後ろにずらす（挿入する場所を作る）
            for (int i = c; p <= i; i--) {
                s[i + 1] = s[i];
            }

            s[p] = tmp; // 挿入
            c++;
        }

        System.out.println("ソート後 > " + Arrays.toString(s));
    }
}
