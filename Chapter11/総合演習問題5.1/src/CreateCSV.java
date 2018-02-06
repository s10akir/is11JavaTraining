import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class CreateCSV {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        String[] students;
        String fileName;
        int dataNum;
        BufferedWriter bw;
        String id;
        String name;

        while (true) {
            dataNum = ki.readInt("データ件数を指定してください");

            if (0 < dataNum && dataNum <= 100 ) {
                break;
            } else {
                System.out.println("1 ~ 100件で指定してください");
            }
        }

        students = new String[dataNum];
        for (int i = 0; i < students.length; i++) {
            while (true) {
                id = ki.readString("学籍番号: ");
                if (0 < id.length() && id.length() < 8) {
                    break;
                } else {
                    System.out.println("学籍番号は7桁以内で入力してください;");
                }
            }
            while (true) {
                name = ki.readString("名前: ");
                if (0 < name.length() && name.length() < 17) {
                    break;
                } else {
                    System.out.println("氏名は16文字以内で入力してください");
                }
            }
            int buf;
            while (true) {
                buf = ki.readInt("点数: ");
                if (0 <= buf && buf <= 100) {
                    break;
                } else {
                    System.out.println("点数は0 ~ 100で入力してください");
                }
            }
            String score = "" + buf;

            students[i] = id + "," + name + "," + score;
        }
        Arrays.sort(students);

        System.out.println(Arrays.deepToString(students));
        fileName = ki.readString("出力ファイル名を指定してください ");

        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            for (String student : students) {
                bw.write(student);
                bw.newLine();
            }
            bw.close();
        } catch (IOException err) {
            System.err.println("ファイルオープンエラー" + err);
        }
    }
}
