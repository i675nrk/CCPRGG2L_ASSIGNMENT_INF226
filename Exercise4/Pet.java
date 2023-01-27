public class Pet {
    String name;
    Person Owner;

    Pet(String petName, Person ownerName) {
        this.name = petName;
        this.Owner = ownerName;

    }

    void showOwner(){
        System.out.println("My name is " + this.name + " , My owner is " + Owner.name);
    }
}
