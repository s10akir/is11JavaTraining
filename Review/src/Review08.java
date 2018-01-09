/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review08 {
    public static void main(String[] args) {
        int input;
        String time;
        KeyIn ki = new KeyIn();

        System.out.println("時刻を入力してください");
        while (true) {
            input = ki.readInt();
            if (input < 0 || 23 < input) {
                System.out.println("0~23の時刻を入力してください");
            } else if (input < 12) {
                time = "午前 " + input + " 時";
                break;
            } else {
                time = "午後 " + convertHour(input) + " 時";
                break;
            }
        }


        System.out.println(time + " です");

    }

    private static int convertHour(int in_hour) {
        return in_hour - 12;
    }
}
