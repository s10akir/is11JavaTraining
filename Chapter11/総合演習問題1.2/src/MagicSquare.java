/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class MagicSquare {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();                                  // キーボード入力クラス
        int degree;                                              // 何行何列の魔法陣か指定する
        int i;                                                   // インデックス
        int j;                                                   // インデックス

        /* 魔法陣の次数入力 */
        degree = ki.readInt("奇数の魔法陣");

        if (degree < 0 || degree % 2 == 0) {  // 1より小さい数と偶数はエラー
            System.err.println("正の奇数を入力してください");
        } else {
            /* 魔法陣作成 */
            int arrayMagicSquare[][] = new int[degree][degree];  // 配列魔法陣の生成
            i = 0;                                               // ルール (a) 「スタート位置」
            j = degree / 2;                                      // (最上位行の中央)
            arrayMagicSquare[i][j] = 1;
            int k  = 2;
            while (k <= degree * degree) {                       // 最終値は次数の2乗
                if (k % degree == 1) {                           // ルール (d), (f) 「下へ」
                    i++;                                         // (次数の倍数は「下」になる)
                } else {
                    if (i == 0) {                                // ルール (b) 「配列の上側」
                        i = degree - 1;                          // (右列の最下位行へ)
                        j++;
                    } else {
                        if (j == degree - 1) {                   // ルール (c) 「配列の右」
                            i--;                                 // (右側の最下位行へ)
                            j = 0;
                        } else {
                            i--;                                 // ルール (e) 「右上」
                            j++;                                 // (右斜め上の列へ)
                        }
                    }
                }
                arrayMagicSquare[i][j] = k;
                k++;
            }
            /* 魔法陣の表示 */
            for (int[] elei: arrayMagicSquare) {
                for (int elej: elei) {
                    System.out.print(elej + "\t");
                }
                System.out.println();
            }
        }
    }
}
