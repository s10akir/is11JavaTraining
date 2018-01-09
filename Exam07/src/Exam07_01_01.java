import static java.lang.System.exit;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Exam07_01_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int input;
        int i;


        while (true) {
            i = 1;
            input = ki.readInt("整数を入力してください");

            if (input == 0) {
                System.out.println("プログラムを終了します");
                exit(0);
            }

            do {
                if(input % i == 0) { System.out.print(i + ","); }
                i++;
            } while (i < input);

            System.out.println(input);
        }
    }
}
