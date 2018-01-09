/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Toi6_6_6 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();

        String[] arrayName = {
                " ",
                "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10",
                "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10",
                "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"
        };

        int classNo = ki.readInt("クラス(1, 2, 3)");
        int bango = ki.readInt("番号(1-10)");
        int idx = (classNo - 1) * 10 + bango;
        String name = arrayName[idx];
        System.out.println(name);
    }
}
