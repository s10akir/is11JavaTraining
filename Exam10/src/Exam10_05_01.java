import java.io.File;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_05_01 {
    public static void main(String[] args) {
        String dirName = System.getProperty("user.home") + "/Exam10_05_01"; // Linuxなのでパーミッションのある/home/user下
        File dir = new File(dirName);

        if (dir.mkdir()) {
            System.out.println("フォルダ " + dirName + " を作成しました");
        } else {
            System.err.println("フォルダ " + dirName + " の作成に失敗しました");
        }
    }
}
