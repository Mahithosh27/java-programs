import java.util.ArrayList;
class Product {
    String name;
     double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "Product: " + name + " | Price: rs:" + price;
    }
}
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

class Groceries extends Product {
    public Groceries(String name, double price) {
        super(name, price);
    }
    public static void main(String[] args) {
        ArrayList<Product> p = new ArrayList<>();
        p.add(new Electronics("Smartphone", 59999.99));
        p.add(new Electronics("earphone", 250));
        p.add(new Electronics("speaker", 500.99));
        p.add(new Clothing("T-Shirt", 199));
        p.add(new Clothing("pant", 500));
        p.add(new Clothing("shirt", 1999));
        p.add(new Groceries("Apples", 2.49));
        p.add(new Groceries("rice", 100));
        p.add(new Groceries("oil", 45));

        // Display the inventory
        for (Product pr : p) {
            System.out.println(pr);
        }
    }
}