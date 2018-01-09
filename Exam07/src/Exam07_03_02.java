/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Exam07_03_02 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int input;


        while (true) {
            input = ki.readInt("月を入力してください");
            if (0 < input && input < 13) {
                break;
            }
            System.out.println("その月は存在しません");
        }

        switch (input) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬です");
                break;
        }
    }
}
