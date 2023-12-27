import models.Cart;

public class Main {
    public static void main(String[] args) {
        int[] cart1Price = {1,2,3,4,5,10};
        int[] cart2Price = {1,2,3,4,5,10,45,34};
        int[] cart3Price = {1,2,3,4,5,10,23};
        Cart cart1 = new Cart(1,"XYZ", "Mandip", cart1Price);
        Cart cart2 = new Cart(1,"XYZ - 1", "Sandeep", cart2Price);
        Cart cart3 = new Cart(1,"XYZ - 2", "What", cart3Price);

        cart1.cartTotal();
        cart2.cartTotal();
        cart3.cartTotal();
    }
}