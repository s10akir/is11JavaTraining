/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Exam07_04_01 {
    public static void main(String[] args) {
        int dice;

        System.out.println("サイコロを振ります");
        dice = (int)(Math.random() * 6 + 1);

        System.out.println(dice + "が出ました");
    }
}