abstract public class Hero implements Mortal{
    protected final String name;
    protected int health;

    public Hero(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void attackEnemy(Enemy damagePoint);

    abstract public void skill(Enemy damagePoint);

    void takeDamage(int damage){
        this.health -= damage;
        System.out.println("Damage dealt - " + damage + ", Hero health - " + health + "\n");
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
