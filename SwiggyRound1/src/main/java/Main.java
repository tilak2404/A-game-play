
package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create player1 object
        System.out.println("Enter health for player1:");
        int player1Health = scanner.nextInt();
        System.out.println("Enter strength for player1:");
        int player1Strength = scanner.nextInt();
        System.out.println("Enter attack for player1:");
        int player1Attack = scanner.nextInt();
        Player player1 = new Player(player1Health, player1Strength, player1Attack);

        // Create player2 object
        System.out.println("Enter health for player2:");
        int player2Health = scanner.nextInt();
        System.out.println("Enter strength for player2:");
        int player2Strength = scanner.nextInt();
        System.out.println("Enter attack for player2:");
        int player2Attack = scanner.nextInt();
        Player player2 = new Player(player2Health, player2Strength, player2Attack);
        scanner.close();
        Battle.battle(player1, player2);
    }
}
