/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class ListSearch {
    public static void main(String[] args) {
        final int END_OF_LIST = 1;
        KeyIn ki = new KeyIn();
        int[] arrayBango = {20, 40, 10, 0, 30, 0, 0, 0};
        int[] arrayTensu = {22, 44, 11, 0, 33, 0, 0, 0};
        int[] arrayNext = { 4, -1, 0, 5, 1, 6, 7, -1};
        int idx;
        int lip = 2;
        int eip = 3;
        int num;

        /* 番号に0が入力されるまで繰り返す */
        while (0 < (num = ki.readInt("番号(終了=0):"))) {

            /* リスト探索 */
            idx = lip;
            while ((idx != END_OF_LIST) && (num != arrayBango[idx])) {
                idx = arrayNext[idx];
            }

            /* 探索結果の表示 */
            if (idx != END_OF_LIST) {
                System.out.println(arrayTensu[idx]);
            } else {
                System.out.println("見つかりませんでした");
            }
        }
    }
}
