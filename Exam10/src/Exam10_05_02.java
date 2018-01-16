import java.io.File;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_05_02 {
    public static void main(String[] args) {
        String dirName = System.getProperty("user.home") + "/Exam10_05_01"; // Linuxなのでパーミッションのある/home/user下
        File dir = new File(dirName);

        if (dir.delete()) {
            System.out.println("フォルダ " + dirName + " を削除しました");
        } else {
            System.err.println("フォルダ " + dirName + " の削除に失敗しました");
        }
    }
}
