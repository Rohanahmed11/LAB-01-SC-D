public class Book {
    private String title;
    private String author;
    private int pages;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        book.displayInfo();
    }
}
