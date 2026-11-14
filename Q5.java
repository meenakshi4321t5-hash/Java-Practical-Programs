/*
Q5. Create a Product class with private productName and price.
Reject negative prices using a setter.
*/

class Product {
    private String productName;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        p.setProductName("Laptop");
        p.setPrice(45000);

        System.out.println(p.getProductName());
        System.out.println(p.getPrice());

        p.setPrice(-500);
    }
}

/*
OUTPUT:
Laptop
45000.0
Invalid price
*/
