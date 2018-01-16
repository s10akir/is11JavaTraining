import java.io.*;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_03_01 {
    public static void main(String[] args) {
        String         buf;
        BufferedReader br       = null;
        int            i        = 0;
        boolean        flag     = true;
        String         fileName = "/abc.txt";  // Linuxなので '/' がルートディレクトリになります

        try {
//            br = new BufferedReader(new FileReader(args[0]));  // 教科書通りの記述
            br = new BufferedReader(new FileReader(fileName));  // 授業用
            while (flag) {
                buf = br.readLine();
                if (buf != null) {
                    i++;
                    System.out.println(i + ": " +  buf);
                } else {
                    flag = false;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {  // 教科書通りの記述
            System.out.println("ファイル名を指定してください");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("ファイルアクセスエラー: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.err.println("ファイルクローズエラー: " + e);
            } catch (NullPointerException e) {
                // 握りつぶす
            }
        }
    }
}
