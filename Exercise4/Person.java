public class Person {
    String name;
    int age;

    Person(String personName, int personAge){
        this.age = personAge;
        this.name = personName;
    }

    void addFriend (Person Friend) {
        System.out.println("I am friends with " + Friend.name);
    }

    void addClassmate (Person Classmate1) {
        System.out.println("I am classmates with " + Classmate1.name);
    }
   
    }

