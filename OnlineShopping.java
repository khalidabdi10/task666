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

class Cars extends Product {
    @Override
    public void purchase() {
        System.out.println("Purchasing car: Toyota landcruiser.");
    }
}

public class OnlineShopping {
    public static void buyProduct(Product product) {
        product.purchase();
    }

    public static void main(String[] args) {
        Book book = new Book();
        Electronics gadget = new Electronics();
        Cars Motor = new Cars();

        book.purchase();
        gadget.purchase();
        Motor.purchase();
        book.displayDetails();
        book.displayDetails("Hardcover edition, 300 pages");
        gadget.displayDetails();
        gadget.displayDetails("Latest model with 5G");
        Motor.displayDetails("New Land cruiser 300vx");
        buyProduct(book);
        buyProduct(gadget);
        buyProduct(Motor);
    }
}