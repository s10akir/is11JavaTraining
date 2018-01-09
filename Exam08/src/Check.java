/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
class Check {
    int checkNumber(int scoreInt) {
        if (0 <= scoreInt && scoreInt <= 100) {
            return 0;
        } else {
            return 1;
        }
    }
}
