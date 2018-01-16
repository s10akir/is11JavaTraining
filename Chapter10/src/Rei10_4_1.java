import java.io.File;
import java.util.*;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class Rei10_4_1 {
    public static void main(String[] args) {
        File f = null;
        String fileName = "/abc.txt";

        try {
//            f = new File(args[0]);  // 教科書通りの記述
            f = new File(fileName);  // 授業用
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("ファイル名を指定してください");
            System.exit(1);
        }

        if (f.exists()) {
            System.out.println("ファイル名       : " + f.getName());
            System.out.println("絶対パス名       : " + f.getAbsolutePath());
            System.out.println("パス名           : " + f.toString());
            System.out.println("親ディレクトリ名 : " + f.getParent());
            System.out.println("ファイルの長さ   : " + f.length());
            System.out.println("読み込み可能     : " + f.canRead());
            System.out.println("編集可能         : " + f.canWrite());
            System.out.println("隠しファイル     : " + f.isHidden());
            Date d = new Date(f.lastModified());
            System.out.println("最終更新時刻     : " + d.toString());
        } else {
//            System.out.println("指定されたファイルは存在しません: " + args[0]);  // 教科書通り
            System.out.println("指定されたファイルは存在しません: " + fileName);  // 授業用
        }
    }
}
