public class Mage extends Hero{
    private static final int damage = 50;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy damagePoint) {
        int attack = damage * (int)(Math.random() * 2 + 1) ;
        System.out.println(getName() + " attacks with a spell - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }

    public void skill(Enemy damagePoint){
        int attack = damage * 5 * (int)(Math.random() * 2 + 1);
        System.out.println(getName() + " summons a meteor - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }
}
