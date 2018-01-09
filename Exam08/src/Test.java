/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
class Test {
    static char judge(int scoreInt) {
        char scoreChar;

        // switchが適さない以上、三項演算子が可読性的に適していると判断しました。
        scoreChar = 90 <= scoreInt ? 'S':
                    80 <= scoreInt ? 'A':
                    70 <= scoreInt ? 'B':
                    60 <= scoreInt ? 'C':
                                     'D';

        return  scoreChar;
    }
}