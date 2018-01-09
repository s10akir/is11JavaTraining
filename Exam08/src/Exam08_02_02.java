/**
 * @author : akira.shinohara
 * @since : 17/12/05
 */
public class Exam08_02_02 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int i, j, largest;

        i = ki.readInt("整数1を入力してください");
        j = ki.readInt("整数2を入力してください");
        largest = Math.max(i, j);

        System.out.println(largest + "の方が大きいです");
    }
}
