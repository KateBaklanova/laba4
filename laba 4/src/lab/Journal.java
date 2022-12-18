package lab;

public class Journal {
        private String name;
        private int price;

        String getName(){
            return name;
        }

        Journal(String name, int price){

            this.name = name;
            this.price = price;
        }

         public void getPrice() {
             System.out.println("Журнал стоит примерно " + price + "+-" + price*0.5);
        }
}
