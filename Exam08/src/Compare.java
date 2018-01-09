/**
 * @author : akira.shinohara
 * @since : 17/12/12
 *
 * パッケージ外から呼び出すことを想定していないため修飾子を指定していません。
 */
class Compare {
    int equal(int i, int j) {
        if (i == j) {
            return 1;
        } else {
            return 0;
        }
    }
}
