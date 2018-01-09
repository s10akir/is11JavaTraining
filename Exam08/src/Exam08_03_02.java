/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
public class Exam08_03_02 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Area area = new Area();
        int width;
        int height;
        double areaSize;
        String resultString = "は1以上を入力してください";

        width  = ki.readInt("底辺を入力してください");
        height = ki.readInt("高さを入力してください");

        areaSize = area.triangle(width, height);
        if (areaSize == -1) {                     // error code -1
            resultString = "底辺" + resultString;
        } else if (areaSize == -2) {              // error code -2
            resultString = "高さ" + resultString;
        } else if (areaSize == -3) {              // error code -3
            resultString = "底辺・高さ" + resultString;
        } else {
            resultString = "三角形の面積は" + areaSize + "です";
        }

        System.out.println(resultString);
    }
}
