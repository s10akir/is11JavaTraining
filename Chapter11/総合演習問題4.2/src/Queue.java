/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class Queue {
    public static void main(String[] args) {
        /* キーボード入力のインスタンスを生成する */
        KeyIn ki = new KeyIn();

        /* 入力されたキューの要素数 + 1 の配列を確保 */
        System.out.println("(指定した数 - 1)個のキューバッファが用意されます");
        int element;
        while ((element = ki.readInt("配列要素数:")) < 1);
        int[] arrayQueue = new int[element];
        System.out.println((element - 1) + "個の要素を格納できます");

        int kind;       // 種別(0:表示, 1:格納, 2:取り出し)
        int inData;     // 格納するデータ

        int front = 0;  // 先頭ポインタ
        int rear = 0;   // 末尾ポインタ (次の要素位置を示す)

        /* スタック処理の種別を入力する */
        while (0 <= (kind = ki.readInt("種別(0:表示, 1:格納, 2:取り出し):"))) {
            switch (kind) {

                case 0:  // 表示
                    if (front == rear) {
                        System.err.println("データが格納されていません");
                    } else if (front < rear) {
                        int idx = 0;
                        for (int i = front; i < rear; i++) {
                            System.out.println("[" + idx + "]" + arrayQueue[i]);
                            idx++;
                        }
                    } else {
                        int i = front;
                        int idx = 0;
                        while (i != rear) {
                            System.out.println("[" + idx + "]" + arrayQueue[i]);
                            idx++;
                            if (i < element - 1) {
                                i++;
                            } else {
                                i = 0;
                            }
                        }
                    }
                    break;

                case 1:  // 格納 (enqueue)
                    if ((front == 0 && rear == element - 1) || rear + 1 == front) {
                        System.err.println("キューが一杯です");
                    } else {
                        inData = ki.readInt("データ:");
                        arrayQueue[rear] = inData;
                        if (rear < element - 1) {
                            rear++;
                        } else {
                            rear = 0;
                        }
                    }
                    break;

                case 2:  // 取り出し (dequeue)
                    if (front == rear) {
                        System.err.println("データが格納されていません");
                    } else {
                        System.out.println(arrayQueue[front]);
                        if (front < element - 1) {
                            front++;
                        } else {
                            front = 0;
                        }
                    }
                    break;

                default: // 種別エラー
                    System.out.println("種別の入力エラー");
                    break;
            }
        }
        System.out.println("---- プログラム終了 ----");
    }
}
