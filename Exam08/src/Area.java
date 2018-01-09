/**
 * @author : akira.shinohara
 * @since : 17/12/12
 */
class Area {
    double triangle(int width, int height) {
        double areaSize;

        if (width <= 0 && height <= 0) { // error case
            areaSize = -3;
        } else if (height <= 0) {       // error case
            areaSize = -2;
        } else if (width <= 0) {        // error case
            areaSize = -1;
        } else {
            areaSize = width * height / 2;
        }

        return areaSize;
    }
}
