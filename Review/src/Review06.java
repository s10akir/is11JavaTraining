/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review06 {
    public static void main(String[] args) {
        int i;
        KeyIn ki = new KeyIn();

        System.out.println("何回ループしますか");
        i = ki.readInt();

        for (int j = 1; j <= i ; j++) {
            System.out.println(j + " 回目のループです");
        }
    }
}
