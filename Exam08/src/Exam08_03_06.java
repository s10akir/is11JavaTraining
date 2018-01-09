import static java.lang.System.exit;

/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
public class Exam08_03_06 {
    public static void main(String[] args) {
        KeyIn ki     = new KeyIn();
        Check check  = new Check();
        int scoreInt;
        char scoreChar;

        scoreInt = ki.readInt("点数を入力してください");

        //入力値のチェック処理
        if (check.checkNumber(scoreInt) == 1) {
            System.out.println("範囲外です");
            exit(1);
        }

        // 5段階評価への変換
        scoreChar = Test.judge(scoreInt);

        System.out.println("評価は" + scoreChar + "です");
    }
}
