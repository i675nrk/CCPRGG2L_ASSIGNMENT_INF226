public class Weapon {
    String name;
    String rarity;
    int damage;
    

    public void addDamage(int additionalDamage){
      int newDamage = damage + additionalDamage;
      System.out.println("Damage incresead from " + damage + " to " + newDamage);

      this.damage = newDamage;
}
     String showNameandRarity(){
        
        return this.name + " " + this.rarity;
    }
}