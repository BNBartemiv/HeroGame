public class Dragon extends Enemy{
    private static final int damage = 50;

    public Dragon(int health){
        super(health);
    }

    @Override
    public void attackHero(Hero damagePoint) {
        int attack = damage;
        System.out.println("Dragon bites - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }
}
