/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review07 {
    public static void main(String[] args) {
        int i, j;


        for (i = 1; i < 10; i++) {
            System.out.print(i);

            for (j = 2; j < 10; j++) {
                System.out.print("\t" + (i * j));
            }

            System.out.println("");
        }
    }
}
