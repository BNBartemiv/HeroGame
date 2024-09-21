abstract class Enemy implements Mortal {
    protected int healthPoints;

    public Enemy(int health) {
        this.healthPoints = health;
    }

    public void setHealth(int health) {
        this.healthPoints = health;
    }

    void takeDamage(int damage){
        healthPoints -= damage;
        System.out.println("Damaged dealt - " + damage + ", Enemy health - " + this.healthPoints + "\n");
    }

    abstract public void attackHero(Hero damagePoint);

    public void revive(){

    }

    public boolean isAlive() {
        return this.healthPoints > 0;
    }

}
