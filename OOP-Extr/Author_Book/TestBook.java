package Author_Book;

public class TestBook {
    public static void main(String[] args) {

        Author a1 = new Author("Azad Ayhan", "azadayhan50@gmail.com", 'm');
        System.out.println(a1); 

        Book b1 = new Book("Incinsen de incitme",  a1, 9.9, 90);
        System.out.println(b1);


        // Test Setters and Getters
        b1.setPrice(8.80);
        b1.setQty(190);
        System.out.println("Name:" + b1.getName());
        System.out.println("Price:" + b1.getPrice());
        System.out.println("qty is:" + b1.getQty());

        System.out.println("author is:" + b1.geAuthor());
        System.out.println("author name:" + b1.geAuthor().getName());
        System.out.println("author name:" + b1.geAuthor().getEmail());
        System.out.println("author name:" + b1.geAuthor().getGender());

        Book b2 = new Book("Yeni kitap", new Author("Cemal", "orus@moskow.com", 'm'), 19.99, 90);
        System.out.println(b2);
    }
}
