public class Vampire extends Enemy{
    private static final int damage = 10;

    public Vampire(int health){
        super(health);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void attackHero(Hero damagePoint) {
        int attack = damage * (int)(Math.random() * 2 + 1) ;
        System.out.println("Vampire bites - " + attack + " damage");
        damagePoint.takeDamage(attack);
        if (Math.random() * 100 >= 30){
            int heal = healthPoints + 20;
            System.out.println("Vampire healed to: " + heal + "/n");
            setHealth(heal);
        }
    }
}
