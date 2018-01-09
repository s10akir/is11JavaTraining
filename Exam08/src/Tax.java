/**
 * @author : akira.shinohara
 * @since : 17/12/05
 */
class Tax {
    int include(int price) {
        final double TAX = 0.08;
        if (price > -1) {
            price = (int)(price + price * TAX);
            return price;
        } else {
            return -1;
        }
    }
}
