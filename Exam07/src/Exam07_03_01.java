/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Exam07_03_01 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int input;


        input = ki.readInt("0〜10の数字を入力してください");
        switch (input) {
            case 0:
                System.out.println("null");
                break;
            case 1:
                System.out.println("eins");
                break;
            case 2:
                System.out.println("zwei");
                break;
            case 3:
                System.out.println("drei");
                break;
            case 4:
                System.out.println("vier");
                break;
            case 5:
                System.out.println("fünf");
                break;
            case 6:
                System.out.println("sechs");
                break;
            case 7:
                System.out.println("sieben");
                break;
            case 8:
                System.out.println("acht");
                break;
            case 9:
                System.out.println("neun");
                break;
            case 10:
                System.out.println("zehn");
                break;
            default:
                System.out.println("わかりません");
        }
    }
}
