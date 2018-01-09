/**
 * @author : akira.shinohara
 * @since : 2018/01/09
 * 命名規則と可読性に難あり 要リファクタリング
 */
public class Exam09_03_03 {
    public static void main(String[] args) {
        int value;
        int peoples;
        int cost;    // 一人あたりの額
        int rem;     // 余り

        value = readInt("金額");
        peoples = readInt("人数");

        cost = value / peoples;
        rem = value % peoples;

        System.out.println((peoples - rem) + "名: " + cost + "円");
        if (0 < rem) {
            System.out.println((rem) + "名: " + (cost + 1) + "円");
        }
    }

    /**
     * 入力値のチェックをしつつintを返す
     */
    private static int readInt(String name) {
        KeyIn ki = new KeyIn();
        int tmp;

        while (true) {
            String buf = ki.readString(name + "を入力してください");
            try {
                tmp = Integer.parseInt(buf);
            } catch (NumberFormatException err) {
                System.err.println(name + "に整数以外が入力されました");
                continue;
            }

            if (!(0 < tmp)) {
                System.err.println(name + "に0以下の値が入力されました");
                continue;
            }
            break;
        }

        return tmp;
    }
}
