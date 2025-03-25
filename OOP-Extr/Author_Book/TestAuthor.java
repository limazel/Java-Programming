package Author_Book;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Azad", "azadayhan50@gmail.com", 'm');
        System.out.println(a1);

        a1.setEmail("gs1905azad@gmail.com");
        System.out.println("Author name: " + a1.getName());
        System.out.println("Author gender: " + a1.getGender());
        System.out.println("Author email: " + a1.getEmail());


    }  
}
