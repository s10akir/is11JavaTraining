/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Bmi {
    public double result(double height, double weight) {
        double bmi;
        height /= 100;

        bmi = weight / height / height;
        return bmi;
    }

    public double idealWeight(double height) {
        double idealWeight;

        idealWeight = (height - 100) * 0.9;
        return idealWeight;
    }
}
