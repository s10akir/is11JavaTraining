import java.io.*;
/**
 * @author : akira.shinohara
 * @since : 2018/01/09
 */
public class FileOut {
    BufferedWriter bw = null;
    /* ファイルのオープンを行うメソッド */
    public  boolean open(String fname) {
        boolean sts = true;
        try {
            bw = new BufferedWriter(new FileWriter(fname));
        } catch (IOException e) {
            System.out.println("ファイル名に誤りがあります\n" + e);
            sts = false;
        }
        return sts;
    }
    /* ファイルへのデータ書き込みを行うメソッド */
    public boolean writeln(String str) {
        boolean sts = true;
        try {
            bw.write(str);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("書き込みエラー\n" + e);
            sts = false;
        }
        return sts;
    }
    /* ファイルのクローズを行うメソッド */
    public boolean close() {
        boolean sts = true;
        try {
            bw.close();
        } catch (IOException e) {
            System.out.println("ファイルクローズエラー\n" + e);
            sts = false;
        }
        return sts;
    }
}
