/**
 * @author : akira.shinohara
 * @since : 17/12/05
 */
public class Exam08_03_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Tax tax = new Tax();
        int get, price;

        get = ki.readInt("価格を入力してください");
        price = tax.include(get);

        if (price > -1) {
            System.out.println("税込価格は " + price + " 円です");
        } else {
            System.out.println("マイナスの値が入力されました");
        }
    }
}
