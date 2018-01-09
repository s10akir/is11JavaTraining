/**
 * @author : akira.shinohara
 * @since : 17/12/19
 *
 * KeyInクラスをいじってDouble対応にしました
 */
public class Exam08_05_03 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        Bmi bmi = new Bmi();
        double height, weight;
        double valueBMI;
        String[] bodyType = {"やせすぎ", "やせ気味", "標準", "太り気味", "太り過ぎ"};
        int valueBodyType;
        double idealWeight;

        height = ki.readDouble("身長(cm)を入力してください");
        weight = ki.readDouble("体重(kg)を入力してください");

        valueBMI = bmi.result(height, weight);
        valueBodyType = valueBMI <= 17.6 ? 0:
                        valueBMI <= 19.8 ? 1:
                        valueBMI <  24.2 ? 2:
                        valueBMI <  26.4 ? 3:
                                           4;
        System.out.println("肥満度は 「" + bodyType[valueBodyType] + "」 です");

        if (valueBodyType != 2) {
            idealWeight = bmi.idealWeight(height);
            System.out.println("理想体重は " + idealWeight + "kg です");
        }
    }
}
