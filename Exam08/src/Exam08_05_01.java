/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Exam08_05_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Compare cp = new Compare();
        int[] arrayInt = new int[3];
        int maxInt;

        for (int i = 0; i < 3; i ++) {
            arrayInt[i] = ki.readInt("整数 " + (i + 1) + " を入力してください");
        }

        maxInt = cp.max(arrayInt);
        System.out.println("最大値は " + maxInt + " です");
    }
}
