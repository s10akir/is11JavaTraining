/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayScode = {102, 800, 201, 101, 283, 430, 181, 550};
        String[] arraySname = {
                "事務机B型", "応接机", "会議用机", "事務机A型", "折り畳み机", "木製机", "脇机", "学生机"
        };
        int i, j;
        boolean sortFlag;
        int tempScode;
        String tempSname;

        /* 交換法による整列 */
        i = 0;
        while (i < arrayScode.length - 1) {
            sortFlag = true;
            j = arrayScode.length - 1;
            while (i < j) {
                if (arrayScode[j - 1] > arrayScode[j]) {
                    /* 商品コードと商品名のそれぞれを交換 */
                    /* 商品コード */
                    tempScode         = arrayScode[j];
                    arrayScode[j]     = arrayScode[j - 1];
                    arrayScode[j - 1] = tempScode;
                    /* 商品名 */
                    tempSname         = arraySname[j];
                    arraySname[j]     = arraySname[j - 1];
                    arraySname[j - 1] = tempSname;
                    sortFlag = false;
                }
                j--;
            }

            /* スキャン中に一度も交換されなければ整列完了 */
            if (sortFlag) {
                break;
            }
            i++;
        }

        /* 交換後の内容の表示 */
        i = 0;
        while (i < arrayScode.length) {
            System.out.println(arrayScode[i] + "\t" + arraySname[i]);
            i++;
        }
    }
}
