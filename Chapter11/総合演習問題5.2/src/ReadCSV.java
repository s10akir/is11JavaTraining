import java.io.*;

/**
 * @author : akira.shinohara
 * @since : 2018/02/06
 */
public class ReadCSV {
    public static void main(String[] args) {
        KeyIn ki = new KeyIn();
        String fileName;
        BufferedReader br;
        String buf;
        int fileLine = -1;
        String[] students;
        int idx = 0;
        String id;

        fileName = ki.readString("ファイル名を指定してください");
        try {
            br = new BufferedReader(new FileReader(fileName));
            buf = "";
            while (buf != null) {
                buf = br.readLine();
                fileLine++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        students = new String[fileLine];

        try {
            br = new BufferedReader(new FileReader(fileName));
            buf = "";
            while (buf != null) {
                buf = br.readLine();
                if (buf != null) {
                    students[idx] = buf;
                    idx++;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            id = ki.readString("検索対象番号");
            if (id.equals("")) {
                System.out.println("---- プログラム終了 ----");
                System.exit(0);
            }
            boolean flag = false;
            for (String student : students) {
                String[] element = student.split(",");
                if (element[0].equals(id)) {
                    System.out.println("学籍番号:" + element[0]);
                    System.out.println("氏名　　:" + element[1]);
                    System.out.println("点数　　:" + element[2]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("指定した学生番号のデータは見つかりませんでした");
            }
        }
    }
}
