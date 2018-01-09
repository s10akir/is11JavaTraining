/**
 * @author : akira.shinohara
 * @since : 2018/01/09
 */
public class Exam09_03_02 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();

        String buf = ki.readString("整数を入力してください");
        try {
            Integer.parseInt(buf);
        } catch (NumberFormatException err) {
            System.err.println("整数以外が入力されました");
            System.exit(1);
        }
        System.out.println("整数が入力されました");
    }
}
