/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class LinearSearch {
    public static void main(String[] args) {
        KeyIn    ki         = new KeyIn();
        int[]    arrayScode = {102, 800, 201, 101, 283, 430, 181, 550};
        String[] arraySname = {
                "事務机B型", "応接机", "会議用机", "事務机A型", "折り畳み机", "木製机", "脇机", "学生机"
        };
        int      idx;
        int      scode;

        scode = ki.readInt("商品コード:");
        /* 探索ループ */
        idx = 0;
        while (idx < arrayScode.length && scode != arrayScode[idx]) {
            idx++;
        }

        if (idx < arrayScode.length) {
            System.out.println(arraySname[idx]);
        } else {
            System.err.println("登録されていない商品コードです");
        }
    }
}
