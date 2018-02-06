import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : akira.shinohara
 * @since : 2017/06/23
 * 教科書9.4 267p
 */
public class KeyIn {
    String buf = null;                                                         // 入力バッファのイニシャライズ
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in)); // キーボード入力の準備

    /* 文字列を入力するメソッド */
    public String readString() {
        try {
            buf = br.readLine();                                               // キーボード入力
        } catch (IOException e) {                                              // キーボード入力致命的エラー
            System.out.println(e);                                             // エラー情報の表示
            System.exit(1);                                                    // プログラムの異常終了
        }
        return buf; // 文字列を返却
    }

    /* 入力プロンプトを表示して文字列を入力するメソッド */
    public String readString(String msg) {
        System.out.print(msg + ">");                                           // プロンプト表示
        return readString();                                                   // キーボード入力
    }

    /* 整数値を入力するメソッド */
    public int readInt() {
        int inputInValue;
        while (true) {
            buf = readString();
            try {
                inputInValue = Integer.parseInt(buf);                          // 数値に変換
                break;                                                         // ループ終了
            } catch (NumberFormatException e1) {                               // 数値変換のエラー
                System.out.println("整数値を入力してください:" + buf);
                System.out.print("再入力>");
            }
        }
        return  inputInValue;                                                  // 変換した値の返却
    }

    /* 入力プロンプトを表示して整数値を入力するメソッド */
    public int readInt(String msg) {
        System.out.print(msg + ">");                                           // プロンプト表示
        return readInt();                                                      // readInt()の呼び出し
    }

    /* Double値を入力するメソッド */
    public double readDouble() {
        double inputInValue;
        while (true) {
            buf = readString();
            try {
                inputInValue = Double.parseDouble(buf);                        // 数値に変換
                break;                                                         // ループ終了
            } catch (NumberFormatException e1) {                               // 数値変換のエラー
                System.out.println("数値を入力してください:" + buf);
                System.out.print("再入力>");
            }
        }
        return  inputInValue;                                                  // 変換した値の返却
    }

    /* 入力プロンプトを表示してDouble値を入力するメソッド */
    public double readDouble(String msg) {
        System.out.print(msg + ">");                                           // プロンプト表示
        return readDouble();                                                   // readInt()の呼び出し
    }
}
