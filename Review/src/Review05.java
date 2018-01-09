/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review05 {
    public static void main(String[] args) {
        int i, j;
        KeyIn ki = new KeyIn();

        System.out.println("何回ループしますか");
        i = ki.readInt();
        j = i + 1;

        while (i > 0) {
            System.out.println((j - i) + " 回目のループです");
            i--;
        }

    }
}
