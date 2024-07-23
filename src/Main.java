import java.util.Random;
public class Main {

    public static void main(String[] args){
      System.out.println("Welcome to the Endless Dungeon!");

        Random generator = new Random();

        int playerHealth, enemyHealth;
        playerHealth = 100;
        enemyHealth = generator.nextInt(10) + 1;
        int playerDamage, enemyDamage;

        int enemiesDefeated = 0;
        while(playerHealth > 0){
            if(enemyHealth <= 0) {
                System.out.println(
                        "You have defeated the enemy! You kick down the door to the next room and prepare " +
                                "yourself to fight the next enemy.");
                enemiesDefeated++;
                enemyHealth = generator.nextInt(10) + 1;
            }
            System.out.println("You have " + playerHealth + " health.");

            playerDamage = generator.nextInt(5) + 1;
            enemyDamage = generator.nextInt(3) + 1;

            playerHealth -= enemyDamage;
            enemyHealth -= playerDamage;

            System.out.println("You attack the enemy for " + playerDamage);
            System.out.println("The enemy attacks you for " + enemyDamage);

        }
        System.out.println("Game Over! You defeated " + enemiesDefeated + " enemies");
    }
    }
