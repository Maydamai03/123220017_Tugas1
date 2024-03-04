/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Game;

/**
 *
 * @author ASUS
 */
public class GameMain {
    public static void main(String[] args) {
        try {
            Fighter fighter = new Fighter("Alukerad (Fighter)", 100);
            Mage mage = new Mage("Kaguya (Mage)", 80);
            Marksman marksman = new Marksman("Lesti (MM)", 90);

            Character[] characters = {fighter, mage, marksman};

            for (Character character : characters) {
                System.out.println("Name: " + character.getName());
                System.out.println("Health: " + character.getHealth());

                try {
                    character.basicAttack();
                    character.specialAttack();
                    character.ultimateAttack();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println("---------------");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

