/**
 * @author : akira.shinohara
 * @since : 17/12/05
 */
public class Exam08_02_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int get, abs;

        get = ki.readInt("整数を入力してください");
        abs = Math.abs(get);

        System.out.println("絶対値は " + abs + " です");
    }
}
