  public class App{
    public static void main(String[] args) throws Exception {
    System.out.println("Hello World!");
    
    Person Me = new Person("Sophia", 20); 
    Person Friend = new Person("Riki", 18);

    Me.addFriend(Friend);

    Pet Dog = new Pet("Maeumi", Friend);
    Dog.showOwner();

    Person Classmate1 = new Person("Juliann", 19);
    Person Classmate2 = new Person("Tati", 20);
    Person Classmate3 = new Person("AJ", 19);

   
    Me.addClassmate(Classmate1);
    Me.addClassmate(Classmate2);
    Me.addClassmate(Classmate3);

    Car Dodge = new Car("Jay", "Hellcat Redeye", Me);
    Dodge.showDriver();
 }
 
}
