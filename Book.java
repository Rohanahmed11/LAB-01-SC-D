public class Book {
    private String title;
    private String author;
    private int pages;
    private int publicationYear; // New field

    // Constructor with new parameter
    public Book(String title, String author, int pages, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // Method to display book details with publication year
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Publication Year: " + publicationYear); // New line
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 281, 1960);
        book.displayInfo();
    }
}
