import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_03_02 {
    public static void main(String[] args){
        int i = 0;
        String         buf;
        String         lineNum;
        String         fileName = "src/Exam10_03_01.java";
        boolean        flag     = true;
        BufferedReader br       = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            while (flag) {
                i++;
                lineNum = i < 10 ? "0" + i : String.valueOf(i); // ガタつくのが嫌なので整形
                buf = br.readLine();
                if (buf != null) {
                    System.out.println(lineNum + ": " + buf);
                } else {
                    flag = false;
                }
            }
        } catch (IOException err) {
            System.err.println("ファイルアクセスエラー: " + err);
            System.exit(1);
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException | NullPointerException err) {
                System.err.println("ファイルクローズエラー: " + err);
            }
        }
    }
}
