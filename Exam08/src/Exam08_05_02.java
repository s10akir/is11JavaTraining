/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Exam08_05_02 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Moji mj = new Moji();
        String word;
        char grep;
        int count;
        String result;

        word = ki.readString("文字列を入力してください");
        grep = ki.readString("検索する文字列を入力してください").charAt(0); //２文字目以降無視

        count = mj.count(word, grep);

        result = 0 < count ? count + " 文字含まれています": "含まれていません";
        System.out.println(word + " に " + grep + " は " + result);
    }
}
