import java.util.*;

/**
 * @author : akira.shinohara
 * @since : 17/11/28
 */
public class Practice07 {
    public static void main(String[] args) {
        Random rnd = new Random();
        KeyIn ki = new KeyIn();
        Boolean flag = false;
        List<Integer> answer;
        int cnt = 1;
        int tmp;


        // 乱数の生成
        tmp = rnd.nextInt(10000);
        while (tmp < 1000) { tmp *= 10; }
        answer = splitInt(tmp);
        System.out.println(answer); // debug

        while (!flag) {
            int input = 0;
            List<Integer> arrayInput;
            int hit = 0;
            int blow = 0;

            System.out.print(cnt + "回目: ");

            while (input < 999 || 10000 < input) {
                input = ki.readInt("4桁の整数を入力してください");
            }
            arrayInput = splitInt(input);

            // hit & blow count
            for (int i = 0; i < arrayInput.size(); i++) {
                if ( Objects.equals(arrayInput.get(i), answer.get(i)) ) {
                    hit++;
                } else {
                    for (Integer anAnswer : answer) {
                        if (Objects.equals(arrayInput.get(i), anAnswer)) {
                            blow++;
                        }
                    }
                }
            }

            System.out.println(hit + "hit / " + blow + "blow");
            if (hit == 4) { flag = true; }

            cnt++;
        }

        System.out.println("正解です!");
    }


    private static List<Integer> splitInt(int input) {
        List<Integer> arrayInt = new ArrayList<>();

        for (int i = 1000; i > 1; i /= 10) {
            arrayInt.add(input / i);
            input %= i;
        }
        arrayInt.add(input);

        return arrayInt;
    }
}
