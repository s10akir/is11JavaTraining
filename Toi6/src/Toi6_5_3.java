/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Toi6_5_3 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();

        final int N = 5;
        String[] arrayName = new String[N];
        int[] arrayTensu = new int[N];

        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = ki.readString((i + 1) + " 人目の名前を入力");
            arrayTensu[i] = ki.readInt((i + 1) + " 人目の点数を入力");
        }

        for (int i = 0; i < arrayName.length; i++) {
            System.out.print(arrayName[i] + "さん ");
            System.out.println(arrayTensu[i] + "点");
        }
    }
}
