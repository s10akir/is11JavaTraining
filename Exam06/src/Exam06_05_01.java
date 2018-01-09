/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Exam06_05_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int[] num = new int[4];
        int len;
        int sum = 0;
        double avg;

        len = num.length;

        for (int i = 0; i < len; i++) {
            num[i] = ki.readInt("整数 " + (i + 1) + " を入力してください");
        }

        for (int n: num) {
            sum += n;
        }


        avg = (double)sum / len;
        System.out.println("平均値は " + avg + "です");
    }
}
