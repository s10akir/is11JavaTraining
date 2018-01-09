/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review04 {
    public static void main(String[] args) {
        int i, j, k;
        double avg;
        KeyIn ki = new KeyIn();

        System.out.println("整数 1 を入力してください");
        i = ki.readInt();

        System.out.println("整数 2 を入力してください");
        j = ki.readInt();

        System.out.println("整数 3 を入力してください");
        k = ki.readInt();

        avg = (double) (i + j + k) / 3;
        System.out.println("平均値は " + avg + " です。");
    }
}
