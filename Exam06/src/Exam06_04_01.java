/**
 * @author : akira.shinohara
 * @since : 17/11/07
 */
public class Exam06_04_01 {
    public static void main(String[] args) {
        double[] num = {
                0.1,
                0.2,
                0.3
        };

        for(double d: num) { // Java8でやっと実装されたfor-each
            System.out.println(d);
        }
    }
}
