public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;
    int damage;
    int additionalDamage;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }

        public void attack(){
            System.out.println("I am attacking ");
    }
}