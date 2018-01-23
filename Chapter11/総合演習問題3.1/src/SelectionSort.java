/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayScode = {102, 800, 201, 101, 283, 430, 181, 550};
        String[] arraySname = {
                "事務机B型", "応接机", "会議用机", "事務机A型", "折り畳み机", "木製机", "脇机", "学生机"
        };
        int i, j;
        int tempScode;
        String tempSname;

        /* 選択法による整列 */
        i = 0;
        while (i < arrayScode.length - 1) {
            j = i + 1;
            while (j < arrayScode.length) {
                if (arrayScode[i] > arrayScode[j]) {
                    /* 商品コードスワップ */
                    tempScode = arrayScode[i];
                    arrayScode[i] = arrayScode[j];
                    arrayScode[j] = tempScode;
                    /* 商品名スワップ */
                    tempSname = arraySname[i];
                    arraySname[i] = arraySname[j];
                    arraySname[j] = tempSname;
                } else {
                    j++;
                }
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

    /* 教科書に擬似言語が乗っているのに気づかず自分で実装したので供養
    private static void swap(int[] array, int i, int j) {
        int tmp;

        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private static void swap(String[] array, int i, int j) {
        String tmp;

        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    */
}
