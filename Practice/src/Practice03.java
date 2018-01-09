import static java.lang.System.exit;


/**
 * @author : akira.shinohara
 * @since : 17/11/21
 *
 * せっかくなのでオブジェクト指向を意識して実装しました
 */
public class Practice03 {
    private static KeyIn ki = new KeyIn();
    private static int stackPointer = 0;
    private static int[] stack = new int[10];

    public static void main(String[] args) {
        manipulateStack();
    }

    private static void manipulateStack() {
        while (true) {
            System.out.println("0: 終了");
            System.out.println("1: push");
            System.out.println("2: pop");
            System.out.println("3: スタックの出力");

            switch (ki.readInt()) {
                case 0:
                    System.out.println("プログラムを終了します");
                    exit(0);
                case 1:
                    pushStack();
                    break;
                case 2:
                    popStack();
                    break;
                case 3:
                    printStack();
                    break;
                default:
                    System.out.println("モード指定が不正です");
            }
            System.out.println();
        }
    }

    private static void pushStack() {
        int input;


        if (stackPointer < 9) {
            System.out.println("pushするデータを入力してください");
            input = ki.readInt();

            stackPointer++;
            stack[stackPointer] = input;
        } else {
            System.out.println("スタックの要素がいっぱいです");
        }
    }

    private static void popStack() {
        if (stackPointer > 0) {
            System.out.println(stack[stackPointer] + " を取り出しました");
            stackPointer--;
            /*
            スタックの要素数をstackPointerに持ってるのでstackそのものの要素はそのままにする。どうせあとで上書きされる。
            */
        } else {
            System.out.println("スタックが空です");
        }
    }

    private static void printStack() {
        if (stackPointer > 0) {
            for (int i = 0; i <= stackPointer; i++) {
                System.out.println("[" + i + "] " + stack[i]);
            }
        } else {
            System.out.println("スタックが空です");
        }
    }
}
