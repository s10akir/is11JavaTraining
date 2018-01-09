/**
 * @author : akira.shinohara
 * @since : 2018/01/09
 */
public class Exam09_03_01 {
    public static void main(String[] args) {
        int[] num = new int[3];

        for(int i = 0; i <= num.length; i++) {
            try {
                num[i] = i;
            } catch (ArrayIndexOutOfBoundsException err) {
                System.err.println("不正な配列参照が発生しました");
                System.exit(1);
            }
        }
    }
}
