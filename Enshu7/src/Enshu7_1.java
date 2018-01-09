import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Enshu7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hitNumber;
        int number;
        int cnt = 1;


        hitNumber = (int)(Math.random() * 100);
        System.out.println("数字あてゲーム(0~99までの数字です)");
        System.out.println("何回で当てられるか挑戦してください");

        while (true) {
            System.out.print("数:>");
            number = Integer.parseInt(br.readLine());

            if (hitNumber < number) {
                System.out.println(number + "より小さい値です");
            } else if (number < hitNumber) {
                System.out.println(number + "より大きい値です");
            } else {
                System.out.println(number + "で当たりです (" + cnt + "回目)");
                break;
            }

            cnt++;
        }
    }
}
