package Rohan;
public class HelloWorld {
    // A field (variable)
    private String message;

    // Constructor
    public HelloWorld(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println(message);
    }

    // Main method to run the program
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld("Hello, World!");
        hello.displayMessage();
    }
}