/**
 * 前期の授業中に一度提出しましたが使いまわさず0から書き直しました。
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class Ranking {
    public static void main(String[] args) {
        int[] arrayMark = {90, 75, 100, 60, 95, 70, 85, 80, 90, 80};  // 点数
        int[] arrayRank = { 1,  1,   1,  1,  1,  1,  1,  1,  1,  1};  // 順位表
        int i;
        int j;

        /* 順位付けループ */
        i = 0;
        while (i < arrayMark.length) {
            j = 0;
            while(j < arrayMark.length) {
                if (arrayMark[i] < arrayMark[j]) {
                    arrayRank[i]++;
                }
                j++;
            }
            i++;
        }

        /* 順位付け後の配列の表示 */
        i = 0;
        while (i < arrayMark.length) {
            System.out.println((i + 1) + "人目\t"
                + arrayMark[i] + "点\t"
                + arrayRank[i] + "位");
            i++;
        }
    }
}
