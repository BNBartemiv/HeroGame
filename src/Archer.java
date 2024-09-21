public class Archer extends Hero{
    private static final int damage = 40;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy damagePoint) {
        int attack = damage * (int)(Math.random() * 2 + 1) ;
        System.out.println(getName() + " shoots an arrow - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }

    public void skill(Enemy damagePoint){
        int attack = damage * 4 * (int)(Math.random() * 2 + 1);
        System.out.println(getName() + " headshots the enemy - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }
}
