/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class BinarySearch {
    public static void main(String[] args) {
        KeyIn    ki         = new KeyIn();
        int[]    arrayScode = {101, 102, 181, 201, 283, 430, 550, 800};
        String[] arraySname = {
                "事務机A型", "事務机B型", "脇机", "会議用机", "折り畳み机", "木製机", "学生机", "応接机"
        };
        int      mid = 0;
        int      hi, lo;
        boolean  found;
        int      scode;

        found = false;
        scode = ki.readInt("商品コード:");
        lo = 0;
        hi = arrayScode.length - 1;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (scode == arrayScode[mid]) {
                found = true;
                break;
            } else {
                if (scode < arrayScode[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        /* 探索結果の判定と表示 */
        if (found) {
            System.out.println(arraySname[mid]);
        } else {
            System.err.println("登録されていない商品コードです");
        }
    }
}
