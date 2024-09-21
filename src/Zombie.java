public class Zombie extends Enemy{
    private static final int damage = 10;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void attackHero(Hero damagePoint) {
        int attack = damage * (int)(Math.random() * 2 + 1) ;
        System.out.println("Zombie bites - " + attack + " damage");
        damagePoint.takeDamage(attack);
    }

    @Override
    public void revive() {

            System.out.println("Zombie is trying to revive!\n");

            if (Math.random() * 100 >= 60) {
                System.out.println("Zombie is back into fighting!\n");
                setHealth(50);
            }
            else {
                System.out.println("Zombie failed to revive!\n");
                setHealth(0);
            }
        }
    }
