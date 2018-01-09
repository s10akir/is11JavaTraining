/**
 * @author : akira.shinohara
 * @since : 17/12/19
 */
public class Moji {
    public int count(String word, char grep) {
        int count = 0;
        int index = 0;
        int position;

        while ((position = word.indexOf(grep, index)) != -1) {
            index = position + 1;
            count++;
        }

        return count;
    }
}
