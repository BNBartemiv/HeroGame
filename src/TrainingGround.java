import java.util.Objects;
import java.util.Scanner;

public class TrainingGround {
    public static void main(String[] args) {

        String heroType;
        String enemyType;
        String skillType;
        Scanner scanner = new Scanner(System.in);
        Hero player = null;
        Enemy enemy = null;




            while (player == null) {
                System.out.println("Choose your hero:\n 1.Warrior\n 2.Archer\n 3.Mage\n Type a number: \n");
                heroType = scanner.nextLine();
                player = getHero(heroType);
                if (player == null)
                    System.out.println("This hero doesn't exist.\n");
            }

            System.out.println("Choose the enemy you want to fight:\n 1. Zombie\n 2. Vampire\n 3. Dragon\n Type a number: \n");
            enemyType = scanner.nextLine();
            enemy = getEnemy(enemyType);
            if (enemy == null)
                System.out.println("Sorry, i couldn't understand what you mean, so i picked Zombie.\n");



            while (enemy.isAlive() && player.isAlive()) {

                System.out.println("Chose an attack: \n 1.Normal attack\n 2.Powerful skill\n");
                skillType = scanner.nextLine();
                if(Objects.equals(skillType, "1"))
                player.attackEnemy(enemy);

                if(Objects.equals(skillType, "2"))
                player.skill(enemy);

                enemy.attackHero(player);

                if (enemy.healthPoints <= 0) {
                    if (enemyType.equals("Zombie")) {
                        enemy.revive();
                    } else break;
                }
            }
            System.out.println(player.isAlive() ? "Congratulations, you win" : "Your Hero died :(");
        }

        public static Hero getHero (String heroType){
            Hero hero;
            switch (heroType) {
                case "1":
                    hero = new Warrior("Laios", 100);
                    break;

                case "2":
                    hero = new Archer("Astarion", 80);
                    break;

                case "3":
                    hero = new Mage("Friren", 60);
                    break;
                default:
                    hero = null;
            }
            return hero;
        }

        public static Enemy getEnemy (String enemyType){
            Enemy enemy;
            switch (enemyType) {
                case "1":
                    enemy = new Zombie(100);
                    break;

                case "2":
                    enemy = new Vampire(80);
                    break;

                case "3":
                    enemy = new Dragon(200);
                    break;

                default:
                    enemy = new Zombie(100);
                    break;
            }
            return enemy;
        }
}