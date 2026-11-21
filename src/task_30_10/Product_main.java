package task_30_10;

public class Product_main {
public static void main(String[] args) {
	Product p = new Product();

    p.setPrice(1000);
    p.setDiscount(10);

    System.out.println("Original Price: " + p.getPrice());
    System.out.println("Discount: " + p.getDiscount() + "%");
    System.out.println("Final Price: " + p.calculateDiscount());
}

}

