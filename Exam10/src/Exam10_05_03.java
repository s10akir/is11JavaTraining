import java.io.File;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Exam10_05_03 {
    public static void main(String[] args) {
        String dirsName = System.getProperty("user.home") + "/Program/Exam10"; // Linuxなのでパーミッションのある/home/user下
        File dirs = new File(dirsName);

        if (dirs.mkdirs()) {
            System.out.println("新規フォルダ " + dirsName + " を作成しました");
        } else {
            System.out.println("新規フォルダ " + dirsName + " の作成に失敗しました");
        }
    }
}
