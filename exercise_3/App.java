public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        Character Archer = new Character();
        Archer.name = "Loki";
        Archer.strength = 10;
        Archer.intelligence = 15;
        Archer.agility = 15;
        Archer.sayMyName();
        Archer.attack();

        Weapon Sword = new Weapon();
        Sword.name = "Laevateinn";
        Sword.rarity = "Mythic";
        Sword.damage = 15;
        System.out.println(Sword.showNameandRarity());
        Sword.addDamage(20);
        Sword.addDamage(15);




    }
}
