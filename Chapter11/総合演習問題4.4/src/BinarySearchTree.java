/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        final int END_OF_TREE = -1;
        int[] arrayBango = {5, 2, 7, 9, 1, 3, 0, 0,};
        int[] arrayTensu = {50, 20, 70, 90, 10, 30, 0, 0};
        int[] arrayLeft = {1, 4, -1, -1, -1, -1, -1, -1};
        int[] arrayRight = {2, 5, 3, -1, -1, -1, -1, -1};
        int pt = 0;
        int idx;
        int num;
        KeyIn ki = new KeyIn();

        while (0 != (num = ki.readInt("学籍番号(終了=0):"))) {

            /* 二分探索木の探索 */
            idx = pt;
            while ((idx != END_OF_TREE) && (arrayBango[idx] != num)) {
                if (arrayBango[idx] < num) {
                    idx = arrayRight[idx];
                } else {
                    idx = arrayLeft[idx];
                }
            }

            if (idx != END_OF_TREE) {
                System.out.println(arrayTensu[idx]);
            } else {
                System.out.println("見つかりませんでした");
            }
        }
    }
}
