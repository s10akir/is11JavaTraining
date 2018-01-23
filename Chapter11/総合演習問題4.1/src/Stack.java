/**
 * @author : akira.shinohara
 * @since : 2018/01/23
 */
public class Stack {
    public static void main(String[] args) {
        final int STACK_EMPTY = -1;  // スタックが空の状態
        KeyIn ki = new KeyIn();

        /* 入力された要素数のスタック領域を確保 */
        int element;
        while ((element = ki.readInt("スタック要素数:")) < 1);  // whileのbodyが空なのでintellijがブチ切れます
        int[] arrayStack = new int[element];
        int sp = STACK_EMPTY;  // スタックポインタEmptyから開始

        int kind;
        int inData;

        /* スタック処理の種別を入力する */
        while (0 <= (kind = ki.readInt("種別(0:表示, 1:push, 2:pop)"))) {
            switch (kind) {
                case 0:
                    if (sp == STACK_EMPTY) {
                        System.err.println("スタックされていません");
                    } else {
                        for (int i = 0; i < sp + 1; i++) {
                            System.out.println("[" + i + "]" + " " + arrayStack[i]);
                        }
                    }
                    break;

                case 1:
                    if (sp == element - 1) {
                        System.err.println("スタックが一杯です");
                    } else {
                        sp++;
                        inData = ki.readInt("データ");
                        arrayStack[sp] = inData;
                    }
                    break;

                case 2:
                    if (sp == STACK_EMPTY) {
                        System.err.println("スタックされていません");
                    } else {
                        System.out.println(arrayStack[sp]);
                        sp--;
                    }
                    break;

                default:
                    System.err.println("種別の入力エラーです");
                    break;
            }
        }
        System.out.println("----プログラム終了----");
    }
}
