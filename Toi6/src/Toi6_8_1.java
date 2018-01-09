/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Toi6_8_1 {
    public static void main(String[] args) {
        int[][] arrayTensu = {
                {95, 70, 85, 85},
                {90, 70, 80, 90},
                {90, 65, 80, 80}
        };
        int[] gokei = new int[arrayTensu.length];

        for (int i = 0; i < gokei.length; i ++) {
            gokei[i] = 0;
            for (int j = 0; j < arrayTensu[i].length; j++) {
                gokei[i] += arrayTensu[i][j];
            }
        }
        for (int i = 0; i < gokei.length; i++) {
            System.out.println(gokei[i]);
        }
    }
}
