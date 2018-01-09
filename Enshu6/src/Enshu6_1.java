import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 17/11/14
 */
public class Enshu6_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayKinshu = {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1};
        int[] arrayMaisu = new int[10];

        System.out.print("金額>");
        int kingaku = Integer.parseInt(br.readLine());

        for (int i = 0; i < arrayKinshu.length; i++) {
            int maisu = kingaku / arrayKinshu[i];
            if (maisu > 0) {
                arrayMaisu[i] = maisu;
                kingaku %= arrayKinshu[i];
            }
        }
        for (int i = 0; i < arrayKinshu.length; i++) {
            System.out.println(arrayKinshu[i] + "\t" + arrayMaisu[i]);
        }
    }
}
