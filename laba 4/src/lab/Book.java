package lab;

class Book implements Priceable{
    String name;
    String author;
    int price;
    int year;
    Book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Книга стоит примерно " + price + "+-" + price*0.3);
    }
}
