/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Toi6_6_7 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();

        final String VACANT = "*";
        final int ELEMENT = 10;
        String[] arrayReserve = new String[ELEMENT];
        int idx;

        int n = ki.readInt("予約人数(1-10)");

        for (idx = 0; idx < n; idx++) {
            arrayReserve[idx] = ki.readString("予約者");
        }
        for (idx = n; idx < arrayReserve.length; idx++) {
            arrayReserve[idx] = VACANT;
        }

        System.out.println("予約者リスト");
        for (idx = 0; idx < arrayReserve.length; idx++) {
            System.out.print(arrayReserve[idx] + "\t");
        }
        System.out.println();
    }
}
