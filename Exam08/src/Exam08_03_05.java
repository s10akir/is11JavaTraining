/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
public class Exam08_03_05 {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        NameData nd = new NameData();
        String familyName;
        int familyNameCount;

        familyName = ki.readString("名字を入力してください");
        familyNameCount = nd.searchFamilyName(familyName);

        if (0 < familyNameCount) {
            System.out.println(familyName + "さんは全国に" + familyNameCount + "人います");
        } else {
            System.out.println(familyName + "という苗字は日本に存在しません");
        }
    }
}
