
public class Main {
    public static void main(String[] args) {
        // Create T-shirt objects
        TShirt tShirt1 = new TShirt("Nepali Flag", 456, 1000.0, "Nepal Clothing",
                "Nepal's national flag design", new String[]{"S", "M", "L","XL"});

        // Describe the T-shirt
        tShirt1.describeTShirt();

        // Create Order objects
        Order order1 = new Order("Rhoit Shah", "9876545270",
                new int[]{456}, new double[]{1000.0});

        // Print the bill with VAT
        order1.printBillWithVAT();
    }
}