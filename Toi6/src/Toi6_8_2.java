/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Toi6_8_2 {
    public static void main(String[] args) {
        int[][] arrayGoban = {
                {0, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 2, 2, 1, 2, 0, 0},
                {1, 0, 2, 2, 2, 2, 2, 2},
                {2, 1, 2, 2, 1, 2, 2, 0},
                {2, 2, 2, 1, 1, 2, 2, 2},
                {1, 2, 2, 1, 1, 2, 2, 2},
                {0, 0, 2, 2, 1, 0, 0, 0},
                {0, 0, 2, 2, 2, 0, 0, 0}
        };
        int shiro = 0;
        int kuro = 0;
        int ishi;
        for (int i = 0; i < arrayGoban.length; i++) {
            for (int j = 0; j < arrayGoban[i].length; j++) {
                ishi = arrayGoban[i][j];
                if (ishi == 1) {
                    shiro++;
                } else if (ishi == 2) {
                    kuro++;
                }
            }
        }
        System.out.println("白=" + shiro);
        System.out.println("黒=" + kuro);
    }
}
