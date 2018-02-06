/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class Eratosthenes {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        int len;
        int end;
        int i, j;
        int count;

        len = ki.readInt("いくつまで:");
        end = (int)Math.sqrt(len);
        boolean[] arrayPrime = new boolean[len + 1];

        /* 初期設定 */
        arrayPrime[2] = true;
        i = 3;
        while (i < arrayPrime.length) {
            arrayPrime[i] = true;
            i = i + 2;
        }

        /* 添字の倍数をfalseに */
        i = 3;
        while (i <= end) {
            if (arrayPrime[i]) {
                j = i * 2;
                while (j < arrayPrime.length) {
                    arrayPrime[j] = false;
                    j = j + i;
                }
            }
            i = i + 2;
        }

        /* 素数の表示処理 */
        count = 0;
        for (i = 0; i < arrayPrime.length; i++) {
            if (arrayPrime[i]) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println(count + "個");
    }
}
