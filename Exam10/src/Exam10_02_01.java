import java.io.*;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_02_01 {
    public static void main(String[] args) throws IOException {
        int            i    = 0;
        String         buf;
        String         fileName = System.getProperty("user.home") + "/";  // Linux環境なのでパーミッションのある/home/user/下に吐き出します
        boolean        flag = true;
        BufferedWriter bw   = null;
        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));

        // ファイル名の設定
        System.out.print("ファイル名を入力してください > ");
        fileName += br.readLine() + ".txt";

        // ファイル作成〜入力処理
        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            while (flag) {
                System.out.print((i + 1) + ":");
                buf = br.readLine();
                if (buf.length() != 0) {
                    bw.write(buf);
                    bw.newLine();
                    i++;
                } else {
                    flag = false;
                }
            }
            System.out.println(i + "件のデータを" + fileName + "に書き込みました");
        } catch (IOException e) {
            System.err.println("ファイルアクセスエラー:" + e);
        } finally {
            try {
                bw.close();  // そもそもファイルが開けなかったときにぬるぽりそう
            } catch (IOException e) {
                System.err.println("ファイルクローズエラー:" + e);
            }
        }
    }
}
