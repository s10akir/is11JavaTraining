/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review03 {
    public static void main(String[] args) {
        String lastName;
        String firstName;
        KeyIn ki = new KeyIn();


        System.out.println("名字を入力してください");
        lastName = ki.readString();

        System.out.println("名前を入力してください");
        firstName = ki.readString();

        System.out.println(lastName + firstName + "さんですね");
    }
}
