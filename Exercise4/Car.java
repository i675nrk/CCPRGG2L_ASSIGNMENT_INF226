public class Car {
    String cName;
    String cModel;
    Person cOwner;

    Car (String carName, String carModel, Person driver){
        this.cName = carName;
        this.cModel = carModel;
        this.cOwner = driver;
    }

    void showDriver() {
        System.out.println("I am a " + this.cModel + ". My car name is " + this.cName + ". My owner is " + cOwner.name);
    }
}      
