class Product {
    public void purchase() {
        System.out.println("Purchasing a generic product.");
    }

    public void displayDetails() {
        System.out.println("Product details: Basic product information.");
    }

    public void displayDetails(String info) {
        System.out.println("Product details: " + info);
    }
}

class Book extends Product {
    @Override
    public void purchase() {
        System.out.println("Purchasing the book: 'Effective Java'.");
    }
}

class Electronics extends Product {
    @Override
    public void purchase() {
        System.out.println("Purchasing electronic gadget: Smartphone.");
    }
}

public class OnlineShopping {
    public static void buyProduct(Product product) {
        product.purchase();
    }

    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        Electronics gadget = new Electronics();
        book.purchase();
        gadget.purchase();
        book.displayDetails();
        book.displayDetails("Hardcover edition, 300 pages");
        gadget.displayDetails();
        gadget.displayDetails("Latest model with 5G");
        buyProduct(book);
        buyProduct(book1);
        buyProduct(gadget);
    }
}