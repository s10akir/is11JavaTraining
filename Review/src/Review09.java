/**
 * @author : akira.shinohara
 * @since : 17/10/17
 */
public class Review09 {
    public static void main(String[] args) {
        int i;
        String tab;
        char[] gpa = new char[5];
        String[] subject = new String[3];
        int[] score = new int[3];
        int[] rank = new int[3];

        gpa[4] = 'S';
        gpa[3] = 'A';
        gpa[2] = 'B';
        gpa[1] = 'C';
        gpa[0] = 'D';

        subject[0] = "プログラミング";
        subject[1] = "ネットワーク";
        subject[2] = "資格対策";
        KeyIn ki = new KeyIn();

        // 入力ループ
        i = 0;
        while (i < 3) {
            System.out.println(subject[i] + "の点数を入力してください");
            score[i] = ki.readInt();
            if (-1 < score[i] && score[i] < 101) {
                i++;
            } else {
                System.out.println("範囲外です");
            }
        }

        // アルファベットに変換 && 出力ループ
        i = 0;
        while (i < 3) {
            rank[i] = score[i] > 89 ? 4:
                      score[i] > 79 ? 3:
                      score[i] > 69 ? 2:
                      score[i] > 59 ? 1:
                                      0; // 3項演算子のネスト
            tab = i < 2 ? "\t" : "\t\t"; // "資格対策"だけ文字数が少なくてタブ数が合わないので可変に
            System.out.println(subject[i] + tab + gpa[rank[i]]);
            i++;
        }

        System.out.println("GPA\t\t\t\t" + ((rank[0] + rank[1] + rank[2]) / 3.0));

    }
}
