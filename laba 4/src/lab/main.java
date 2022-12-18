package lab;

public class main {
    public static void main (String args[])
    {
        Book b = new Book("Kolobok", "Kate", 200);
        Journal j = new Journal("Vogue", 500);
        j.getPrice();
        b.getPrice();
    }
}
