/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice08 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        String input;
        StringBuilder result = new StringBuilder();


        input = ki.readString("文字列を入力してください");
        for (int i = input.length() - 1; 0 <= i; i--) {
            result.append(input.charAt(i));
        }

        System.out.println(result);
    }
}
