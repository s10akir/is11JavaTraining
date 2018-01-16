import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ここはジャパリパーク！わたしはサーバルキャットのサーバルだよ！
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_03_03 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        String fileName;
        boolean flag = true;
        int i = 0;

        System.out.print("ファイル名を入力してください > ");
        fileName = br.readLine();

        try {
            br = new BufferedReader(new FileReader(fileName));
            while (flag) {
                i++;
                buf = br.readLine();
                if (buf != null) {
                    System.out.println(i + ": " + buf);
                } else {
                    flag = false;
                }
            }
        } catch (IOException err) {
            System.err.println(fileName + "は存在しません");
        }
    }
}
