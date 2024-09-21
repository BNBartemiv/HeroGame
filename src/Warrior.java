public class Warrior extends Hero {
    private static final int damage = 30;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy damagePoint) {
        int attack = damage * (int)(Math.random() * 2 + 1) ;
        System.out.println(getName() + " attacks with a sword - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }

    public void skill(Enemy damagePoint){
        int attack = damage * 3 * (int)(Math.random() * 2 + 1);
        System.out.println(getName() + " uses a powerful slash attack - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }
}

