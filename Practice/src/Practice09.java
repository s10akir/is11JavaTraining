/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice09 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        String input;
        String account = "";
        String domain = "";
        int i;


        input = ki.readString("メールアドレスを入力してください");
        for (i = 0; i < input.length(); i++) {
            char tmp;

            tmp = input.charAt(i);
            if (tmp != '@') {
                account += tmp;
            } else {
                break;
            }
        }

        for (i+=1; i < input.length(); i++) {
            char tmp;

            tmp = input.charAt(i);
            domain += tmp;
        }

        System.out.println("アカウント名\t:" + account);
        System.out.println("ドメイン名\t:" + domain);
    }
}
