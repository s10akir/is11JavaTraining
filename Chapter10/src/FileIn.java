import java.io.*;

/**
 * @author : akira.shinohara
 * @since : 2018/01/16
 */
public class FileIn {
    BufferedReader br = null;  // BufferedReaderクラス

    /* ファイルのオープンを行うメソッド */
    public boolean open(String fname) {
        boolean sts = true;
        try {
            br = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.err.println("ファイル名に誤りがあります\n" + e);
            sts = false;
        }
        return sts;
    }
    /* ファイルからデータの読み込みを行うメソッド */
    public String readLine() {
        String buff;
        try {
            buff = br.readLine();
        } catch (IOException e) {
            System.out.println("読み込みエラー\n" + e);
            buff = null;
        }
        return buff;
    }
    /* ファイルのクローズを行うメソッド */
    public boolean close() {
        boolean sts = true;
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("ファイルクローズエラー\n" + e);
            sts = false;
        }
        return  sts;
    }
}
