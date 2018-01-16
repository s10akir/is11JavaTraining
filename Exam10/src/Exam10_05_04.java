import java.io.*;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_05_04 {
    public static void main(String[] args) throws IOException{
        File file;
        String path;
        String fileName;
        String dirName = System.getProperty("user.home") + "/Program/Exam10/"; // Linuxなのでパーミッションのある/home/user下
        String confirm;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ファイル名を入力してください > ");
        fileName = br.readLine();
        file = new File(dirName + fileName + ".txt");
        path = file.getAbsolutePath();

        try {
            if (file.createNewFile()) {
                System.out.println(path + " を作成しました");
            } else {
                System.err.println(path + " はすでに存在しています");

                System.out.println("上書き保存しますか？ ( y / n )");
                confirm = br.readLine();
                if (confirm.equals("y")) {
                    file.delete();
                    file.createNewFile();
                    System.out.println("上書き保存しました");
                } else {  // 不正な入力はガン無視
                    System.out.println("ファイル作成を中止しました");
                }
            }
        } catch (IOException err) {
            System.err.println(err);
        }
    }
}
