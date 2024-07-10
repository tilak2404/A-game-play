package main.java;
import java.util.Random;
public class Battle {
    public static void battle(Player player1, Player player2) {
        Random random = new Random();

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            
            int r = random.nextInt(6) + 1;
            int Aattack = player1.getAttack() * r;


            
            int q = random.nextInt(6) + 1;
            int Bdamage = q * player2.getStrength();


            if (Bdamage > Aattack) {
                Aattack = 0;
            } else {
                player2.setHealth(player2.getHealth() - (Aattack - Bdamage));
            }

            if (player2.getHealth() <= 0) {

                System.out.println("Player B lost");
                break;
            } else {


                
                int v = random.nextInt(6) + 1;
                int Battack = player2.getAttack() * v;
                int u = random.nextInt(6) + 1;
                int Adamage = u * player1.getStrength();


                if (Adamage > Battack) {
                    Battack = 0;
                } else {
                    player1.setHealth(player1.getHealth() - (Battack - Adamage));
                }

                if (player1.getHealth() <= 0) {

                    System.out.println("Player A lost");
                    break;
                }


            }
        }

        System.out.println("Game Over");
    }
}
    
    