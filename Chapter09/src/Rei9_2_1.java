/**
 * @author : akira.shinohara
 * @since : 2018/01/09
 */
public class Rei9_2_1 {
    public static void main(String[] args) {
        String shimei;
        String namae;
        String seibetsu;
        int toshi;

        KeyIn ki = new KeyIn();

        shimei = ki.readString("名字を入力:");
        namae = ki.readString("名前を入力:");

        while (true) {
            seibetsu = ki.readString("性別を入力(M, F):");
            if (seibetsu.equals("M")) {
                seibetsu = "男性";
                break;
            } else if (seibetsu.equals("F")) {
                seibetsu = "女性";
                break;
            } else {
                System.out.println("性別の入力に誤りがあります");
            }
        }

        while (true) {
            String buf = ki.readString("年齢を入力:");
            try {
                toshi = Integer.parseInt(buf);
                break;
            } catch (NumberFormatException e ) {
                System.out.println("年齢の入力に誤りがあります:" + buf);
            }
        }

        System.out.println("氏名:" + shimei + " " + namae + " 性別:" + seibetsu + " 年齢:" + toshi + "歳");
    }
}
