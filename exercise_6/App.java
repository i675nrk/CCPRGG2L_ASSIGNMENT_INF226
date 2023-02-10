public class App {
    public static void main(String[] args) throws Exception {
        

        // polymorphic variable
        // item in form of a junkfood
        GroceryItem item1 = new Junkfood();
        item1.name = "Cheetos";
        item1.price = 79;
        item1.showItemName();

        // item in form of a tequila
        GroceryItem item2 = new Tequila();
        item2.name = "Jose Cuervo";
        item2.price = 1000; 
        item2.showItemName();

        // Cashier Object
        Cashier c1 = new Cashier();

        // polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);
        c1.showItemPrice(item1);
        c1.showItemPrice(item2); 

        // Polymorphic Array
        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price + " PHP");

            totalAmount += totalAmount + itemArray[i].price;
    }
        System.out.println("Your total is: " + totalAmount);

        // Pet mypet = new Pet()
        Dog myDog = new Dog();
        myDog.eat();
    }
}
