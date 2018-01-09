/**
 * @author : akira.shinohara
 * @since : 17/12/12
 *
 * IntelliJ IDEA ではオートでcase節のインデントがされるのでそれにしたがってコーディングしています。
 */
class Translation {
    void jpLocalize(int monthInt) {
        String monthString;

        switch (monthInt) {
            case 1:
                monthString = "睦月";
                break;
            case 2:
                monthString = "如月";
                break;
            case 3:
                monthString = "弥生";
                break;
            case 4:
                monthString = "卯月";
                break;
            case 5:
                monthString = "皐月";
                break;
            case 6:
                monthString = "水無月";
                break;
            case 7:
                monthString = "文月";
                break;
            case 8:
                monthString = "葉月";
                break;
            case 9:
                monthString = "長月";
                break;
            case 10:
                monthString = "神無月";
                break;
            case 11:
                monthString = "霜月";
                break;
            case 12:
                monthString = "師走";
                break;
            default:
                monthString = "1〜12の月を入力してください";
        }

        System.out.println(monthString);
    }
}
