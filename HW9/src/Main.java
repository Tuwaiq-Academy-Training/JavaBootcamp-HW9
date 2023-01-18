import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products= new ArrayList<Product>();
        products.add(new Movie("Ironman", 200.0, "Tony"));
        products.add(new Book("Life Journy", 10, "Hashem"));
        for (Product product:products) {
            System.out.println(product.getDiscount());
            System.out.println(product.getName());
            System.out.println(product.getPrice());
        }
        MovablePoint move = new MovablePoint(1,3,77,8);
        move.moveDown();
        move.moveUp();
        System.out.println(move.toString());
    }
}