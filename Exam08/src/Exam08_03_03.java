/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
public class Exam08_03_03 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Translation trans = new Translation();
        int monthInt;

        monthInt = ki.readInt("月を入力してください");
        trans.jpLocalize(monthInt);
    }
}
