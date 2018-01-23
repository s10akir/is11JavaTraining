/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class InsertSort {
    public static void main(String[] args) {
        int[]    arrayScode = {102, 800, 201, 101, 283, 430, 181, 550};
        String[] arraySname = {
                "事務机B型", "応接机", "会議机", "事務机A型", "折りたたみ机", "木製机", "脇机", "学生机"
        };
        int      i, j;
        int      tempScode;
        String   tempSname;

        /* 挿入法による整列 */
        i = 1;
        while (i < arrayScode.length) {
            j = i;
            while (0 < j) {
                if (arrayScode[j - 1] > arrayScode[j]) {
                    /* 商品コードと商品名のそれぞれを前へ挿入 */
                    /* 商品コード挿入 */
                    tempScode = arrayScode[j];
                    arrayScode[j] = arrayScode[j - 1];
                    arrayScode[j - 1] = tempScode;
                    /* 商品名挿入 */
                    tempSname = arraySname[j];
                    arraySname[j] = arraySname[j - 1];
                    arraySname[j - 1] = tempSname;
                } else {
                    break;
                }
                j--;
            }
            i++;
        }

        /* 整列後の内容の表示 */
        i = 0;
        while (i < arrayScode.length) {
            System.out.println(arrayScode[i] + "\t" + arraySname[i]);
            i++;
        }
    }
}
